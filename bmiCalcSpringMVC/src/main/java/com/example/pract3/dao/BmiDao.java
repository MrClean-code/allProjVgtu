package com.example.pract3.dao;

import com.example.pract3.logic.Math;
import com.example.pract3.model.Bmi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BmiDao {

    private List<Float> resultList;
    private float result;
    private Math math;

    public List<Float> index() {
        return resultList;
    }

    public void save(Bmi bmi) {
        resultList = new ArrayList<>();
        math = new Math();

        result = math.calcBmi(bmi);

        resultList.add(result);
    }


}
