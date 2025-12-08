import java.util.Scanner;

public class Stack_Class {
    int tos, MaxSize, stack[];

    void create_stack(int size)
    {
        tos = -1;
        MaxSize = size;
        stack = new int[MaxSize];
    }

    void push(int data)
    {
        tos++;
        stack[tos] = data;
        //stack[++toss] = data;
    }

    boolean is_full()
    {
//        if(toss==MaxSize-1)
//            return true;
//        else
//            return false;
         return(tos==MaxSize-1); //Condition check karke return kar do, kyu if else karna he.
    }
    int pop()
    {
        int temp = stack[tos];
        tos--;
        return(temp);
        //return(stack[toss--]);
    }

    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
        //return(toss==-1); //Condition check karke return kar do, kyu if else karna he.
    }

    int peek()
    {
        return(stack[tos]);
    }

    void print_stack() //print stack on lifo manner(i.e from top to bottom)
    {
        for(int i=tos; i>=0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("Stack");
        Scanner sp = new Scanner(System.in);
        Stack_Class sc = new Stack_Class();
        System.out.println("Enter the size of stack");
        int sz= sp.nextInt();
        sc.create_stack(sz);


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
                    if(sc.is_full())
                    {
                        System.out.println("Stack is full, cannot push.");
                    }
                    else
                    {
                        System.out.println("Enter " +sz+ " values in stack: ");
                        for(int i=0; i<sz;i++)
                        {
                            int v = sp.nextInt();
                            sc.push(v);
                        }
                        System.out.println("Values in Stack are: ");
                        sc.print_stack();
                    }
                    break;

                case 2:
                    if(sc.is_empty())
                    {
                        System.out.println("Stack is empty, nothing to pop.");
                    }
                    else
                    {
                        sc.pop();
                        System.out.println("Stack after pop are: ");
                        sc.print_stack();
                    }
                    break;

                case 3:
                    if(sc.is_empty())
                    {
                        System.out.println("Stack is empty, nothing to peek.");
                    }
                    else
                    {
                        System.out.println("Top Value of the stack is: " +sc.peek());
                    }

                    break;

                case 4:
                    if(sc.is_empty())
                    {
                        System.out.println("Stack is empty, nothing to print.");
                    }
                    else
                    {
                        System.out.println("Current Stack: ");
                        sc.print_stack();
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
