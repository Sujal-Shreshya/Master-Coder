public class Find_factorial {

    /*
     * public static int factorial(int n) {
     * int f = 1;
     * for (int i = 1; i <= n; i++) {
     * f = f * i;
     * }
     * return f; // factorial of n
     * }
     * 
     * public static int binCoeff(int n, int r) { // Binomial factorial
     * int fact_n = factorial(n);
     * int fact_r = factorial(r);
     * int fact_nmr = factorial(n-r);
     * 
     * int binCoeff = fact_n / (fact_r * fact_nmr);
     * return binCoeff;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println(binCoeff(5, 2));
     * }
     */

    // func to calc sum of 2 sum
    /*
     * public static int sum(int a, int b) {
     * return a + b;
     * }
     * 
     * //func to calc sum of 3 nums
     * public static int sum(int a, int b, int c) {
     * return a + b + c;
     * }
     * 
     * // func to calc float sum
     * public static float sum(float a, float b){
     * return a + b;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println(sum(3,2));
     * System.out.println(sum(3,2,5));
     * System.out.println(sum(3.2f,6.2f));
     * }
     */

    /*
     * public static boolean isPrime(int n) {
     * for (int i = 2; i <= n - 1; i++) {
     * if (n % i == 0) { // completely dividing
     * return false;
     * 
     * }
     * }
     * return true;
     * }
     */

    /*
     * public static boolean isPrime(int n) {
     * if (n == 2) {
     * return true;
     * }
     * for (int i = 2; i <= Math.sqrt(n); i++) {
     * if (n % i == 0) {
     * return false;
     * }
     * }
     * return true;
     * }
     * 
     * public static void primesInRange(int n) {
     * for (int i = 2; i <= n; i++) {
     * if (isPrime(i)) { // if we get true
     * System.out.print(i + " ");
     * }
     * }
     * System.out.println();
     * }
     */

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }

        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
/* 
    public static void main(String[] args) {
        decToBin(15); 
    }    */


    //          Method scope    
    // public static void printS() {                    
    //     int s = 45;
    // }
   
   
   // Block Scope
    public static void main(String[] args) { 
        int p = 10;
        {
            int s = 45;  
            System.out.println(p);
        }

    } 

}
