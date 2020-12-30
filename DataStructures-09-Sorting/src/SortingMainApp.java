import java.util.Arrays;

public class SortingMainApp {

    public static void main(String[] args) {
        var myarray=new int[]{9, 2, 4, 1, 3};
        //var quickSort= new MyQuickSort();
        //quickSort.sort(myarray);
        //System.out.println(Arrays.toString(myarray));

        //var mybubbleSort=new MyBubbleSort();
        //System.out.println(Arrays.toString(mybubbleSort.bubbleSort(myarray)));

        //var mySelectionSort=new MySelectionSort();
        //System.out.println(Arrays.toString(mySelectionSort.selectionSort(myarray)));

        //var myInsertionSort=new MyInsertionSort();
        //System.out.println(Arrays.toString(myInsertionSort.insertionSort(myarray)));

        var myMergeSort = new MyMergeSort();
        myMergeSort.mergeSort(myarray);
        System.out.println(Arrays.toString(myarray));


    }
}
