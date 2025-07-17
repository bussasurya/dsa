import java.util.*;
public class bubble{
    public static void bs(int[] arr){
int n=arr.length;
for(int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp= arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,1,7,4};
        bs(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}