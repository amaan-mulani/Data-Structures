package Linked_List;

import java.util.Scanner;

public class CircularLinkedList
{
    Node root,last;

    void insert_left(int data)
    {
        Node n = new Node(data); //created node
        if(root==null)
        {
            root= last = n;
            last.next=root;
        }
        else
        {
            n.next = root;
            root = n;
            last.next=root;
        }
    }

    void insert_right(int data)
    {
        Node n = new Node(data); //created node
        if(root==null)
        {
            root= last = n;
            last.next=root;
        }
        else
        {
            last.next=n;
            n=last;
            last.next=root;
        }
    }
    void delete_left()
    {
        if(root==null)
        {
            System.out.println("\nList is empty.");
        }
        else
        {
            Node t = root;//1
            if(root==last)
                root=last=null;
            root = root.next; //2
            last.next=root;//3
            System.out.println(t.data+ " Deleted");
        }
    }

    void delete_right()
    {
        if(root==null)
        {
            System.out.println("\nList is empty.");
        }
        else
        {
            Node t, t2;
            t=t2=root;

            while(t.next!=root)
            {
                t2=t;
                t=t.next;
            }

            if(root==last)
                root=last=null;
            else
            {
                last=t2;//3
                last.next=root;//4
                System.out.println(t.data+ "Deleted");
            }

        }
    }

    void print_list()
    {
        if(root==null)
        {
            System.out.println("\n List is empty");
        }
        else
        {
            Node t;
            t=root;
            do
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;

            }while(t !=root);

        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList ll=new CircularLinkedList();
        int choice, data, ref, new_element, element;

        do
        {
            System.out.println("--Circular Linked List Menu--");
            System.out.println("1.Insert Left");
            System.out.println("2.Insert Right");
            System.out.println("3.Delete Left");
            System.out.println("4.Delete Right");
            System.out.println("5.Print List");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the value to insert at left: ");
                    data=sc.nextInt();
                    ll.insert_left(data);
                    break;

                case 2:
                    System.out.println("Enter the value to insert at right: ");
                    data= sc.nextInt();
                    ll.insert_right(data);
                    break;

                case 3:
                    System.out.println("Deleted left");
                    ll.delete_left();
                    break;

                case 4:
                    System.out.println("Deleted right");
                    ll.delete_right();
                    break;

                case 5:
                    System.out.println("Circular Linked List: ");
                    ll.print_list();

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");

            }

        }while(choice!=6);
    }
}
