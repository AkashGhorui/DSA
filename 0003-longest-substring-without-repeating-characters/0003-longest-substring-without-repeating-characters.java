class Solution {
    public int lengthOfLongestSubstring(String s) {
        
                     int l=0,r=0,max_len=0;
                     int n;

                 HashMap<Character,Integer> map=new HashMap<>();

                 while(r<s.length()){
            
                     char ch_r=s.charAt(r);

                     if(map.containsKey(ch_r) && map.get(ch_r)>=l){
                     l=map.get(ch_r)+1;
            
                         }
            
                        map.put(ch_r,r);
                         n=r-l+1;
                         max_len=Math.max(max_len,n);
                         r++;
              
    

                }

        return max_len;

    }
}
    
