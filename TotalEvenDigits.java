/** Given an array nums of integers, return how many of them contain an even number of digits.
 * Constraints: 1 <= nums.length <= 500
 *              1 <= nums[i] <= 10^5
 * Leetcode 1295
 * Source: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Format input: [12,345,2,6,7896]
 */

class TotalEvenDigits {
    public static void main(String[] args) {
        int[] nums = cleanInput(args[0]);
        int total = find(nums);
        System.out.println(total);
    }

    public static int find(int[] nums) {
        int total = 0;
        for (int num : nums) {
            boolean twoDigit = (10 <= num) && (num <= 99);
            boolean fourDigit = (1000 <= num) && (num <= 9999);
            if (twoDigit || fourDigit) {
                total++;
            }
        }

        return total;
    }

    public static int[] cleanInput(String args) {
        String[] items = args.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input.");
                System.exit(0);
            }
        }

        return results;
    }
}