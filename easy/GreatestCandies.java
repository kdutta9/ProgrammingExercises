/**
Leetcode 1431. Kids With the Greatest Number of Candies

Given the array candies and the integer extraCandies, 
where candies[i] represents the number of candies that the ith kid has.
For each kid check if there is a way to distribute extraCandies among the 
kids such that he or she can have the greatest number of candies among them. 
Notice that multiple kids can have the greatest number of candies. 
**/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int target = Arrays.stream(candies).max().getAsInt();
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= target) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        
        return res;
    }
}