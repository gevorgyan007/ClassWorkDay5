package com.company.TaskDay5;

import java.util.Scanner;

public class ClassEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCheck = scanner.nextInt();



        switch ((numCheck > 0 && numCheck<45) ? 1:(numCheck > 45 && numCheck<90)? 2:(numCheck > 90 && numCheck<135)?3:10) {
            case 1:
                System.out.println("(0,45)");
                break;
            case 2:
                System.out.println("(45,90)");
                break;
            case 3:
                System.out.println("(90,135)");
                break;
            default:
                System.out.printf("wrong range");
        }

    }
}
