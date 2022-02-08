public class HelloWorld2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double N;


        if (a != 0) {
            N = b + (Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println("Значение выражения " + N);
        } else {
            System.out.println("Деление на ноль");
        }
    }
}


