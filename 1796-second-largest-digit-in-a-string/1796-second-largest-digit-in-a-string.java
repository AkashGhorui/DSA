class Solution {
    public int secondHighest(String s) {
        
        int n=0,largest=0,sec_largest=0;

        while(n<s.length()){
            char ch=s.charAt(n);
            if(Character.isDigit(ch)){
                 if(ch>largest){
                    sec_largest=largest;
                   largest=ch;
                   // System.out.println(largest+" "+sec_largest);
                  }
                else if(largest>ch && ch>sec_largest){
                        sec_largest=ch;
                        // System.out.println(largest+" "+sec_largest);
                  }
            }
           

            n++;
        }
        
        if(sec_largest==0){
            return -1;
        }
        else{
            return sec_largest-'0';
        }
    }
}