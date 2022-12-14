package 자료구조와_함께_배우는_알고리즘_입문;

import java.util.Arrays;

public class Q2_02 {

    public static void main(String[] args) {
        int a[] = {2,5,1,3,9,6,7};
        reverse(a);
    }

    public static void reverse(int[] a){

        for(int i = 0; i < a.length/2; i++){

            int idxFirst = a[i];
            int idxLast = a[a.length - 1 - i];
            int temp = 0;

            System.out.println(Arrays.toString(a));
            System.out.println("a["+i+"]과 a["+(a.length-1-i)+"]을 교환합니다");
            temp = idxFirst;
            idxFirst = idxLast;
            idxLast = temp;
            a[i] = idxFirst;
            a[a.length - 1 - i] = idxLast;
        }

        System.out.println(Arrays.toString(a));
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
