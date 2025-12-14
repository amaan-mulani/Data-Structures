package Linked_List;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Linked_List_Linear
{
    Node root; //single data member

    void insert_left(int data)
    {
        Node n = new Node(data); //created node
        if(root==null)
        {
            root = n;
        }
         else
         {
            n.next = root;
            root = n;
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
            Node t = root; //1
            root = root.next; //2
            System.out.println(t.data+ " Deleted");
        }
    }

    void insert_right(int data)
    {
        Node n = new Node(data); //created node
        if(root==null)
        {
            root = n;
        }
        else
        {
            Node t = root;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=n;
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

            while(t.next!=null)
            {
                t2=t;
                t=t.next;
            }
            if(t==null)
                root=null;
            else
            System.out.println(t.data+ "Deleted");
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
            while(t.next!=null)
            {
                System.out.println("|"+t.data+"|->");
                t=t.next;
            }
        }
    }

    boolean search_list(int key)
    {
        if(root==null)
        {
            System.out.println("\n List is empty");
        }
        else
        {
            Node t;
            t=root;
            while(t!=null)
            {
                if(t.data==key)
                {
                    System.out.println("Found "+key);
                }
            }
        }
        return false;
    }

    void insert_after(int ref, int new_element) {
        if (root == null) {
            System.out.println("\n List is empty");
        } else {
            Node t;
            t = root;
            while (t != null) {
                if (t.data == ref) {
                    System.out.println("Found " + ref);
                    Node n = new Node(new_element);
                    n.next = t.next;
                    t.next = n;
                    return;
                }
                t = t.next;
            }
        }
    }

    void delete_element(int element)
    {
        if (root == null)
        {
            System.out.println("\n List is empty");
        }
        else
        {
            Node t, t2;
            t = t2 = root;//1
            while (t != null)//2

            {
                if (t.data == element)
                {
                    System.out.println("Found " + element);
                    if(t==root)
                    {
                        root=root.next;
                    }
                    else if(t.next==null)
                    {
                        t2.next=null;
                    }
                    else {
                        t2.next = t.next;
                    }
                    System.out.println(t.data+ "Deleted");
                    return;
                }
                t2=t;
                t = t.next;
            }
            if(t==null)
            {
                System.out.println("\nElement " + element + "not found.");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Linked_List_Linear ll=new Linked_List_Linear();
        int choice, data, ref, new_element, element;

        do
        {
            System.out.println("--Linked List Menu--");
            System.out.println("1.Insert Left");
            System.out.println("2.Insert Right");
            System.out.println("3.Delete Left");
            System.out.println("4.Delete Right");
            System.out.println("5.Insert After");
            System.out.println("6.Delete Specific Element");
            System.out.println("7.Search Element");
            System.out.println("8.Print List");
            System.out.println("9.Exit");
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
                    System.out.println("Enter a reference element: ");
                    ref=sc.nextInt();
                    System.out.println("Enter the new element: ");
                    new_element = sc.nextInt();
                    ll.insert_after(ref,new_element);
                    break;

                case 6:
                    System.out.println("Enter an element to delete: ");
                    element = sc.nextInt();
                    ll.delete_element(element);
                    break;

                case 7:
                    System.out.print("Enter element to search: ");
                    data = sc.nextInt();
                    ll.search_list(data);
                    break;

                case 8:
                    System.out.println("List: ");
                    ll.print_list();
                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");

            }

        }while(choice!=9);
    }
}

