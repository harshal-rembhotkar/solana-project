package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    @Autowired
    private CalculationRepository calculationRepository;

    public Calculation performCalculation(double operand1, double operand2, String operation) {
        double result = 0;
        switch (operation) {
            case "add":
                result = operand1 + operand2;
                break;
            case "subtract":
                result = operand1 - operand2;
                break;
            case "multiply":
                result = operand1 * operand2;
                break;
            case "divide":
                result = operand1 / operand2;
                break;
        }


        Long id = null;
        Calculation calculation = new Calculation(id, operand1, operand2, operation, result);
        calculation.setOperand1(operand1);
        calculation.setOperand2(operand2);
        calculation.setOperation(operation);
        calculation.setResult(result);

        return calculationRepository.save(calculation);
    }
}
