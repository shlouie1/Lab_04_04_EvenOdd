public class Main {
    static void main() {
        //even odd checker with primal implementation

        //check numToExamine, if numModulo returns the remainder
        int numToExamine = 35;
        double numModulo = numToExamine % 2;

        //prints remainder
        System.out.println("The result is " + numModulo);

        // what it would like if we had if statements
        //if (numModulo == 0) {
        //    System.out.println(numToExamine + " is even");
        //}
        //else {
        //    System.out.println(numToExamine + " is odd");
        //}

    }
}