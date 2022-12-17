package 자료구조와_함께_배우는_알고리즘_입문.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q5_03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        System.out.print("요솟수 : ");
        int n = Integer.parseInt(br.readLine());

        int arrInt[] = new int[n];

        while (i < n){
            System.out.print(i +"번째 요소 : ");
            int m = Integer.parseInt(br.readLine());
            arrInt[i++] = m;
        }

        System.out.print("찾는 수 : ");
        int key = Integer.parseInt(br.readLine());

//        for(int a : arrInt) {
//            System.out.println(a);
//        }
        solution(arrInt , key);
    }

    static void solution(int[] arrInt , int key) {

        Arrays.sort(arrInt);

        int l = 0;
        int r = arrInt.length-1;
        int center = (r+l)/2;
        boolean tf = false;

        System.out.print("   |");
        for(int i = 0; i < arrInt.length; i++) {
            System.out.print("  "+i);
        }
        System.out.println();

        System.out.print("---+");
        for(int i = 0; i < arrInt.length; i++) {
            System.out.print("---");
        }
        System.out.println();

        System.out.print("   |");
        dup(r , l , center , key , arrInt);

        System.out.print("  "+ center +"|");

        for(int i = 0; i < arrInt.length; i++) {
            System.out.print("  "+arrInt[i]);
        }
        System.out.println();


        while (l <= r) {

            if(arrInt[center] < key) {
                System.out.println("   |");
                System.out.print("   |");

                l = center + 1;

                dup(r , l , center , key , arrInt);

                center = (r+l)/2;
                System.out.print("  "+ center +"|");

                for(int i = 0; i < arrInt.length; i++) {
                    System.out.print("  "+arrInt[i]);
                }
                System.out.println();


            }else if(arrInt[center] == key) {
                tf = true;
                if(center == 0){
                    break;
                }else{

                    while (true) {

                        if(arrInt[center] == arrInt[center-1]) {
                            center = center -1;
                        }else{
                            break;
                        }

                    }
                    break;
                }

            }else {
                System.out.println("   |");
                System.out.print("   |");

                r = center - 1;

                dup(r , l , center , key , arrInt);

                center = (r+l)/2;
                System.out.print("  "+ center +"|");

                for(int i = 0; i < arrInt.length; i++) {
                    System.out.print("  "+arrInt[i]);
                }
                System.out.println();


            }

        }

        if(tf == true) {
            System.out.println("\n"+key + "는 x["+center+"]에 있습니다.");
        }else{
            System.out.println("\n검색하신 수는 없습니다.");
        }

    }

    static void dup(int r , int l , int center , int key , int[] arrInt) {

        for (int i = 0; i <= r; i++) {

            if (i == l) {
                System.out.print(" <-");
            } else if (i == r) {
                System.out.print(" ->");
            } else if (i == (l + r) / 2) {
                System.out.print("  +");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }

}
