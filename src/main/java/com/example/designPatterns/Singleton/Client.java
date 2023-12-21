package com.example.designPatterns.Singleton;

public class Client {
    public static void main(String[] args){
        DbConnection dbConnection = DbConnection.getConnection();
        System.out.println("Created connection object once");
        DbConnection dbConnection2 = DbConnection.getConnection();
        System.out.println("Created connection object twice");
    }
}
