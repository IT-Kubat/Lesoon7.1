package com.company.Lesson7.animals;

public class Elephant extends Animal {
    private String country;

    @Override
    public void makeVoice(int number) {
        for (int i = 0; i <number ; i++) {
            System.out.println("Uuuu");

        }

    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC18");

    }

    @Override
    public void draw(String color) {

    }

    @Override
    public void draw3D(String material) {
        System.out.println("Изобразим слона" + material);


    }

    @Override
    public int move(int distance) {
        return 60;
    }
}
