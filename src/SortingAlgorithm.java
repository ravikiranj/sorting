/**
 * Created by Ravikiran on 6/18/2017.
 */
public interface SortingAlgorithm
{
    void sort(int[] a, int low, int high);
     default String getName() {
         return this.getClass().toString();
     }
}
