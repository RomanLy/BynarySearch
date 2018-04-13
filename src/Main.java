public class Main {

    static int[] array = {3, 4, 6, 7, 9, 46, 798, 3154, 4555, 4556, 4557};

    public static void main(String[] args) {
        search(array, 46);
    }

    public static int search(int[] arr, int x) {
        int end = arr.length;
        int begin = 0;

        return binarySearch(arr, begin, end, x);
    }
    public static int binarySearch(int[] arr, int start, int end, int x){


        int mid = start + (end - start) / 2;
        int index = 0;

        if (x == arr[mid]){
            index = mid;
            System.out.println("Finding index is: " + index);
            return index;
        }
        if (x > arr[mid]){
            start = mid;
        }
        if (x < arr[mid]){
            end = mid;
        }
        binarySearch(arr, start, end, x);
        return index;
    }
}
