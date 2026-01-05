// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.


class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while(left < right){
            while(left < right && !isVowel(arr[left])){
                left++;
            }
            while(left < right && !isVowel(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);

    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

// class Solution {
//     static {
//         Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//             try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
//                 fw.write("0");
//             } catch (Exception e) {
//             }
//         }));
//     }
//     public String reverseVowels(String str) 
//     {
//         Set<Character> set = new HashSet<>();
//         set.add('a');
//         set.add('e');
//         set.add('i');
//         set.add('o');
//         set.add('u');
//         set.add('A');
//         set.add('E');
//         set.add('I');
//         set.add('O');
//         set.add('U');
        
//         StringBuilder s = new StringBuilder(str);
//         int left=0,right=str.length()-1;
//         while(left<right)
//         {
//             if(set.contains(s.charAt(left)) && set.contains(s.charAt(right)))
//             {
//                 char temp=s.charAt(left);
//                 s.setCharAt(left, s.charAt(right));
//                 s.setCharAt(right, temp);
//                 left++;
//                 right--;
//             }

//             else if(set.contains(s.charAt(left)) && !set.contains(s.charAt(right)))
//             {
//                 right--;
//             }

//             else if(!set.contains(s.charAt(left)) && set.contains(s.charAt(right)))
//             {
//                 left++;
//             }

//             else
//             {
//                 left++;
//                 right--;
//             }
//         }
//         return s.toString();   
//     }
// }