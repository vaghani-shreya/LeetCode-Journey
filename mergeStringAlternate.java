class Solution {
    public String mergeAlternately(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int i = 0;
        int max = Math.max(w1.length, w2.length);
        String output = "";

        while(i<max){
            if(i>=w1.length && i< w2.length){
                output += Character.toString(w2[i]);
                i++;
            } else if(i<w1.length && i>=w2.length){
                output += Character.toString(w1[i]);
                i++;
            }else{
                output += Character.toString(w1[i]) + Character.toString(w2[i]);
                i++;
            }
        }

        return output;

        
    }
}