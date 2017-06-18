/**
 * Created by Ravikiran on 6/18/2017.
 */
public class BubbleSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a, int low, int high)
    {
        int temp;
        for (int i = low; i < high-1; i++)
        {
            for (int j = low; j < high-i-1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
}
