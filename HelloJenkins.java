public class HelloJenkins {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins!");

        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("Sum = " + sum);

        if (sum == 30) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}
