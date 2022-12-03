class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1 || k==0){
            return;
        }
        k=k%nums.length;
        rotateArray(nums,0, nums.length-1);
        rotateArray(nums, 0, k-1);
        rotateArray(nums, k, nums.length-1);
        return;
    }
    public void rotateArray(int nums[], int st, int end){
        while(st<end){
             int temp=nums[st];
             nums[st]=nums[end];
             nums[end]=temp;
            st++;
            end--;
        }
        return;
    }
}