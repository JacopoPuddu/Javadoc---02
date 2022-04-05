package Javadoc;

/**
 * Class with the basics arithmetic operators.
 * @author Jacopo Puddu
 */

public class ArithmeticOperators {
    /**
     * Method used to sum 2 numbers passed as params.
     * @param num1 First addend.
     * @param num2 Second addend.
     * @return Returns the sum of the 2 params.
     */

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Method used to subtract the second param from the first.
     * @param num1 Minuend.
     * @param num2 Subtrahend.
     * @return Returns the difference of the two params.
     */

    public int sub(int num1, int num2){
        return num1 - num2;
    }

    /**
     * Method used to multiply 2 numbers passed as params.
     * @param num1 Multiplier.
     * @param num2 Multiplicand.
     * @return Returns the product of the first param multiplied by the second.
     */

    public int mul(int num1, int num2){
        return num1 * num2;
    }

    /**
     * Method used to divide 2 numbers passed as params.
     * @param num1 Dividend.
     * @param num2 Divisor.
     * @return Returns the quotient of the 2 params.
     */

    public int div(int num1, int num2){
        return num1 / num2;
    }

}
