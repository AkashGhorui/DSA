class Solution {
    public int firstUniqueFreq(int[] nums) {

        HashMap<Integer,Integer> freq=new HashMap<>();
        
        for(int f:nums){
            freq.put(f,freq.getOrDefault(f,0)+1);
        }

        HashMap<Integer,Integer> freq_count=new HashMap<>();

        for(int fr:freq.values()){
            freq_count.put(fr,freq_count.getOrDefault(fr,0)+1);
        }

        for(int n:nums){
            if(freq_count.get(freq.get(n))==1){
                return n;
            }
        }

        return -1;

        
    }
}