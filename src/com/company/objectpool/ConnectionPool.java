package com.company.objectpool;

public class ConnectionPool extends ObjectPoolPattern<Connection>{
    @Override
    protected Connection build() {
        return new Connection();
    }
}
