import java.util.*;
public class leetcode5 {
    public String pal(String s){
        int n=s.length();
      String longest="";
      for(int i=0;i<n;i++){
        String odd=expandfromcentre(s,i,i);
        String even =expandfromcentre(s,i,i+1);
     if(odd.length()>longest.length()){
longest=odd;
     }
     if(odd.length()>longest.length()){
        longest=even;
     }
    }
    return longest;
    
    }
    public String expandfromcentre(String s,int left,int right){
while(left>0 && right<s.length() && s.charAt(left)==s.charAt(right)){
    left--;
    right++;
}
return s.substring(left+1,right);
    }
}
