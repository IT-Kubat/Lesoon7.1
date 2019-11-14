package com.company.Lesson7.animals;

public class Dog extends Animal {
    private String name;

    @Override
    public void makeVoice(int number) {
        for (int i = 0; i <number ; i++) {
            System.out.println("Gav");

        }

    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC36");
    }

    @Override
    public void draw(String color) {

    }

    @Override
    public void draw3D(String material) {
        System.out.println("Изобразим собаку" + material);

    }

    @Override
    public int move(int distance) {
        return 20;
    }
}
