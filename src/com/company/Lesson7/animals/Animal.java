package com.company.Lesson7.animals;

//import com.company.Drawable;
import com.company.Lesson7.general.Drawable;
import com.company.Lesson7.general.Movable;
//import com.company.Movable;

public abstract class Animal implements Drawable, Movable {
    private String color;
    private char gender;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void makeVoice(int number);




}
