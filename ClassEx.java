package com.company.TaskDay5;

import java.util.Scanner;

public class ClassEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCheck = scanner.nextInt();


        switch ((numCheck > 0 && numCheck < 99) ? 1 : (numCheck > 90 && numCheck < 180) ? 2 : (numCheck > 180 && numCheck < 270) ? 3 : 10) {
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
