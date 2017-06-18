import org.testng.Assert;

import java.util.Arrays;

/**
 * Created by Ravikiran on 6/18/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        testSortingAlgorithm(new BubbleSort());
        testSortingAlgorithm(new SelectionSort());
        testSortingAlgorithm(new InsertionSort());
        testSortingAlgorithm(new MergeSort());
        testSortingAlgorithm(new QuickSort());
        testSortingAlgorithm(new QuickSortMidPartition());
    }

    private static void testSortingAlgorithm(SortingAlgorithm s)
    {
        int [] A1 = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int [] A2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10};
        int [] A3 = new int[] {-1, 100, 40, 20, 19, 23, 87, 52, 10, 231, 1000, 1000000, -40, 10};
        int [] A4 = new int[] {0, 2, 4, 9, 6, 2, 1};
        System.out.println("Testing sort algorithm = " + s.getName());
        testSort(s, A1);
        testSort(s, A2);
        testSort(s, A3);
        testSort(s, A4);
    }

    private static void testSort(SortingAlgorithm s, int[] a1)
    {
        int [] copyOfA1 = getArrayCopy(a1);
        s.sort(copyOfA1, 0, copyOfA1.length);

        int [] testCopyOfA1 = getArrayCopy(a1);
        Arrays.sort(testCopyOfA1);

        printArrays(copyOfA1, testCopyOfA1);
        Assert.assertTrue(Arrays.equals(copyOfA1, testCopyOfA1));
    }

    private static void printArrays(int[] a1, int[] a2) {
        System.out.print("Observed: ");
        for (int i = 0; i < a1.length; i++) {
            if (i != a1.length -1) {
                System.out.print(a1[i] + ", ");
            } else {
                System.out.println(a1[i]);
            }
        }
        System.out.print("Expected: ");
        for (int i = 0; i < a2.length; i++) {
            if (i != a2.length -1) {
                System.out.print(a2[i] + ", ");
            } else {
                System.out.println(a2[i]);
            }
        }
        System.out.println();
    }

    private static int[] getArrayCopy(int [] A)
    {
        int[] dest = new int[A.length];
        System.arraycopy(A, 0, dest, 0, A.length);
        return dest;
    }
}
