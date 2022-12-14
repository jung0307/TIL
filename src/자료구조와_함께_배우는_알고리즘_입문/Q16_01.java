package 자료구조와_함께_배우는_알고리즘_입문;

import java.util.Scanner;

public class Q16_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        nspira(sc.nextInt());
    }

    static void nspira(int n){

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n-(i+1); j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++){
                System.out.print((i+1)%10);
            }
            for(int j = 0; j < n-(i+1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
