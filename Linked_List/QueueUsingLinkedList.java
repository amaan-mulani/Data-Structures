package Linked_List;

import java.util.Scanner;

public class QueueUsingLinkedList
{
    Node front, rear;

    void enqueue(int data) // insert right
    {
        Node n = new Node(data); //created node
        if(rear==null)
        {
            front=rear=n;
        }
        else
        {
           rear.next=n;
            rear=n;
        }
    }
    void dequeue() //delete left
    {
        if(front==null)
        {
            System.out.println("\nList is empty.");
        }
        else
        {
            Node t = front;
            if(front==rear)//1
            front = rear = null;
            else
                front=front.next;//2
            System.out.println(t.data+ " Deleted");
        }
    }

    void print_queue()
    {
        if(front==null)
        {
            System.out.println("\n List is empty");
        }
        else
        {
            Node t;
            t=front;
            while(t.next!=null)
            {
                System.out.print("|"+t.data+"|-");
                t=t.next;
            }
        }
    }

    public static void main(String[] args)
    {
        QueueUsingLinkedList obj = new QueueUsingLinkedList();
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.print("\nQueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter Data:");
                    int data=in.nextInt();
                    obj.enqueue(data);
                    break;
                case 2:
                    obj.dequeue();
                    break;

                case 3:
                    obj.print_queue();
                    break;
                case 0:
                    System.out.print("\n Exiting...");
                    break;
                default:
                    System.out.print("\nWrong Choice given.");
                    break;

            }
        } while (choice != 0);
    }
}
