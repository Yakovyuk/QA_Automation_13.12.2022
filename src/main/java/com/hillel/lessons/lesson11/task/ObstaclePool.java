package com.hillel.lessons.lesson11.task;

public class ObstaclePool implements Obstacle{
    @Override
    public void start(Participant participant) {
        participant.swim();
    }
}
