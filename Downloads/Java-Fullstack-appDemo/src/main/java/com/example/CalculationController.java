package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/calculator")
public class CalculationController {

    @Autowired
    private CalculationService calculationService;

    @GetMapping
    public String getCalculatorPage() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("operand1") double operand1,
            @RequestParam("operand2") double operand2,
            @RequestParam("operation") String operation,
            Model model) {

        Calculation calculation = calculationService.performCalculation(operand1, operand2, operation);
        model.addAttribute("calculation", calculation);
        return "result";
    }
}
