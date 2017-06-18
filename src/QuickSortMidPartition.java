/**
 * Created by Ravikiran on 6/18/2017.
 */
public class QuickSortMidPartition implements SortingAlgorithm
{
    @Override
    public void sort(int[] a, int low, int high)
    {
        quicksort(a, low, high-1);
    }

    private void quicksort(int[] a, int low, int high)
    {
        int pivot = a[low + (high - low) / 2];
        int i = low;
        int j = high;

        while (i <= j)
        {
            while (a[i] < pivot)
            {
                i++;
            }

            while (a[j] > pivot)
            {
                j--;
            }

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        // low ... j ... pivot ... i ... high
        if (low < j)
        {
            quicksort(a, low, j);
        }

        if (i < high)
        {
            quicksort(a, i, high);
        }
    }
}
