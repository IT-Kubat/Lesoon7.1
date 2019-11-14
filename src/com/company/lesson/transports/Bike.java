package com.company.lesson.transports;

//import com.company.Drawable;
import com.company.Lesson7.general.Drawable;
//import com.company.Transport;

public class Bike extends Transport implements Drawable {

    @Override
    public void draw() {
        System.out.println("\uD83D\uDEB2");
    }

    @Override
    public void draw(String color) {

    }

    @Override
    public void draw3D(String material) {
        System.out.println("Изобразим велосипед" + material);

    }
}
