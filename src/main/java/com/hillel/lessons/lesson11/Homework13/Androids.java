package com.hillel.lessons.lesson11.Homework13;

public class Androids extends Characteristics implements Smartphones, LinuxOS {

    public Androids(String name, String system, double versionSystem) {
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
    public void getOperatingSystemAndroid() {
        System.out.println("На " + name + " установлена операционная система " + system);
    }

    @Override
    public void getOperatingVersionAndroid() {
        System.out.println("Версия операционной системы " + system + " - " + versionSystem);
    }
}
