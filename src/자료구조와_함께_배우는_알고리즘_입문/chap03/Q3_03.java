package 자료구조와_함께_배우는_알고리즘_입문.chap03;

import java.util.Arrays;

public class Q3_03 {

    public static void main(String[] args) {
        int[] a = {1, 9, 2, 9, 4, 6, 7, 9};
        int[] idx = new int[3];
        System.out.println(searchIdx(a , a.length , 9 , idx));
        for (int i : idx) {
            System.out.print(i+ " ");
        }

    }

    static int searchIdx(int[] a , int n , int key , int[] idx) {

        int b = 0;
        for(int i = 0; i < n; i++) {

            if(key == a[i]) {
                idx[b++] = i;
            }

        }

        return b;

    }
}
