import java.util.*;

public class TwoSum {
    public static void main(String args[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your array length:");
        int n = sc.nextInt();

        System.out.println("Enter your target:");
        int target = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter your array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            int reqnum = target - nums[i];
            if (hm.containsKey(reqnum)) {
                System.out.println("Indices: [" + hm.get(reqnum) + ", " + i + "]");
                System.out.println("Values: [" + reqnum + ", " + nums[i] + "]");
                return; // Exit after finding one solution
            }
            hm.put(nums[i], i);
        }

        System.out.println("No two numbers add up to the target.");
    }
}
