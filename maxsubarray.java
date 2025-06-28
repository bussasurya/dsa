public class maxsubarray{
public static int kadane(int[]nums){
    int sum=nums[0];
    int maxsum=nums[0];
    for(int i=0;i<nums.length;i++){
        if(sum+nums[i]>nums[i]){
            sum=sum+nums[i];
        }
        else{
            sum=nums[i];
        }
        if(sum>maxsum){
            maxsum=sum;
        }
    }
    return maxsum;
}
public static void main(String[] args) {
    int[]nums={-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int max=kadane(nums);
    System.out.println(max);

}
}