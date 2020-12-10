/*
 * Leetcode 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 		- Open brackets must be closed by the same type of brackets.
 * 		- Open brackets must be closed in the correct order.
*/
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        
        HashMap<Character, Character> parMap = new HashMap<>();
        ArrayList<Character> pars = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        parMap.put('(', ')');
        pars.add('(');
        parMap.put('[', ']');
        pars.add('[');
        parMap.put('{', '}');
        pars.add('{');
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (pars.contains(curr)) {
                stack.add(curr);
            } else if (!stack.isEmpty() && parMap.getOrDefault(stack.peek(), null).equals(curr)) {
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
        
    }
}