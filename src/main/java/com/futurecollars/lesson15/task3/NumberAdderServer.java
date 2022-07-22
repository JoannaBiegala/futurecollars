package com.futurecollars.lesson15.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NumberAdderServer {
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
                    int sum = 0;
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println("Server received: " + line);
                        String[] tokens = line.split(",");
                        for (String token : tokens) {
                            int parsed = Integer.parseInt(token);
                            sum = sum + parsed;
                        }
                        System.out.println("Sending to Client: " + sum);
                        printWriter.println(sum);
                        run = false;
                   }
                }
            }
        }
    }
}
