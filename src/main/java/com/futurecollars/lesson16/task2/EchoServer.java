package com.futurecollars.lesson16.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    private final static int PORT = 8080;

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Listening on port " + PORT);
            boolean run = true;

            while (run) {
                try (Socket socket = serverSocket.accept();
                     InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                     BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                     PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true)
                ) {
                    System.out.println("Connection accepted");
                    String line;
                    String upperCaseLine;
                    while ((line = bufferedReader.readLine()) != null) {
                        upperCaseLine = line.toUpperCase();
                        System.out.println("Server received: " + line + ". Sending to Client: " + upperCaseLine);
                        printWriter.println(upperCaseLine);
                    }
                    run = false;
                }
            }
        }
    }

}
