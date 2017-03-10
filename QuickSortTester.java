/*
Team Nomex-Blanket: Alessandro Cartegni, Leo Liu, Noah Tang
APCS2 pd3
HW14 -- So So Quick
2017-3-08
*/

public class QuickSortTester {
    private static final long ROUNDS = 10000;
    private static final int    SIZE = 1000 + (int)( Math.random() * 1000 );

    /** Execution time analysis.
     * Create an array of size SIZE and populate it with arbitary values and
     * run quick sort on the array. Repeat ROUNDS times, then divide the total
     * amount of time spent by ROUNDS to obtain the average.
     */
    public static void main( String[] args ) {
        System.out.println("Running " + ROUNDS + " rounds of testing.\n");
        System.out.format("%s%30s%n", "Length", "Time (nanoseconds)");

        long time = 0;
        long s = 0;
        long e = 0;
        int[] data = new int[SIZE];

        for ( long rounds = ROUNDS; rounds > 0; rounds-- ) {
            for ( int i = 0; i < data.length; i++ ) {
                data[i] = (int) ( 1000 * Math.random() );
            }

            s = System.nanoTime();
            QuickSort.qsort(data);
            e = System.nanoTime();

            time += (e - s);
        }

        System.out.format("%s%20s%n", data.length, time / ROUNDS);
    }
}
