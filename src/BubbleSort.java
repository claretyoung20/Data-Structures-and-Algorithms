public class BubbleSort {

    /** comparison base algorithm in which each pair of adjacent element is
     * compared and element are swapped if they are not in order
     * bubble sort has O(n^2) worst case complexity  */

    public static void main(String[] args) {

       int[] intArray = { 20, 35, -15, 7, 55, 1, 22 };
       for (int lastUpdatedIndex = intArray.length-1; lastUpdatedIndex > 0;
       lastUpdatedIndex--) {

           for (int i=0; i<lastUpdatedIndex; i++) {
               if(intArray[i] > intArray[i+1]) {
                   swap(intArray, i, i+1);
               }
           }

       }

        print(intArray);

    }

    public static  void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}


