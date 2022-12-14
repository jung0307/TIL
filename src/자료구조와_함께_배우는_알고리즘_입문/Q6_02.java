package 자료구조와_함께_배우는_알고리즘_입문;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_02 {

    public static void main(String[] args) {

        solution();

    }

    public static void solution() {

        int x;
        int r;
        int a = 0;
        char[] d = new char[32];
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTOVWXYZ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("10진수를 기수로 변환합니다.");

        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            x = scanner.nextInt();
        }while (x < 0);

        do {
            System.out.print("어떤 진수로 변환할까요? (2~36) : ");
            r = scanner.nextInt();
        }while (!(r >= 2 && r <= 32));

        System.out.println(r +"|        "+x);
        System.out.println(" + ---------");

        while (true) {

            d[a] = dchar.charAt(x%r);
            int v = x%r;
            x = x/r;
            System.out.println(r +"|        "+ x + " --- " + v );

            a++;

            if(x == 0) {
                break;
            }

            System.out.println(" + ---------");

        }

        String aa = "";

        System.out.println(Arrays.toString(d));

        for(int j = 0; j < a/2; j++){

//            System.out.print("처음 " +d[j]);
//            System.out.print("처음 " +d[a - j - 1] +"\n");

            char temp = d[j];
            d[j] = d[a - 1- j];
            d[a - 1 - j] = temp;

//            System.out.print("스왑 후 " +d[j]);
//            System.out.print("스왑 후 " +d[a- j -1] +"\n");

        }

        for(int j = 0; j < a; j++){
            aa = aa + String.valueOf(d[j]);
        }

        System.out.println(r+"진수로 "+ aa+"입니다.");
    }

}
