package nested.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void helloDice() {
        System.out.println("프로그램 시작");
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("randomValue = " + randomValue);
        System.out.println("프로그램 종료");
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("프로그램 종료");
    }

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
}
