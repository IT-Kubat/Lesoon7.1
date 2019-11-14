package com.company.Lesson7.animals;

public class Cow extends Animal {
    private String name;

    @Override
    public void makeVoice(int number) {
        for (int i = 0; i <number ; i++) {
            System.out.println("Muuu");

        }

    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC04");

    }

    @Override
    public void draw(String color) {

    }

    @Override
    public void draw3D(String material) {
        System.out.println("Изобразим корову" + material);

    }

    @Override
    public int move(int distance) {
        return 40;
    }
}
