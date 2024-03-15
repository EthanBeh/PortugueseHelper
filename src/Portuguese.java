import java.util.Scanner;
public class Portuguese {
    final Scanner s = new Scanner(System.in);
    String lang = null;
    public Portuguese() {
        start();
    }

    public void start() {
        System.out.print("ESCOLHA A LÍNGUA/PICK YOUR LANGUAGE (pt/en): ");
        lang = s.nextLine();
        while (!lang.toLowerCase().equals("pt") && !lang.toLowerCase().equals("en")) {
            System.out.print("Isso não é uma opção, pede-lhe de escolher de novo/That's not an option, please try again: ");
            lang = s.nextLine();
        }
        if (lang.toLowerCase().equals("pt")) {
            System.out.println("Olá, bem-vindo/a ao assistente gramático do português");
            lang = "p";
        } else {
            System.out.println("Hello, welcome to the portuguese grammar helper");
            lang = "e";
        }
        choice();
    }

    public void choice() {
        if (lang.equals("p")) {
            System.out.println("Com que quer ajuda? substa(n)tivos ou (v)erbos?");
            String str = s.nextLine();
            while (!str.toLowerCase().equals("n") && !str.toLowerCase().equals("v")) {
                System.out.print("Por favor tecle \"n\" ou \"v\": ");
                str = s.nextLine();
            }
            if (str.toLowerCase().equals("n")) {
                System.out.println("Escolha um substantivo da liste por favor: ");
            } else {
                System.out.println("Escolha um verbo da liste por favor: ");
            }
        } else {
            System.out.println("What would you like help with? (n)ouns or (v)erbs");
            String str = s.nextLine();
            while (!str.toLowerCase().equals("n") && !str.toLowerCase().equals("v")) {
                System.out.print("Please input \"n\" or \"v\": ");
                str = s.nextLine();
            }
            if (str.toLowerCase().equals("n")) {
                System.out.println("Please pick a noun from the list: ");
            } else {
                System.out.println("Please pick a verb from the list: ");
            }
        }
    }
}
