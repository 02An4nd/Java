class Q14 {
    public static void main(String[] args) {
        int dividend = 43, divisor = 8;
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println(quotient);
    }
}
