import java.util.Arrays;

public class Q1 {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        
        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // Fill the remaining positions with zeroes
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println("Output for nums1: " + Arrays.toString(nums1));
        
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println("Output for nums2: " + Arrays.toString(nums2));
    }
}
