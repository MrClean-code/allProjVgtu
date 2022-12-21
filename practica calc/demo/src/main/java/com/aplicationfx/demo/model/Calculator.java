package com.aplicationfx.demo.model;

public class Calculator {
    private Double number;

    private Double percent;
    private Double temp;

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double calc() {
        temp = number * percent / 100;
        return temp;
    }
}
