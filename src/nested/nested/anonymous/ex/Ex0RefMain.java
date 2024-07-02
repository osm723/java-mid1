package nested.nested.anonymous.ex;

public class Ex0RefMain {
    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("프로그램 helloJava");
        System.out.println("프로그램 종료");
    }

    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("프로그램 helloSpring");
        System.out.println("프로그램 종료");
    }

    public static void hello(String name) {
        System.out.println("프로그램 시작");
        System.out.println("프로그램 " + name);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("helloJava");
        hello("helloSpring");
    }
}
