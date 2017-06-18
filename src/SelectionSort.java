/**
 * Created by Ravikiran on 6/18/2017.
 */
public class SelectionSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a, int low, int high)
    {
        int min;
        int temp;
        for (int i = 0; i < high-1 ; i++)
        {
            min = i;
            for (int j = i+1; j < high; j++)
            {
                if (a[j] < a[min])
                {
                    min = j;
                }
            }
            if (min != i)
            {
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }
}
