import java.util.*;
public class dup{
    public static void dupp(int[]nums){
HashSet<Integer> seen=new HashSet<>();
for(int num:nums){
    if(seen.contains(num)){
        System.out.println("true");
        return;
    }
    seen.add(num);
}
System.out.println("false");
    }
    public static void main(String[] args) {
        int[]nums1={1,2,3,4,1};
        int[] nums2={3,4,5,6};
        dupp(nums1);
        dupp(nums2);
    }

}