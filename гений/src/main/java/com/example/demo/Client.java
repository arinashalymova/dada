package com.example.demo;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);

            // Далее можно работать с сокетом, отправлять и принимать данные

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}