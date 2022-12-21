package com.example.pract3.logic;

import com.example.pract3.model.Bmi;

import java.util.List;

public class Metrics {

    private List<String> list = null;
    private Bmi bmi = null;
    private String message; // сообщение от категории
    private int categories; // определенная категория
    private Math math;
    private Parse parse;

//    public boolean findData() {
//        parse = new Parse();
//        bmi = new Bmi();
//        math = new Math();
//
//        list = parse.parseFileToList();
//
//
//        float bmi_diap = math.calcBmi(bmi);
//
//        if (bmi_diap > bmi.getWeight() && bmi_diap < bmi.getHeight()){
//            return true;
//        }
//        return false;
//    }


}
