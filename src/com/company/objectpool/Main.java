package com.company.objectpool;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        HashSet<Connection> readyToUse = new HashSet<>();
        Connection connection1 = connectionPool.build();
        Connection connection2 = connectionPool.build();
        Connection connection3 = connectionPool.build();
        readyToUse.add(connection1);
        readyToUse.add(connection2);
        readyToUse.add(connection3);
        connectionPool.setReadyToUse(readyToUse);
        Connection instance1 = connectionPool.giveAway();
        instance1.setConnectionName("Customer Data Base");
        System.out.println(instance1.toString());
        Connection instance2 = connectionPool.giveAway();
        instance2.setConnectionName("Student Data base");
        System.out.println(instance2.toString());
        Connection instance3 = connectionPool.giveAway();
        instance3.setConnectionName("College Data Base");
        System.out.println(instance3.toString());
        connectionPool.bringIn(instance1);
        connectionPool.bringIn(instance2);
        connectionPool.bringIn(instance3);
        Connection instance4 = connectionPool.giveAway();

    }
}
