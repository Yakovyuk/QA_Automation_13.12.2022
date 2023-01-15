package com.hillel.lessons.lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {

        int[] firstTeam = new int[25];
        int[] secondTeam = new int[firstTeam.length];

        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = 18 + (int) (Math.random() * 23);
            secondTeam[i] = 18 + (int) (Math.random() * 23);
        }


        System.out.print("Возраст игроков первой команды: ");
        for (int i = 0; i < firstTeam.length; i++) {
            if (firstTeam.length - 1 == i) {
                System.out.print(firstTeam[i] + ". ");
            } else {
                System.out.print(firstTeam[i] + ", ");
            }
        }

        System.out.println();
        System.out.print("Возраст игроков второй команды: ");
        for (int i = 0; i < secondTeam.length; i++) {
            if (firstTeam.length - 1 == i) {
                System.out.print(secondTeam[i] + ". ");
            } else {
                System.out.print(secondTeam[i] + ", ");
            }
        }

        int firstTeamSumAge = 0;
        for (int value : firstTeam) {
            firstTeamSumAge = firstTeamSumAge + value;
        }

        double firstTeamAverageAge = (double) firstTeamSumAge / firstTeam.length;
        System.out.println();
        System.out.println("Средний возраст игроков первой команды " + firstTeamAverageAge);

        int secondTeamSumAge = 0;
        for (int value : secondTeam) {
            secondTeamSumAge = secondTeamSumAge + value;
        }


        double secondTeamAverageAge = (double) secondTeamSumAge / secondTeam.length;
        System.out.println("Средний возраст игроков второй команды " + secondTeamAverageAge);
    }
}
