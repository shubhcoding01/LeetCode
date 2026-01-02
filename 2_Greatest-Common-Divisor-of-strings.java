// 1071. Greatest Common Divisor of Strings
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

// Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"

// Output: "ABC"

// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"

// Output: "AB"

// Example 3:

// Input: str1 = "LEET", str2 = "CODE"

// Output: ""

// Example 4:

// Input: str1 = "AAAAAB", str2 = "AAA"

// Output: ""​​​​​​​

 

// Constraints:

// 1 <= str1.length, str2.length <= 1000
// str1 and str2 consist of English uppercase letters.

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int gcdLength = gcd(str1.length(),str2.length());

        return str1.substring(0, gcdLength);
    }
    private int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


// class Solution {
//     public String gcdOfStrings(String str1, String str2) {

//         //One-line interview explanation (MEMORIZE THIS)

//         //“Since both strings are formed by repeating the same base pattern, the    length of that pattern must be the GCD of their lengths.”
//         if(!(str1 + str2).equals(str2 +str1)){
//             return "";
//         }
//         int len = gcd(str1.length(),str2.length());
//         return str1.substring(0,len);
//     }
//         private int gcd(int a,int b){
//             return b == 0?a:gcd(b,a%b);
//         }
    
// }