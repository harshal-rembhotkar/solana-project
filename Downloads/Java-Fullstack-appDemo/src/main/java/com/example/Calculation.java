
package com.example;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    private double operand1;
    private double operand2;
    private String operation;
    private double result;

    public Calculation(Long id, double operand1, double operand2, String operation, double result) {
    }

    // Getter and Setter for id
    public Long getId(Long id) {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for operand1
    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    // Getter and Setter for operand2
    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    // Getter and Setter for operation
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    // Getter and Setter for result
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
