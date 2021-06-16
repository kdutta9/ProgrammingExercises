/*
 * Leetcode 1108. Defanging an IP Address
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
*/

class Solution {
    /* Use a StringBuilder to write method from scratch. */
    public String defangIPaddr(String address) {
        StringBuilder newAddr = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                newAddr.append("[.]");
            } else {
                newAddr.append(address.charAt(i));
            }
        }
        
        return newAddr.toString();
    }
    
    /* This can be done simpler, but slower, with a replace function. */
    public String defangIPaddrReplace(String address) {
        String newAddr = address.replace(".", "[.]");
        return newAddr;
    }
}