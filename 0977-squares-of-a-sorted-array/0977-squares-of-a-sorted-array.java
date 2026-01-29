class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }

        int start=0, end=n-1;
        for(int i=n-1;i>=0;i--){
            if(nums[start] > nums[end]){
                result[i]=nums[start];
                start++;
            }else{
                result[i]=nums[end];
                end--;
            }
        }
        return result;        
    }
}