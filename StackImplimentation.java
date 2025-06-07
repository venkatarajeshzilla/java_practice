import java.util.*;
public class StackImplimentation{
    public static  void main(String args[]){
        Stack<Integer> sc=new Stack<>();
        sc.add(8);
        sc.add(7);
        sc.add(6);
        sc.add(5);
        sc.add(4);
        System.out.println("Before delete "+sc);
         sc.pop();
       
        System.out.print("After delete "+sc);
        //sc.pop();
       
    }
}