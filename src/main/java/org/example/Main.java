package org.example;
//ЗАДАНИЕ
//1.Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
// (например, в миске 10 еды, а кот пытается покушать 15-20).

//2.Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
// Если коту удалось покушать (хватило еды), сытость = true.
// Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
// то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

//3.Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
// потом вывести информацию о сытости котов в консоль.

//4.Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Cat cat1 = new Cat("Persik", 50);
        Cat cat2 = new Cat("Kot", 10);
        Cat cat3 = new Cat("Myrka", 14);
        Cat cat4 = new Cat("Vaska", 16);
        Cat cat5 = new Cat("Eva", 33);
        Cat cat6 = new Cat("Tima", 25);
        Cat cat7 = new Cat("Marfa", 1);
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);

        Plate plate = new Plate(100);
        plate.info();
        cat.info();
        System.out.println(cat.getAppetite());
        cat.eat(plate.getFood());
        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
        plate.AddEat();
        plate.info();
        FeedingAnimals(cats,plate.getFood());
    }
    public static void FeedingAnimals (ArrayList<Cat> cats1, int food1 ){
        for (Cat cat:cats1) {
            cat.eat(food1);
            if (food1 >= cat.getAppetite()){
                food1 = food1 - cat.getAppetite();
            }
//            System.out.println(food1);
        }
    }
}