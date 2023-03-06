package 자료구조와_함께_배우는_알고리즘_입문.chap05;

import java.util.Scanner;

public class Q1_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        int sum = 1;
        for(int i = 1; i <= x; i++) {
            sum = sum * i;
        }

        System.out.println(x + "의 팩토리얼은 " + sum +"입니다.");
    }
}
