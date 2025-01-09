class Solution {
    public int romanToInt(String s) {

       char[] charArray = s.toCharArray();
       int c = 0;

       for(int i = 0;i < charArray.length;i++){
        if(charArray[i] == 'I'){
            if(i + 1 < charArray.length && charArray[i+1] == 'V'){
                c = c + 4;
                i = i + 1;
            }
            else if(i + 1 < charArray.length && charArray[i+1] == 'X'){
                c = c + 9;
                i = i + 1;
            }
            else{
                c = c + 1;
            }
        }
        else if(charArray[i] == 'X'){
            if(i + 1 < charArray.length && charArray[i+1]== 'L'){
                c = c + 40;
                i = i + 1;
            }
            else if(i + 1 < charArray.length && charArray[i+1] == 'C'){
                c = c + 90;
                i = i + 1;
            }
            else{
                c = c + 10;
            }
        }else if(charArray[i] == 'C'){
            if(i + 1 < charArray.length && charArray[i+1]== 'D'){
                c = c + 400;
                i = i + 1;
            }
            else if(i + 1 < charArray.length && charArray[i+1] == 'M'){
                c = c + 900;
                i = i + 1;
            }
            else{
                c = c + 100;
            }
        
       }else if(charArray[i] == 'V'){
        c = c + 5;
       }else if(charArray[i] == 'L'){
        c = c + 50;
       }else if(charArray[i] == 'D'){
        c = c + 500;
       }else if(charArray[i] == 'M'){
        c = c + 1000;
       }
       }
       return c; 
    }
    
}
