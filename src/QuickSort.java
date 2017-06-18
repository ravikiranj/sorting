/**
 * Created by Ravikiran on 6/18/2017.
 */
public class QuickSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a, int low, int high)
    {
        quicksort(a, low, high - 1);
    }

    private void quicksort(int[] a, int low, int high)
    {
        if (low < high)
        {
            int p = partition(a, low, high);
            quicksort(a, low, p-1);
            quicksort(a, p, high);
        }

    }

    private int partition(int[] a, int low, int high)
    {
        // Changing pivot to middle element changes the recursion function
        int pivot = low;
        int i = low, j = high, temp;
        while (i <= j)
        {
            while (a[i] < a[pivot])
            {
                i++;
            }

            while (a[j] > a[pivot])
            {
                j--;
            }

            if (i <= j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        return i;
    }

}
