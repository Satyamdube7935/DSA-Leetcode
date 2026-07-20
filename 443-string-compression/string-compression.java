        class Solution {
    public int compress(char[] chars) {

        int index = 0;   // Position to write compressed characters
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 1;

            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            // Store the character
            chars[index++] = current;

            // Store the count if greater than 1
            if (count > 1) {
                String cnt = String.valueOf(count);

                for (int j = 0; j < cnt.length(); j++) {
                    chars[index++] = cnt.charAt(j);
                }
            }

            i++;
        }

        return index;
    }
}