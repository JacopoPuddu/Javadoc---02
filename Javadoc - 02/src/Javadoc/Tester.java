package Javadoc;

/**
 * Tester class that invokes the methods in the "ArithmeticOperators" class.
 * @author Jacopo Puddu
 */

public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators ops = new ArithmeticOperators();

        System.out.println(ops.sum(5, 7));
        System.out.println(ops.sub(5, 7));
        System.out.println(ops.mul(5, 7));
        System.out.println(ops.div(5, 7));
    }
}
