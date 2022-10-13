package Zad2;
public class Search {
    private static boolean search(int[] numbers, int x) {

        int low = 0;
        int high = numbers.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == x)
                return true;
            if (numbers[mid] > x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;

//        Time Complexity: O(N)
//        Auxiliary Space: O(1)
    }
}
