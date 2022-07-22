package com.futurecollars.lesson15.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private final static String HOSTNAME = "localhost";
    private final static int PORT = 8080;

    public static void main(String[] args) throws IOException {
        try (Socket clientSocket = new Socket(HOSTNAME, PORT);
             InputStreamReader inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            System.out.println("Connected to " + HOSTNAME + " on port " + PORT);
            String data = "9,4,8\n5,7";
            System.out.println("Client is sending to the server:\n" + data);
            printWriter.println(data);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Client received: " + line);
            }
        }
    }

}
