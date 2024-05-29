package logic;

public class Calculator {

    public enum Operation{
        SUM,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        POTENCY
    }

    private double value1;
    private double value2;
    private boolean waiting;
    private Operation operation;


    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public boolean isWaiting() {
        return waiting;
    }

    public Operation getOperation() {
        return operation;
    }


    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setWaiting(boolean waiting) {
        this.waiting = waiting;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    
    public double calculate() {
        switch (operation) {
            case SUM: return value1 + value2;
            case SUBTRACTION: return value1 - value2;
            case MULTIPLICATION: return value1 * value2;
            case DIVISION: return value1 / value2;
            default: return Math.pow(value1, value2);
        }
    }
}