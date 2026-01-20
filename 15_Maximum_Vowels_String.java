class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i = 0; i < k; i++){
            if(isVowels(s.charAt(i))){
                count++;
            }
        }
        int maxCount = count;

        for(int i = k ; i < s.length(); i++){
            if(isVowels(s.charAt(i))){
                count++;
            }
            if(isVowels(s.charAt(i - k))){
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;

    }
    private boolean isVowels(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}