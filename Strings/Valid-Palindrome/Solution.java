class Solution {
    public boolean isPalindrome(String s) {
        String l = s.toLowerCase();
        String r = l.replaceAll("[^a-zA-Z0-9]", "");

        int i = 0, j = r.length() - 1;

        while (i < j) {
            if (r.charAt(i) != r.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
