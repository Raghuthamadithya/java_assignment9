
public class VampireNumber {

    public static void main(String args[]) {
        long cnt = 0, start = 10, tens = 10;
        outer:
        for (int digits = 2; digits <= 18; digits += 2) {
            long end = start * 10;
            for (long i = start; i < end; i++) {
                if (numberOfFangs(i, tens) > 0) {
                    if (++cnt >= 26)
                        break outer;
                }
            }
            start *= 100;
            tens *= 10;
        }
        System.out.println();

        long[] nums = {16758243290880L, 24959017348650L,14593825548650L};

        for (long b : nums)
            numberOfFangs(b, 10000000L);
    }

    private static int numberOfFangs(long n, long tens) {
        int cntFangs = 0;
        long low = Math.max(tens / 10, (n + tens - 2) / (tens - 1));
        long hi = Math.min(n / low, (long) Math.sqrt(n));

        long nTally = checkDigits(n);

        for (long a = low; a <= hi; a++) {
            long b = n / a;

            if (a * b != n)
                continue;
            if (n % 9 != (a + b) % 9)
                continue;

            if (a % 10 == 0 && b % 10 == 0)
                continue;

            if (nTally == checkDigits(a) + checkDigits(b)) {
                if (cntFangs == 0)
                    System.out.printf("\n%d : ", n);
                System.out.printf("[%d, %d]", a, b);
                cntFangs++;
            }
        }
        return cntFangs;
    }
    private static long checkDigits(long n) {
        long total = 0;
        while (n > 0) {
            total += 1L << ((n % 10) * 6);
            n /= 10;
        }
        return total;
    }
}