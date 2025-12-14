import java.util.*;

public class BalancedP {
    public static boolean isBalanced(String exp) {
        ArrayList<Character> list = new ArrayList<>();
        for(char ch : exp.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                list.add(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}') {
                list.remove(ch);
            }
        }

        if(list.isEmpty()) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String exp1 = "{[()]}";
        String exp2 = "([)]";
        String exp3 = "((())";
        String exp4 = "[]{}()";

        System.out.println(exp1 + " is balanced: " + isBalanced(exp1));
        System.out.println(exp1 + " is balanced: " + isBalanced(exp2));
        System.out.println(exp1 + " is balanced: " + isBalanced(exp3));
        System.out.println(exp1 + " is balanced: " + isBalanced(exp4));
    }
}
