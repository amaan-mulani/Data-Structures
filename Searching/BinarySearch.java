package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    static int binary_search(int a[], int key)
    {
        int start,end;
        start=0;
        end=a.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(key==a[mid])
            {
                return mid;
            }
            else if(key>a[mid])
            {
                start = mid + 1;
            }
            else if(key<a[mid])
            {
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args)
    {
        int a[] = {5,7,9,12,17};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key: ");
        int key = sc.nextInt();
        int response=binary_search(a,key);

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
