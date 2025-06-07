import java.util.*;

public class validpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        System.out.println("enter the string");
        
        String str = sc.next();
        //()System.out.println("enter the string");
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                s.push(ch);
            } else {
                if (!s.isEmpty() && 
                    ((s.peek() == '(' && ch == ')') ||
                     (s.peek() == '[' && ch == ']') ||
                     (s.peek() == '{' && ch == '}'))) {
                    s.pop();
                } else {
                    System.out.println(false);
                    return; // exit early since it's unbalanced
                }
            }
        }
        sc.close();

        System.out.println(s.isEmpty());
    }
}
