package com.company.statePattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();
        controller.assignState(str);
        controller.work();
    }
}
