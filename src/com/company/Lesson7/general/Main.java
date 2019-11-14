package com.company.Lesson7.general;

//import com.company.Movable;

import com.company.Lesson7.animals.Cow;
import com.company.Lesson7.animals.Dog;
import com.company.Lesson7.animals.Elephant;
import com.company.lesson.transports.Bike;

public class Main {

    public static void main(String[] args) {
        Drawable elephant = new Elephant();
        elephant.draw();
        Bike bike = new Bike();
        bike.draw();
        Drawable[] drawables = {
                elephant, bike, new Dog(), new Cow()
        };
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
            if (drawables[i] instanceof Movable) {
                System.out.println(((Movable) drawables[i]).move(i));
            }

        }
        complexDraw(bike);

    }

    public static void complexDraw(Drawable d){
    	d.draw();
    	d.draw("red");
    	d.draw3D ("Plastic");

	}
}
