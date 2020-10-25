/* Leetcode 387. First Unique Character in a String
 * Given a string, find the first non-repeating character 
 * in it and return its index. If it doesn't exist, return -1.
*/

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
                
        int index = 0;
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, -1);
            } else {
                map.put(c, index);
            }
            index++;
        }
        
        for (char c : map.keySet()) {
            if (map.get(c) > -1) 
                return map.get(c);
        }
        
        return -1;
    }
}