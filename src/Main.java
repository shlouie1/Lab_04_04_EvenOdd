public class Main {
    static void main() {
        int numToExamine = 35;
        double numModulo = numToExamine % 2;

        if (numModulo == 0) {
            System.out.println(numToExamine + " is even");
        }
        else {
            System.out.println(numToExamine + " is odd");
        }

    }
}
