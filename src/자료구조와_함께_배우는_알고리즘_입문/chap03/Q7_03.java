package 자료구조와_함께_배우는_알고리즘_입문.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7_03 {

    static class PhyscData {
        private  String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> VISION_OREDER =
                new VisionOrder();

        private static class VisionOrder implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return  o1.vision > o2.vision ? 1 :
                        (o1.vision < o2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하" , 162 , 0.3),
                new PhyscData("이수연" , 168 , 0.4),
                new PhyscData("김민하" , 163 , 0.5),
                new PhyscData("이민하" , 164 , 0.6),
                new PhyscData("정민하" , 165 , 0.7),
                new PhyscData("박민하" , 166 , 0.8),
                new PhyscData("하민하" , 167 , 0.9),
                new PhyscData("상민하" , 169 , 1.0),
                new PhyscData("양민하" , 170 , 1.1),
                new PhyscData("임민하" , 171 , 1.2),
                new PhyscData("장민하" , 172 , 1.3),
        };

        System.out.println("시력이 몇 인 사람을 찾고 있나요? : ");
        double vision = s.nextDouble();
        int idx = Arrays.binarySearch(x , new PhyscData("",0, vision) , PhyscData.VISION_OREDER);

        if(idx < 0) {
            System.out.println("그런 사람 없습니다.");
        }else {
            System.out.println("그 값은 x["+idx+"]에 있습니다.");
            System.out.println("찾은 데이터 : "+x[idx]);
        }
    }

}
