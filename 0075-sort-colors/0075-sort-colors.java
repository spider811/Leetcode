class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0, t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else{
                t++;
            }
        }
        o=o+z;
        t=t+o;
        t=o;
        int temp2=t;
        o=z;
        int temp1=o;
        z=0;
        System.out.print(z+"    "+o+"   "+t);
        while(z<temp1||o<temp2 || t<nums.length){
            if(z<temp1)
            nums[z++]=0;
            if(o<temp2)
            nums[o++]=1;
            if(t<nums.length)
            nums[t++]=2;
        }
        return;
    }
}