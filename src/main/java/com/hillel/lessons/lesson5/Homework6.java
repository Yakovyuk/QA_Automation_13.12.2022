package com.hillel.lessons.lesson5;

import java.util.Scanner;
public class Homework6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи назву першої команди");
        String firstTeamName = scanner.nextLine();

        System.out.println("Введи кількість фрагів для 5-ти гравців першої команди");


        System.out.println("Кількість фрагів першого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int firstTeamPlayer1 = scanner.nextInt();

        System.out.println("Кількість фрагів другого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int firstTeamPlayer2 = scanner.nextInt();

        System.out.println("Кількість фрагів третього гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int firstTeamPlayer3 = scanner.nextInt();

        System.out.println("Кількість фрагів четвертого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int firstTeamPlayer4 = scanner.nextInt();

        System.out.println("Кількість фрагів п'ятого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int firstTeamPlayer5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введи назву другої команди");
        String secondTeamName = scanner.nextLine();

        System.out.println("Введи кількість фрагів для 5-ти гравців другої команди");

        System.out.println("Кількість фрагів першого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int secondTeamPlayer1 = scanner.nextInt();

        System.out.println("Кількість фрагів другого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int secondTeamPlayer2 = scanner.nextInt();

        System.out.println("Кількість фрагів третього гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int secondTeamPlayer3 = scanner.nextInt();

        System.out.println("Кількість фрагів четвертого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int secondTeamPlayer4 = scanner.nextInt();

        System.out.println("Кількість фрагів п'ятого гравця");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        int secondTeamPlayer5 = scanner.nextInt();

        double firstTeamAverageKills = (firstTeamPlayer1 + firstTeamPlayer2 + firstTeamPlayer3 + firstTeamPlayer4 + firstTeamPlayer5) / 5.0;
        double secondTeamAverageKills = (secondTeamPlayer1 + secondTeamPlayer2 + secondTeamPlayer3 + secondTeamPlayer4 + secondTeamPlayer5) / 5.0;

        int firstTeamTotalKills = firstTeamPlayer1 + firstTeamPlayer2 + firstTeamPlayer3 + firstTeamPlayer4 + firstTeamPlayer5;
        int secondTeamTotalKills = secondTeamPlayer1 + secondTeamPlayer2 + secondTeamPlayer3 + secondTeamPlayer4 + secondTeamPlayer5;

        if(firstTeamAverageKills > secondTeamAverageKills) {
            System.out.println("Перемогла команда " + firstTeamName + " набрала " + firstTeamTotalKills + " очків ");
        } else if(firstTeamAverageKills < secondTeamAverageKills) {
            System.out.println("Перемогла команда " + secondTeamName + " набрала " + secondTeamTotalKills + " очків ");
        } else {
            System.out.println("Рахунок обох команд рівний");
        }

    }
}
