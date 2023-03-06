package 자료구조와_함께_배우는_알고리즘_입문.chap04;

import java.util.Scanner;

public class Q1_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n" , stack.size() , stack.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 클리어 " +
                    "(6) 인덱스 구하기 (7) 용량 반환 (8) 비어 있는가? (9) 가득 찼는가? (0) 종료 : ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {

                case 1:
                    System.out.println("데이터 ");
                    x = sc.nextInt();
                    try {
                        stack.push(x);
                    }catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = stack.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = stack.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    stack.dump();
                    break;

                case 5:
                    stack.claer();
                    break;

                case 6:
                    System.out.print("찾고 싶은 원소를 입력하세요.");
                    int a = sc.nextInt();
                    if(stack.indexOf(a) == -1) {
                        System.out.println("찾으신 원소는 스택에 없습니다.");
                    }else{
                        System.out.println(stack.indexOf(a));
                    }
                    break;

                case 7:
                    System.out.println(stack.getCapacity());
                    break;

                case 8:
                    if(stack.isEmpty()) {
                        System.out.println("스택이 비어 있습니다.");
                    }else{
                        System.out.println("스택이 비어 있지 않습니다.");
                    }
                    break;

                case 9:
                    if(stack.isFull()) {
                        System.out.println("스택이 가득 찼습니다.");
                    }else{
                        System.out.println("스택이 가득 차지 않았습니다.");
                    }
                    break;
            }
        }
    }
}
