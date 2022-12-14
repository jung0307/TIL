package 자료구조와_함께_배우는_알고리즘_입문;

import java.util.Arrays;
import java.util.Random;

public class Q5_02 {

    public static void main(String[] args) {


        Random random = new Random();
        int a[] = new int[(random.nextInt(10) + 1)];
        int b[] = new int[a.length];
        for(int j = 0; j < a.length; j++){
            b[j] = random.nextInt(20);
        }

//        int a[] = {1 ,2 , 3 ,4 , 5};
//        int b[] = {6 , 7, 8, 9, 10};

        rcopy(a , b);

    }

    static void rcopy(int[] a , int[] b) {

        if(a.length >= b.length) {

            for(int i = 0; i < b.length; i++) {
                a[i] = b[i];
            }

        }else{

            for(int i = 0; i < a.length; i++) {
                a[i] = b[i];
            }
        }

        Q2_02.reverse(a);

        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
    }
}
