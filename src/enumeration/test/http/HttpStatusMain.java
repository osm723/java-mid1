package enumeration.test.http;

import enumeration.test.AuthGrade;

import java.util.Scanner;

public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HTTP CODE : ");
        int code = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(code);

        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode());
            System.out.println(status.getMessage());
            System.out.println(status.isSuccess());
        }
    }
}
