import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
        System.out.println(Expression.isValidExpression(")()"));
        System.out.println(Expression.isValidExpression("(<>)"));


    }
    public static String reverseString(String s) {
        Stack <Character> stack = new Stack<>();
        String reverse = "";
        for (int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));
        while (!stack.isEmpty())
            reverse += stack.pop();
        return reverse;


    }

}