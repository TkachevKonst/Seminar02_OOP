package org.example;

import java.util.Random;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food>10){this.food = food;}
        else this.food = 50;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
//    Метод добавелния еды в тарелку.
    public void AddEat(){
        this.food = new Random().nextInt(10,100);
    }


}
