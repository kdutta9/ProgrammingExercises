/*
 * Leetcode 415. Add Strings
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
*/
class Solution {
    public String addStrings(String num1, String num2) {
        ArrayList<String> total = new ArrayList<>();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String res;
        
        int i_num;
        int j_num;
        while (i >= 0 || j >= 0 || carry > 0) {
            i_num = 0;
            j_num = 0;
            if (i >= 0) {
                i_num = Character.getNumericValue(num1.charAt(i));
            }
            if (j >= 0) {
                j_num = Character.getNumericValue(num2.charAt(j));
            }
            int sum = carry + i_num + j_num;
            total.add(0, Integer.toString(sum % 10));
            
            carry = sum / 10;
            i--;
            j--;
        }
            
        res = String.join("", total);
        return res;
    }
}