public class SearchMainApp {
    public static void main(String[] args) {
        int[] myarray = new int[]{1, 2, 3, 4, 5, 6, 89, 100, 113, 114, 120};

        //var mylinearsearch=new MyLinearSearch();
        //System.out.println("Linear Search : " +mylinearsearch.linearSearch(myarray,112));

        //var myBinarySearchRec = new MyBinarySearchRecursive();
        //System.out.println("Rec Bin Search: " + myBinarySearchRec.binarySearchRec(myarray, 112));

        //var myBinarySearchIterative = new MyBinarySearchIterative();
        //System.out.println("Iterative Bin Search: " + myBinarySearchIterative.binSearchIterative(myarray, 120));

        //var myTernarySearch = new MyTernarySearch();
        //System.out.println("Ternary search: " + myTernarySearch.ternarySearch(myarray, 100));

        var myJumpSearch = new MyJumpSearch();
        System.out.println(("Jump Search: " + myJumpSearch.jumpSearch(myarray, 100)));


    }
}