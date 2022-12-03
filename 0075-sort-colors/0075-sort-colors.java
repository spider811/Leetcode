//using single pass
class Solution {
    public void sortColors(int[] nums) {
        int i=0,l=0,r=nums.length-1;
        while(i<=r){
            if(nums[i]==0){
                swap(i,l,nums);
                l++;
            }
            else if(nums[i]==2){
                swap(i,r,nums);
                r--;i--;
            }
            i++;
        }
        return;
    }
    void swap(int i, int j ,int nums[] ){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return;
    }
}