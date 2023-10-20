package org.example;

import java.util.Random;

public class Cat {

    private String name;

    private boolean satiety;

    private int appetite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public void info() {
        System.out.println("Кот по кличке " + name + " с аппетитом = " + appetite);
    }
    public void eat(int food) {
        if (food >= appetite){
            satiety = true;
            System.out.println("Кот " + name + " поел и сыт.");
        }else {
            System.out.println("Кот " + name + " голоден, потому что в чашке мало еды");
        }

    }


}
