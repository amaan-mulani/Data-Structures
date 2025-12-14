package Linked_List;


import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;


    public class StudentManagementSystem
    {
        public static void main(String[] args)
        {
            LinkedList<Snode> StudentList=new LinkedList<>();
            Scanner in = new Scanner(System.in);
            //adding record

            Snode s=new Snode(1,"abcde","male",26);
            StudentList.add(s);
            Snode s1=new Snode(2,"appu","male",16);
            StudentList.add(s1);
            Snode s2=new Snode(3,"appi","female",6);
            StudentList.add(s2);
            Snode s3=new Snode(4,"appa","male",56);
            StudentList.add(s3);

            for (Snode st : StudentList) {
                st.print_Snode();
            }

            //searching
            System.out.println("\nEnter roll number to search: ");
            int roll=in.nextInt();

            boolean flag = false;
            for(Snode st : StudentList)
            {
                if (st.roll==roll)
                {
                    System.out.println("Found !");
                    st.print_Snode();
                    flag=true;
                }

            }
            if(flag==false)
            {
                System.out.println("Not Found.");
            }
        }
    }

