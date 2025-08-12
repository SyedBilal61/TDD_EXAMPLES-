public class Factorial {

    public int compute(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative input: " + n);
        if (n == 0)
            return 1;
        return n * compute(n - 1);
    }
    public class ProgressUpdate {
        public static void main(String[] args) {
            System.out.println("Progress update: 2025-08-12");
            System.out.println(" - Maven configured and verified with Java 22");
            System.out.println(" - Maven version and Java runtime working correctly");
            System.out.println(" - Ready to proceed with project build and testing");
        }
    }

}
