package Queue;
import java.util.Scanner;

public class Linear_Queue {
    int rear, front, MaxSize, queue[];

    void create_Queue(int size) {
        MaxSize = size;
        rear = -1;// init as queue starts from 0th index(Array)
        queue = new int[MaxSize];
        front = 0;
    }

    // Enqueue:
    void Enqueue(int data) {
        queue[++rear] = data;
    }

    // is_full:
    // if tos is at last location return true(full)e else false
    boolean is_full() {

        return (rear == MaxSize - 1);
    }

    // dequue:
    // Remove and returns the topmost element from the queue by reducing tos-1.
    int Dequeue() {
        return (queue[front++]);
    }

    // is_empty
    // Sources at -1, that means queue is empty, so returns true.
    boolean is_empty() {
        return (front > rear);
    }

    // peek
    // only returns the topmost element from the queue.

    void print_queue()// print queue in LIFO manner means from top to bottom
    {
        for (int i = front; i < rear; i++)
            System.out.print(queue[i] + ", ");
    }

    public static void main(String[] args) {
        Linear_Queue obj = new Linear_Queue();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Queue:");
        int size = in.nextInt();
        int choice = 0;
        obj.create_Queue(size);
        do {
            System.out.print("\nqueue Menu");
            System.out.print("\n----------");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    if (!obj.is_full())// not full
                    {
                        System.out.print("\nEnter Data:");
                        int data = in.nextInt();
                        obj.Enqueue(data);
                        System.out.print("\n" + data + " added");
                    } else
                        System.out.print("\nqueue Full");
                    break;
                case 2:
                    if (!obj.is_empty())// not empty
                    {
                        System.out.print("\n" + obj.Dequeue() + " is poped..");
                    } else
                        System.out.print("\nqueue Empty");
                    break;

                case 3:
                    if (!obj.is_empty())// not empty
                    {
                        System.out.print("\nqueue has:\n");
                        obj.print_queue();
                    } else
                        System.out.print("\nqueue Empty");
                    break;
                case 0:
                    System.out.print("\n Thanks for using the code..amar.career");
                    break;
                default:
                    System.out.print("\nWrong Choice given.");
                    break;

            }
        } while (choice != 0);
    }
}
