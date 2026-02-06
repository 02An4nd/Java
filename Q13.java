class Q13 {
    public static void main(String[] args) {
        int a = -5, b = 3;
        int result = 0;

        while (b != 0) {
            if ((b & 1) == 1)
                result = result + a;

            a <<= 1;
            b >>= 1;
        }

        System.out.println(result);
    }
}
