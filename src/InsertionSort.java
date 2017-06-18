/**
 * Created by Ravikiran on 6/18/2017.
 */
public class InsertionSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a, int low, int high)
    {
        int j;
        int temp;
        for (int i = low+1; i < high; i++)
        {
            j = i;
            while (j > 0 && a[j-1] > a[j])
            {
                temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }

    }
}
