package nested.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }

//    static class Dice implements Process {
//        @Override
//        public void run() {
//            int randomValue = new Random().nextInt(6) + 1;
//            System.out.println("randomValue = " + randomValue);
//        }
//    }
//
//    static class Sum implements Process {
//        @Override
//        public void run() {
//            for (int i = 0; i < 3; i++) {
//                System.out.println("i = " + i);
//            }
//        }
//    }
}
