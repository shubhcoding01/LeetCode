// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
// Example 3:

// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

// Constraints:

// 1 <= s.length <= 104
// s contains English letters (upper-case and lower-case), digits, and spaces ' '.
// There is at least one word in s.


class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();
        for(int i = words.length - 1;i >= 0 ; i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}


// class Solution {
//     private static final char SPACE = ' ';

//     static {
//         for (int i = 0; i < 100; i++) {
//             reverseWords("");
//         }
//     }

//     public static String reverseWords(String s) {
//         final char SPACE = ' ';
//         char[] res = new char[s.length()];
//         var offset = 0;
//         var end = s.length() - 1;
//         while (end >= 0) {
//             // ignore space
//             while (end >= 0 && s.charAt(end) == SPACE)
//                 end--;
//             // found word, meaning, end index of word
//             var start = end;
//             // move idx to the start of word
//             while (start >= 0 && s.charAt(start) != SPACE)
//                 start--;
//             // found last index that end word (space) or end String input
//             var k = start + 1;

//             // starting copy word to output
//             if (offset > 0 && k <= end) {
//                 // if offset is 0, meaning the first word, no need SPACE
//                 res[offset++] = SPACE;
//             }
//             while (k <= end)
//                 res[offset++] = s.charAt(k++);
//             // after copy, set the idx to the start idx of word
//             end = start;
//         }
//         return new String(res, 0, offset);
//     }
// }