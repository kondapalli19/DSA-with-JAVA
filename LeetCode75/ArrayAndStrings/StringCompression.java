class Solution {
    public int compress(char[] chars) {
        int k = 0; // pointer to the current position to write in the compressed array

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            int count = 1; // initialize the count of consecutive characters to 1

            // Check for consecutive repeated characters
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            // Write the current character to the compressed array
            chars[k++] = currentChar;

            // If there is more than one occurrence, write the count as characters
            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for (char c : countChars) {
                    chars[k++] = c;
                }
            }
        }

        return k;
    }
}
