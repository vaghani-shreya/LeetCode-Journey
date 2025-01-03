class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        char [] charAllowed = allowed.toCharArray();
        HashSet<Character> hp = new HashSet<>();
        int count = 0;
        
        for(char c: charAllowed){
            hp.add(c);
        }

        for(String s : words){
            boolean isConsistent = true;

            for(char c: s.toCharArray()){
                if(!hp.contains(c)){
                    isConsistent = false;
                    break;
                }

            }

            if(isConsistent){
                count++;
            }
       
}
 return count;
}
}