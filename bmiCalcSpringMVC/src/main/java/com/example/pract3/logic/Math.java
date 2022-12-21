package com.example.pract3.logic;

import com.example.pract3.model.Bmi;

public class Math {

    public float calcBmi(Bmi bmi) {
        float res = bmi.getWeight() / ( bmi.getHeight() * bmi.getHeight()) * 10000;
        return java.lang.Math.round(res);
    }


}
