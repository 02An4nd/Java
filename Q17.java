class Q17 {
    public static void main(String[] args) {
        int a = 12, b = 45;

        int diff = a - b;
        int sign = (diff >> 31) & 1;

        int max = a - sign * diff;
        System.out.println(max);
    }
}
