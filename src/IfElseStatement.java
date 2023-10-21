public class IfElseStatement {
    public static void main (String[] args){
        // if(expression){ statement} else{statement}

        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            System.out.println("a is greater than b");
        } else if( a <= b) {
            System.out.println("a is less than or equal to b");
        } else if( a >= b) {
            System.out.println("a is greater than or equal to b");
        } else if( a != b) {
            System.out.println("a is not equal to b");
        } else if( a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("none of the above");
        }


        // nested if
        if (a < b) {
            System.out.println("a is less than b");
            if (c > b) {
                System.out.println("c is greater than b");
            }
        } else {
            System.out.println("Nothing for you");
        }
    }
}
