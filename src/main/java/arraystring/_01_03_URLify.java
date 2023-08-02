package arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {
    char[] urlify(char[] chars, int trueLength) {
        char[] sol = new char[trueLength];
        int i = 0; // for initial string
        int j = 0; // for sol array
        while (i < chars.length && j < chars.length)  {
            if (chars[i] != ' ') {
                sol[j] = chars[i];
            }
            if (chars[i] == ' ') {
                sol[j] = '%';
                sol[j+1] = '2';
                sol[j+2] = '0';
                j++;
            }
            i++;
            j++;
        }
        return sol;
    }
}
