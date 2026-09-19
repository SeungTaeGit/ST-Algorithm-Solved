class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        
        
        String[] arr = letter.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            String code = arr[i]; 
            
            for (int j = 0; j < morse.length; j++) {
                
                if (morse[j].equals(code)) {
                    char alpha = (char) (j + 'a');
                    sb.append(alpha);
                    
                    break; 
                }
            }
        }
        
        return sb.toString();
    }
}