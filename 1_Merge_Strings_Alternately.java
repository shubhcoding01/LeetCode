// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s
// Example 3:

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d
 

// Constraints:

// 1 <= word1.length, word2.length <= 100
// word1 and word2 consist of lowercase English letters.

// My Solution:

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0,j = 0;

        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()){
                result.append(word1.charAt(i));
                i++;
            }
            if(j < word2.length()){
                result.append(word2.charAt(j));
                j++;
            }
        }

        return result.toString();

    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;

        while(i < word1.length() && j < word2.length()){
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i < word1.length()){
            result.append(word1.substring(i));
        }
        if(j < word2.length()){
            result.append(word2.substring(j));
        }

        return result.toString();

    }
}

// [Other 0ms Solution ]
// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         int n=word1.length(),m=word2.length();

//         char []answer=new char[n+m];
//         if(n>m){
//             int idx=0;
//             for(int i=0;i<m;i++){
//                 answer[idx++]=word1.charAt(i);
//                 answer[idx++]=word2.charAt(i);
//             }
//             //now push remaining 
//             for(int i=m;i<n;i++){
//                 answer[idx++]=word1.charAt(i);
//             }

//         }
//         else{
//             int idx=0;
//             for(int i=0;i<n;i++){
//                 answer[idx++]=word1.charAt(i);
//                 answer[idx++]=word2.charAt(i);
//             }
//             //now push remaining 
//             for(int i=n;i<m;i++){
//                 answer[idx]=word2.charAt(i);
//                 idx++;
//             }

//         }
//         return new String(answer);
//     }
// }