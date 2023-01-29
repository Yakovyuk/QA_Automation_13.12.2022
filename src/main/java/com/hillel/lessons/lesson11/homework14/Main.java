package com.hillel.lessons.lesson11.homework14;

public class Main {
    public static void main(String[] args) {

        UserPersonalInfo user1 = new UserPersonalInfo("Will ", "Smith", "23", "12", 2000, "willtest@gmail.com", "+2936729462846", 78.5, "128 / 86", 26003);
        UserPersonalInfo user2 = new UserPersonalInfo("Jackie ", "Chan", "03", "09", 1980, "jackietest2@gmail.com", "+12312412412", 85.3, "120 / 80", 46103);
        UserPersonalInfo user3 = new UserPersonalInfo("Sherlock ", "Holmes", "02", "01", 1971, "sherlocktest3@gmail.com", "+37742123513", 70.1, "140 / 90", 16203);

        user1.printAccountIfo();
        user2.printAccountIfo();
        user3.printAccountIfo();

        user1.surname = "Conor";
        user1.weight = 90.4;
        user1.stepsPerDay = 32103;

        user2.surname = "Robinson";
        user2.weight = 60.6;
        user2.stepsPerDay = 62103;

        user1.printAccountIfo();
        user2.printAccountIfo();
    }
}
