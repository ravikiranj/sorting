/**
 * Created by Ravikiran on 6/18/2017.
 */
public class MergeSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a, int low, int high)
    {
        mergeSort(a, low, high-1);
    }

    private void mergeSort(int[] a, int low, int high)
    {
        if (low < high)
        {
            int mid = low + ((high-low)/2);
            mergeSort(a, low, mid);
            mergeSort(a, mid+1, high);
            merge(a, low, mid, high);
        }
    }
    private void merge(int[] a, int low, int mid, int high)
    {
        int[] b = new int[high-low+1];

        int i = low, j = mid+1, k = 0;
        while (i <= mid && j <= high)
        {
            if (a[i] < a[j])
            {
                b[k++] = a[i++];
            }
            else
            {
                b[k++] = a[j++];
            }
        }

        while (i <= mid)
        {
            b[k++] = a[i++];
        }

        while (j <= high)
        {
            b[k++] = a[j++];
        }

        k = 0;
        for (i = low; i <= high; i++, k++)
        {
            a[i] = b[k];
        }
    }
}
