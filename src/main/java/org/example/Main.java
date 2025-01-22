package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj liczbę a: ");
            double a = scanner.nextDouble();

            System.out.print("Podaj liczbę b: ");
            double b = scanner.nextDouble();

            System.out.print("Wybierz operację matematyczną, którą chcesz wykonać ( +, -, *, / ): ");
            char operation = scanner.next().charAt(0);
            switch (operation) {
                case '+':
                    System.out.println("Wynik: " + (a + b));
                    break;
                case '-':
                    System.out.println("Wynik: " + (a - b));
                    break;
                case '*':
                    System.out.println("Wynik: " + (a * b));
                    break;
                case '/':
                    if(b == 0) {
                        System.out.println("Nie można dzielić przez zero!");
                    } else {
                        System.out.println("Wynik: " + (a / b));
                    }
                    break;
                default:
                    System.out.println("Wybierz poprawną operację matematyczną!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Podaj poprawny format liczby! ( Np. 2,1 lub 2 lub 2,123 )");
        }
    }
}