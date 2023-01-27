package com.hillel.lessons.lesson11.Homework13;

public class Main {

    public static void main(String[] args) {

        Androids androids = new Androids("Huawei p30","HarmonyOS", 12.01);
        IPhones IPhones = new IPhones("IPhone 11", "IOS", 14.0);

        androids.call();
        androids.sms();
        androids.internet();
        androids.getOperatingSystemAndroid();
        androids.getOperatingVersionAndroid();

        System.out.println();

        IPhones.call();
        IPhones.sms();
        IPhones.internet();
        IPhones.getOperatingSystemIOS();
        IPhones.getOperatingVersionIOS();

    }

}
