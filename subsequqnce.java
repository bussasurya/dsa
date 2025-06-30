public class subsequqnce {
    public boolean sub(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        subsequqnce obj = new subsequqnce();
        boolean k = obj.sub("abc", "ahbghc");
        System.out.println(k);
    }
}
