package Linked_List;

import java.util.Scanner;

public class DoubleyLinkedList {
    Dnode root; //single data member

    void insert_left(int data)
    {
        Dnode n = new Dnode(data); //created Dnode
        if(root==null)
        {
            root = n;
        }
        else
        {
            n.right = root;
            root.left=n;
            root=n;
        }
    }

    void insert_right(int data)
    {
        Dnode n = new Dnode(data); //created Dnode
        if(root==null)
        {
            root = n;
        }
        else
        {
            Dnode t = root;//1
            while(t.right!=null)//2
            {
                t=t.right;
            }
            t.right=n;//3
            n.left=t;//4
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
            Dnode t = root;//1
            if(root.right==null)
                root=null;
            else
            {
                root = root.right;//2
                root.left = null;//3
                System.out.println(t.data + " Deleted");
            }
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
            Dnode t, t2;
            t=root;

            while(t.right!=null)
            {
                t=t.right;
            }
            if(t==null)
            {
               root=null;
            }
            else
            {
                t2 = t.left;//3
                t2.right = null;//4
                System.out.println(t.data + "Deleted");
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
            Dnode t;
            t=root;//1
            while(t.right!=null)//2
            {
                t=t.right;
            }
            while(t!=null)//3
            {
                System.out.print("<-|"+t.data+"|->");//4
                t=t.left;
            }

        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DoubleyLinkedList ll=new DoubleyLinkedList();
        int choice, data, ref, new_element, element;

        do
        {
            System.out.println("--Doubley Linked List Menu--");
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
                    System.out.println("Doubley Linked List: ");
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
