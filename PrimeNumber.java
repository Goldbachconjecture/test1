public class PrimeNumber{
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i <= 20000; i++) {
            if (isPrime(i)) {
                cnt += 1;
                System.out.print(i + " ");
                if (cnt % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
