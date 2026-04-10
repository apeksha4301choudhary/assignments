class ArrayisSorted{

    public static boolean isSorted(int[] arr, int i) {
        // Base case: reached end
        if (i == arr.length - 1) {
            return true;
        }

        // If current element > next → not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
}
