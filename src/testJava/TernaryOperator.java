package testJava;

public class TernaryOperator {
    public static void main(String[] args){
        // variable = (condition) ? TrueExpression : FalseExpression

        int num1 = 3;
        int num2 = 6;

        String result = num2 < num1 ? "Yes, less than" : "No, greater than";
        System.out.println(result);
    }
}
