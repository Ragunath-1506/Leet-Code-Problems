class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer> range=new HashSet<>();

        HashSet<Integer> nums1=new HashSet<>();


        for(int i:nums){
            nums1.add(i);

        }

        for(int i=0;i<=n;i++){
            range.add(i);

        }

        for(int num:range){
            if(!nums1.contains(num)){
                return num;
            }
        }

        return n;
        
    }
}