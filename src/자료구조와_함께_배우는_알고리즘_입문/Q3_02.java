package 자료구조와_함께_배우는_알고리즘_입문;

public class Q3_02 {

    public static void main(String[] args) {

        int a[] = {1 , 2, 3, 4, 5};
        System.out.println(sumOf(a));

    }

    static int sumOf(int[] a){

        int sum = 0;

        for(int i = 0; i < a.length; i++){

            sum = sum + a[i];

        }

        return sum;
    }

}
