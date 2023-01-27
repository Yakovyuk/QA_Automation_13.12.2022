package com.hillel.lessons.lesson11.Homework12;

public class IPhones extends Characteristics implements Smartphones, IOS {

    public IPhones(String name, String system, double versionSystem) {
        this.name = name;
        this.system = system;
        this.versionSystem = versionSystem;
    }

    @Override
    public void call() {
        System.out.println(name + " может звонить");
    }

    @Override
    public void sms() {
        System.out.println(name + " может отправлять SMS");
    }

    @Override
    public void internet() {
        System.out.println(name + " может выходить в интернет");
    }

    @Override
    public void getOperatingSystemIOS() {
        System.out.println("На " + name + " установлена операционная система " + system);
    }

    @Override
    public void getOperatingVersionIOS() {
        System.out.println("Версия операционной системы " + system + " - " + versionSystem);
    }
}
