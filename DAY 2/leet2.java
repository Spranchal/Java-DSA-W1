public class leet2 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String minWord = strs[0];

        for(int i = 1; i < strs.length; i++) {
            if(strs[i].length() < minWord.length()) {
                minWord = strs[i];
            }
        } 
        for(int i = 0; i < minWord.length(); i++) {
            System.out.print(minWord.charAt(i));
        }
    }
}
