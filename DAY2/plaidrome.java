public class plaidrome {
    public static boolean checkPalindrome(String s, String rev) {
        if(rev.equals(s)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "nitin is bunny";
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Original string: " + s);
        System.out.println("Reversed string: " + rev);
        System.out.println("Are palindrome: " + checkPalindrome(s, rev));
    }
}
