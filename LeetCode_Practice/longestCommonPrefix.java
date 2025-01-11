
// 6 ms solution 
class Solution {
    public String longestCommonPrefix(String[] strs) {

        int i = 1;
        int k = 0;
        String prefix = strs[0];
        String output = "";

        while(i< strs.length){
            k = 0;
            output = "";
            while(k<prefix.length() && k < strs[i].length()){
                if(prefix.charAt(k)== strs[i].charAt(k)){
                    output = output + Character.toString(prefix.charAt(k));
                }else{
                    break;
                }
                k++;
            }
            prefix = output;
            i++;
        }

        return prefix;
        
        }        
}





// 1 ms solution 

class Solution {
    public String longestCommonPrefix(String[] strs) {

           if (strs == null || strs.length == 0) {
            return "";
        }
             
           

            Arrays.sort(strs);

            String first = strs[0];
            String last = strs[strs.length-1];

            int i = 0;
            
            while(i<first.length() ){

                if(first.charAt(i) == last.charAt(i)){
                   
                    i++;
                }else
                break;
                
            }

           return i==0?"":first.substring(0,i);

    }
}