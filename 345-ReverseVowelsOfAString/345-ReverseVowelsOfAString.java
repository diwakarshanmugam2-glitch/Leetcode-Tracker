// Last updated: 7/14/2026, 2:01:18 PM
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !isVowel(chars[i])) {
                i++;
            }
            while (i < j && !isVowel(chars[j])) {
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }

        return new String(chars);
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

