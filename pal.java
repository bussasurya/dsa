public class pal {
    public static boolean pall(int num){
        int orginal=num;
        int rev=0;
        while( num>0){
            int digit =num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return orginal==rev;
    }
    public static void main(String[] args) {
        int num=121;
        if(pall(num)){
            System.out.println(num+"is a palidrom");
        }
        else{
            System.out.println("is not a palidrom");
        }

    }
}
