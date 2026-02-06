class Q12 {
    public static void main(String[] args) {
        int a = 15, b = 5;

        b = ~b + 1;   // two's complement of b

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        System.out.println(a);
    }
}
