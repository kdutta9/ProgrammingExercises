import java.util.HashMap;

class JewelsInStones {
    // Leetcode 771 (Easy)

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        int result = findValue(args[0], args[1]);
        System.out.println(result);
    }

    static int findValue(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        HashMap<Character, Integer> count = new HashMap<>();
        int total = 0;

        for (char s : stones) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }

        for (char j : jewels) {
            total += count.getOrDefault(j, 0);
        }

        return total;
    }
}