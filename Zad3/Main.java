package Zad3;

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String choice;
        HttpKanyeWest.getQuoteFromKanyeWest();

        while (true) {
            choice = scanner.nextLine();
            if (choice.equals("next")) {
                HttpKanyeWest.getQuoteFromKanyeWest();
            } else {
                break;
            }
        }
    }
}