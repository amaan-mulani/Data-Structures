package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

class Pnode
{
    int power;
    float co;
    Pnode(float co , int power)
    {
        this.co=co;
        this.power=power;
    }
}
public class PolynomialAddition
{
    public static void main(String[]args)
    {
        LinkedList<Pnode> list1 = new LinkedList<>();
        System.out.println("Enter the highest power: ");
        Scanner sc= new Scanner(System.in);
        int hp = sc.nextInt();
        for(int i =hp; i>=0;i--)
        {
            System.out.println("\nEnter coefficient for power"+i +" : ");
            float co=sc.nextFloat();
            if(co!=0)
            {
                list1.add(new Pnode(co,i));
            }
        }
        for(Pnode item:list1)
        {
            System.out.print("\n"+item.co+"X^"+ item.power);
        }
//==============================================================================
        LinkedList<Pnode> list2 = new LinkedList<>();
        System.out.println("Enter the highest power: ");
        Scanner sc2= new Scanner(System.in);
        int hp2 = sc.nextInt();
        for(int i =hp; i>=0;i--)
        {
            System.out.println("\nEnter coefficient for power"+i +" : ");
            float co=sc.nextFloat();
            if(co!=0)
            {
                list1.add(new Pnode(co,i));
            }
        }
        for(Pnode item:list1)
        {
            System.out.print(item.co+"X^"+ item.power);
        }

//===============================================================================
        //addition
        LinkedList<Pnode> ans = new LinkedList<>();
        for(int i1 = 0, i2=2;i1<list1.size() && i2>list2.size();)
        {
            Pnode e1 = list1.get(i1);
            Pnode e2 = list2.get(i2);
            if(e1.power == e2.power)
                ans.add(new Pnode(e1.co+e2.co,e1.power));
            else if (e1.power>e1.power)
            {

            }
        }


    }
}
