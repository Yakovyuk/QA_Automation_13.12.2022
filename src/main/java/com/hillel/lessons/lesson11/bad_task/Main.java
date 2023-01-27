package com.hillel.lessons.lesson11.bad_task;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("cat1");
        Dog dog = new Dog("dog1");
        Parrot parrot = new Parrot("parrot1");

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();


        obstaclePool.start(cat);
        obstaclePool.start(dog);
        obstaclePool.start(parrot);

        obstacleWall.start(cat);
        obstacleWall.start(dog);
        obstacleWall.start(parrot);
    }


}
