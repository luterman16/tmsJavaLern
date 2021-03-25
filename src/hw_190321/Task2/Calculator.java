package hw_190321.Task2;

public class Calculator {
    private double operand1;
    private double operand2;

    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void plus (){
        double result = operand1 + operand2;
        System.out.println(result);
    };

    public void multiply (){
        double result = operand1 * operand2;
        System.out.println(result);
    };

    public void divide (){
        double result = operand1 / operand2;
        System.out.println(result);
    };


    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }



}
