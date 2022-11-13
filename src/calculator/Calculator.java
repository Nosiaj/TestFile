package calculator;

public class Calculator {

    private int numberOne;
    private int numberTwo;

    public Calculator(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int add(){
        return this.numberOne + this.numberTwo;
    }

}
