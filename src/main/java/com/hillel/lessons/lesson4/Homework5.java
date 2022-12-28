package com.hillel.lessons.lesson4;

public class Homework5 {
    public static void main(String[] args) {

        int warriorAttackLi = 13;
        int archerAttackLi = 24;
        int riderAttackLi = 46;
        int totalPeopleEachTypeLi = 860;

        int warriorAttackMing = 9;
        int archerAttackMing = 35;
        int riderAttackMing = 12;
        double totalPeopleEachTypeMing = totalPeopleEachTypeLi * 1.5;

        int totalScoreAttackLi = warriorAttackLi * totalPeopleEachTypeLi + archerAttackLi * totalPeopleEachTypeLi + riderAttackLi * totalPeopleEachTypeLi;
        System.out.println("Li Dynasty total attack score " + totalScoreAttackLi);

        double totalScoreAttackMing = warriorAttackMing * totalPeopleEachTypeMing + archerAttackMing * totalPeopleEachTypeMing + riderAttackMing * totalPeopleEachTypeMing;
        System.out.println("Ming Dynasty total attack score " + (int) totalScoreAttackMing);

    }
}
