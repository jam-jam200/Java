public class Operators {
    public static void main(String[] args) {

        // assignment operator
        int number = 10;
        String game = "Ludo";

        // arithmetic operators
        int a = 1;
        int b = 2;
        /*
        post increment: number++; increments the final calculation value by adding one
        post decrement: number--; decrements the final calculation value by subtracting one

        ++i is called the pre-increment operator. When the pre-increment operator is used,
        the value of the variable is incremented and then used.
        For example, if the variable i is equal to 5, the statement j = ++i would increment the value of i to 6
        and then set the value of j to 6.

        In other words, the post-increment operator returns the original value of the variable,
        while the pre-increment operator returns the incremented value of the variable.
        **/

        System.out.println(a + number);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(a % b);


    }
}
