package com.hillel.lessons.lesson11.task;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("cat1");
        Dog dog = new Dog("dog1");
        Parrot parrot = new Parrot("parrot1");

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();


//        obstaclePool.start(cat);
//        obstaclePool.start(dog);
//        obstaclePool.start(parrot);
//
//        obstacleWall.start(cat);
//        obstacleWall.start(dog);
//        obstacleWall.start(parrot);

        Participant[] participants = {
                new Cat("cat1"),
                new Dog("dog1"),
                new Parrot("parrot1")
        };

        Obstacle[] obstacles = {
                new ObstaclePool(),
                new ObstacleWall()
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }
    }


}
