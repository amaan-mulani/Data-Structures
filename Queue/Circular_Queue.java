package Queue;

import java.util.Scanner;

public class Circular_Queue {

    int MaxSize, queue[];
    int front = 0;
    int rear = -1;
    int count = 0;

    void create_queue(int size) {
        MaxSize = size;
        queue = new int[MaxSize];
    }

    void enqueue(int data) {
        rear = (rear + 1) % MaxSize;
        queue[rear] = data;
        count++;
        //queue[++rear] = data;
    }

    boolean is_full() {
        //return(rear==MaxSize-1); //Condition check karke return kar do, kyu if else karna he.
        return (count == MaxSize);
    }

    int dequeue() {
        int data = queue[front];
        front = (front + 1) % MaxSize;
        count--;
        return data;

    }

    boolean is_empty() {

        return (count == 0); //Condition check karke return kar do, kyu if else karna he.
    }

    void print_queue() //print stack on lifo manner(i.e from top to bottom)
    {
//        for(int i=front; i<=rear; i++)
//        {
//            System.out.print(queue[i]+" ");
//        }
        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % MaxSize;
        }
    }

    public static void main(String[] args) {

        System.out.println("Queue");
        Scanner sp = new Scanner(System.in);
        Queue.Circular_Queue qc = new Queue.Circular_Queue();
        System.out.println("Enter the size of queue");
        int sz = sp.nextInt();
        qc.create_queue(sz);


        int choice;
        do {
            System.out.println();
            System.out.println("------Queue Menu------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print Queue");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = sp.nextInt();

            switch (choice) {
                case 1:
                    if (qc.is_full()) {
                        System.out.println("Queue is full, cannot enqueue.");
                    } else {
                        System.out.print("Enter value to enqueue: ");
                        int v = sp.nextInt();
                        qc.enqueue(v);
                        System.out.println("Enqueued " + v);
                    }
                    break;

                case 2:
                    if (qc.is_empty()) {
                        System.out.println("Queue is empty, nothing to dequeue.");
                    } else {
                        qc.dequeue();
                        System.out.println("Queue after dequeue are: ");
                        qc.print_queue();
                    }
                    break;

                case 3:
                    if (qc.is_empty()) {
                        System.out.println("Queue is empty, nothing to print.");
                    } else {
                        System.out.println("Current Queue: ");
                        qc.print_queue();
                    }
                    break;

                case 4:
                    System.out.println("Exiting..");
                    break;

                default:
                    System.out.println("Please enter a valid choice.");
            }

        } while (choice != 4);
        sp.close();
    }
}


