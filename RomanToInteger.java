import java.util.*;
public class RomanToInteger{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roman number");
        String s=sc.next();
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int res = romanMap.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            int present=romanMap.get(s.charAt(i));
            int next=romanMap.get(s.charAt(i+1));
            if(present<next)
            
            {
                res=res-present;
            }
            else
            {
                res=res+present;
            }
        }
        System.out.print("Integer is"+s+":"+res);
    }

}