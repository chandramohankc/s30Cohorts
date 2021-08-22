import java.util.Arrays;

public class FindMissingElement {

    public static int findMissingElement(int[] nums) {

        if (null == nums || nums.length == 0) {
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("Low: " + low + ", High: " + high + ", Mid: " + mid);

            if (nums[mid] == mid + 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + 1;
    }

    /*Time complexity is O log(n) */
    /*Space complexity is O (1) not used additional auxilary  space*/
    public static void main(String[] args) {
//        int[] in = {1, 2, 3, 4, 5, 6, 8};

        int[] in = {1, 2, 3, 5, 7, 6, 8};

        System.out.println(Arrays.toString(in));
        System.out.println("Array Length: " + in.length);

        System.out.println("Missing Element: " + findMissingElement(in));
    }
}
