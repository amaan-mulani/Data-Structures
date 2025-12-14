package Stack;

import java.util.Scanner;
import java.util.Stack;

    public class StringReversal
    {
        public static void main(String[] args)
        {
            Stack<Character> obj=new Stack<>();
            Scanner in=new Scanner(System.in);
            System.out.println("Enter a word");
            String word = in.next();
            String rword = "";

            for(int i=0; i<word.length();i++)
            {
                obj.push(word.charAt(i));
                System.out.println(obj);
            }

            for (int i = obj.size() - 1; i >= 0; i--) {
                rword = rword + obj.pop();
            }
            System.out.println("Reversed String is: " +rword);

        }
    }


