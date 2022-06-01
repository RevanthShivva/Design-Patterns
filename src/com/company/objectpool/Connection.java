package com.company.objectpool;

public class Connection {
    private String connectionName;

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }


    @Override
    public String toString() {
        return "Connection{" +
                "connectionName='" + connectionName + '\'' +
                '}';
    }
}
