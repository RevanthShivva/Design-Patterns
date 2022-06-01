package com.company.proxydesignPatterm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        username=scanner.next();
        password=scanner.next();
        AdminProxy adminProxy = new AdminProxy(username,password);
        adminProxy.getListStudents();
    }
}
