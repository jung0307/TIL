package 자료구조와_함께_배우는_알고리즘_입문;

import java.util.Arrays;

public class Q4_02 {

    public static void main(String[] args) {

        int a[] = {1 ,2 , 3 ,4 , 5};
        int b[] = {6 , 7, 8, 9, 10};

        copy(a , b);

    }

    static void copy(int[] a , int[] b) {

        if(a.length >= b.length) {

            for(int i = 0; i < b.length; i++) {
                a[i] = b[i];
            }

        }else{

            for(int i = 0; i < a.length; i++) {
                a[i] = b[i];
            }
        }

        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
    }
}
