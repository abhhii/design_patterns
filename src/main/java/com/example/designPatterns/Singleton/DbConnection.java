package com.example.designPatterns.Singleton;

import java.util.Objects;

public class DbConnection {
    private static volatile DbConnection dbConnection = null;

    private DbConnection(){}

    public static DbConnection getConnection(){

        if(Objects.isNull(dbConnection)){
            synchronized (DbConnection.class){

                // checking again since if multiple threads are running another thread may have initialized the object
                if(Objects.isNull(dbConnection)){
                    System.out.println("Creating new connection object");
                    dbConnection = new DbConnection();
                }
            }
        }
        return dbConnection;

    }
}
