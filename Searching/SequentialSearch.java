package Searching;


import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearch
{
    static int sequential_search(int a[], int key)
    {
        int i;
        for(i =0; i<a.length;i++)
        {
            if(key==a[i])
            {
                return i;
            }
        }return -1;
    }
    public static void main(String[] args)
    {
        int a[] = {11,32,1,65,23,23,12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key: ");
        int key = sc.nextInt();
        int response=sequential_search(a,key);

        if (response ==-1)
        {
            System.out.println(key+" Not found.");
        }
        else
        {
            System.out.println("Found "+key+ " at " +response+ " in "+ Arrays.toString(a));
        }
    }
}
