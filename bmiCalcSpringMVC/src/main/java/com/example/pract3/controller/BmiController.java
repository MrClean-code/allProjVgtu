package com.example.pract3.controller;

import com.example.pract3.dao.BmiDao;
import com.example.pract3.model.Bmi;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bmi")
public class BmiController {

    private final BmiDao bmiDao;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("bmi", bmiDao.index());
        return "calculatorList";
    }


    @GetMapping("/new")
    public String newCalculator(Model model) {
        model.addAttribute("bmi", new Bmi());
        return "calc";
    }

    @PostMapping("")
    public String create(@ModelAttribute("bmi") Bmi bmi) {
        bmiDao.save(bmi);
        return "redirect:/bmi";
    }
}
