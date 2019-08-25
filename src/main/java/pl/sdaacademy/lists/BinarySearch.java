package pl.sdaacademy.lists;

public class BinarySearch {
    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(0, new int[]{0, 1, 3, 5, 6, 8, 9}));
        System.out.println(binarySearch.binarySearch(-2, new int[]{-3, -2, 1, 2, 3, 6, 7, 9, 10, 11, 15, 16, 19, 30, 35, 45, 60, 126}));
        System.out.println(binarySearch.binarySearch(7, new int[]{0, 1, 3, 5, 6, 9, 10, 11}));
        System.out.println(binarySearch.binarySearch(13, new int[]{1, 3, 4, 5, 7, 8, 9, 11, 13}));
    }


    public int binarySearch(int value, int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;


        while (left <= right) {
            int center = (left + right) / 2;
            if (numbers[center] == value) {
                return center;
            } else if (numbers[center] < value) {
                left = center + 1;
            } else
                right = center - 1;
        }
        return -1;
    }
}
