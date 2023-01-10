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

        System.out.println("Возраст игроков первой команды");
        System.out.println(Arrays.toString(firstTeam));

        System.out.println();
        System.out.println("Возраст игроков второй команды");
        System.out.println(Arrays.toString(secondTeam));

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
        System.out.println();
        System.out.println("Средний возраст игроков второй команды " + secondTeamAverageAge);
    }
}
