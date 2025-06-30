public class leetcode28 {
    public static int rabinkrap(String haystack,String needle){
        int n=haystack.length();
        int m=needle.length();
        if(m==0)return 0;
        if(m>n)return -1;
        for(int i=0;i<n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int k=rabinkrap("qwertfhyd", "ert");
        System.out.println(k);

    }
}
