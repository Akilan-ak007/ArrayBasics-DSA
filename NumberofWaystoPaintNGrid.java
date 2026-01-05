package ArrayHard;

public class NumberofWaystoPaintNGrid {

    public int numOfWays(int n) {
        long mod = 1_000_000_007;

        long typeA = 6; // ABC
        long typeB = 6; // ABA

        for (int i = 2; i <= n; i++) {
            long newTypeA = (2 * typeA + 2 * typeB) % mod;
            long newTypeB = (2 * typeA + 3 * typeB) % mod;

            typeA = newTypeA;
            typeB = newTypeB;
        }

        return (int)((typeA + typeB) % mod);
    }

    public static void main(String[] args) {
        NumberofWaystoPaintNGrid sol = new NumberofWaystoPaintNGrid();

        int n = 1;
        int result = sol.numOfWays(n);

        System.out.println("Number of ways = " + result);
    }
}
