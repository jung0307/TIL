package 자료구조와_함께_배우는_알고리즘_입문;

import java.util.Scanner;

public class Q14_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        triangleRB(sc.nextInt());
//        triangleRU(sc.nextInt());
//        triangleLU(sc.nextInt());
        triangleLB(sc.nextInt());

    }

    // 오른쪽 아래가 직각인 이등변삼각형
    static void triangleRB(int n){

        for(int i = 0; i < n; i++){

            for(int j =0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 오른쪽 위가 직각인 이등변삼각형
    static void triangleRU(int n){

        for(int i = 0; i < n; i++){

            for(int j =n; j > i; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 왼쪽 위가 직각인 이등변삼각형
    static void triangleLU(int n){

        for(int i = 0; i < n; i++){

            for(int k =0; k < i; k++){
                System.out.print(" ");
            }

            for(int j =n; j > i; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 왼쪽 아래가 직각인 이등변삼각형
    static void triangleLB(int n){

        for(int i = 0; i < n; i++){

            for(int k =n-1; k > i; k--){
                System.out.print(" ");
            }

            for(int j =0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
