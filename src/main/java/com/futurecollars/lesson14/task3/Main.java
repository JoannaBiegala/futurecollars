package com.futurecollars.lesson14.task3;

public class Main {

    public static void main(String[] args) {
        String[] urls = new String[]{"http://www.onet.pl", "https://mail.google.com", "http://wiadmosci.onet.pl", "http://onet.pl"};
        URLValidator urlValidator = new URLValidator(urls);
        urlValidator.validateURLs();
    }

}
