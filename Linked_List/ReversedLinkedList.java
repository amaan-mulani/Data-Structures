package Linked_List;
//using reverse
import java.util.LinkedList;
import java.util.Stack;

public class ReversedLinkedList
{
    public static void main(String[] args)
    {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(5);
        System.out.println("/n List has: " +list);
        Stack<Integer> stack = new Stack<>();
//        for(int i = 0; i<list.size(); i++)
//        {
//            System.out.println("\n" + list.get(i));
//        }
         while(!list.isEmpty())
            stack.push(list.removeFirst());
        //from stack copy to linked list
        while(!stack.isEmpty())
            list.add(stack.pop());
        System.out.println("\nList has: "+list);


    }
}
