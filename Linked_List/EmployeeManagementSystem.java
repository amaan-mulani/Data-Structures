package Linked_List;

import java.util.LinkedList;

class Enode
{
    int id;
    String name;
    double salary;
    Enode next;

    Enode(int id, String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.next=null;
    }
}
public class EmployeeManagementSystem
{
    Enode root;
    void addEmployee(int id, String name, double salary)
    {
        Enode node=new Enode(id, name, salary);
        if(root==null)
        {
            root = node;
        }
        else
        {
            node.next = root;
            root = node;
        }

    }
    void searchEmployee(int id)
    {
        if(root==null)
        {
            System.out.println("\nList is empty. There are no employees");
        }
        else
        {
            Enode t;
            t=root;
            boolean flag = false;
            while(t!=null)
            {
                if (t.id==id)
                {
                    System.out.println("Found "+id);
                    flag=true;
                }

            }
            if (!flag)
            {
                System.out.println("Not Found., ");
            }
        }

    }
    void updateEmployee(int id, String newName, double newSalary)
    {
        if(root==null)
        {
            System.out.println("\nList is empty. There are no employees");
        }
        else
        {
            Enode t;
            t=root;
            while(t!=null)
            {
                if (t.id==id)
                {
                    t.name=newName;
                    t.salary=newSalary;
                    System.out.println("Updated Employee "+id+"\n Updated to: "+t.name+ " & " +t.salary);
                }
            }
        }
    }
    void deleteEmployee(int id)
    {
        if (root == null)
        {
            System.out.println("\n List is empty");
        }
        else
        {
            Enode t, t2;
            t = t2 = root;//1
            while (t != null)//2

            {
                if (t.id == id)
                {
                    System.out.println("Found " + id);
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
                    System.out.println(t.id+ "Deleted");
                    return;
                }
                t2=t;
                t = t.next;
            }
            if(t==null)
            {
                System.out.println("\nElement " + id + "not found.");
            }
        }
    }
    void displayEmployee()
    {

    }

    public static void main(String[] args)
    {
        LinkedList<Enode>  empList = new LinkedList<>();
    }
}
