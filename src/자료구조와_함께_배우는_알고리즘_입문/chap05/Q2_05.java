package 자료구조와_함께_배우는_알고리즘_입문.chap05;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Q2_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요. : ");
        int x = scanner.nextInt();
        System.out.print("정수를 입력하세요. : ");
        int y = scanner.nextInt();

        int max = Math.max(x , y);
        int min = Math.min(x , y);
        int a = 2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        boolean tf = false;

        while (tf == false) {
            for(int i = 2; i <= min; i++) {
                if(max % i == 0 && min % i == 0) {
                    arrayList.add(i);
                    max = max / i;
                    min = min / i;
                    break;
                }
                if(i == min) {
                    tf = true;
                    break;
                }
            }
            if(min <= 1){
                break;
            }
        }
        int sum = 1;

        if(arrayList.size() > 0) {
            for(int i = 0; i < arrayList.size(); i++) {
                sum = sum * arrayList.get(i);
            }
        }else {
            sum = 0;
        }

        System.out.println("최대공약수는 " + sum +"입니다.");

    }
}
