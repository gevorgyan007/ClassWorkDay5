package com.company.TaskDay5;

import java.util.Scanner;

public class ClassEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCheck = scanner.nextInt();

        int numCh = (numCheck +45)/45;

        switch (numCh) {
            case 1:
                System.out.println("(0,90)");
                break;
            case 2:
                System.out.println("(90,180)");
                break;
            case 3:
                System.out.println("(180,270)");
                break;
            default:
                System.out.println("wrong range");
        }
    }
}
