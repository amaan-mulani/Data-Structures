import java.util.Stack;
import java.util.Scanner;
public class StackUsingClass
{
    public static void main(String[] args) {

        Stack<Integer> numberStack = new Stack<>();

        System.out.println("Stack");
        Scanner sp = new Scanner(System.in);
//        Stack_Class sc = new Stack_Class();
//        System.out.println("Enter the size of stack");
//        int sz= sp.nextInt();


        int choice;
        do {
            System.out.println();
            System.out.println("------Stack Menu------");
            System.out.println("1. Push {Hard coded}");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print Stack");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            choice = sp.nextInt();

            switch(choice)
            {
                case 1:
                        System.out.println("Enter values in stack: ");
                        for(int i=0; i<10;i++)
                        {
                            int v = sp.nextInt();
                            numberStack.push(v);
                        }
                        System.out.println("Values in Stack are: ");
                        for (int i = numberStack.size() - 1; i >= 0; i--) {
                            System.out.println(numberStack.get(i));
                        }
                    break;

                case 2:
                    if(numberStack.empty())
                    {
                        System.out.println("Stack is empty, nothing to pop.");
                    }
                    else
                    {
                        numberStack.pop();
                        System.out.println("Stack after pop are: ");
                        for (int i = numberStack.size() - 1; i >= 0; i--) {
                            System.out.println(numberStack.get(i));
                        }
                    }
                    break;

                case 3:
                    if(numberStack.empty())
                    {
                        System.out.println("Stack is empty, nothing to peek.");
                    }
                    else
                    {
                        System.out.println("Top Value of the stack is: " +numberStack.peek());
                    }

                    break;

                case 4:
                    if(numberStack.empty())
                    {
                        System.out.println("Stack is empty, nothing to print.");
                    }
                    else
                    {
                        System.out.println("Current Stack: ");
                        for (int i = numberStack.size() - 1; i >= 0; i--) {
                            System.out.println(numberStack.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting..");
                    break;

                default:
                    System.out.println("Please enter a valid choice.");
            }

        } while (choice!=5);

    }
}
