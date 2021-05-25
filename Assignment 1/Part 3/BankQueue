public class BankQueue {
    int num=20;
    int[] equitybank = new int[num];
    int front = -1;
    int rear = -1;

    void enqueue(int x){
        if(rear == num-1)
        {
            System.out.println("Out of bounds");
        }

        else if (front==-1 && rear ==-1)

        {
            front=rear=0;
            equitybank[rear]=x;
            System.out.println("New value is: " + equitybank[rear]);
        }

        else
        {
            rear++;
            equitybank[rear]=x;
            System.out.println("New value is: " + equitybank[rear]);
        }

        for (int counter = 0; counter < num; counter++)
        {
            if (equitybank[counter] != 0)
            {

                System.out.print(equitybank[counter]);
                System.out.print(", ");
            }
            else
            {
                System.out.print(" - ");
            }


        }

        System.out.println();

    }

    void dequeue()
    {

        if (front==-1&&rear==-1)
        {
            System.out.println("Empty array");
        }

        else if (front==rear)
        {
            front=rear=-1;
            System.out.println();
            System.out.println("Out of bounds");
        }

        else {

            System.out.println("Dequeued element: " + equitybank[front]);

            front++;

        }

            for (int counter = front; counter <=rear; counter++) {
                if (equitybank[counter] != 0) {

                    System.out.print(equitybank[counter]);
                    System.out.print(", ");
                }
                else
                    {
                    System.out.print(" - ");
                }
            }


        System.out.println();
    }

    void rear(){

        if (front==-1&&rear==-1)
        {
            System.out.println("Underflow");
        }
        else
            System.out.println("Current rear value: " + equitybank[rear]);

    }

    void front(){
        if (front==-1&&rear==-1)
        {
            System.out.println("Underflow");
        }
        else
            System.out.println("Current front value: " + equitybank[front]);
    }

    void size(){

            int y = rear-front+1;
            System.out.println("The size of the bank queue is " + y + " spots long");


    }

    void isEmpty(){
        if (front==-1&&rear==-1)
        {
            System.out.println("Hello!!! Your array is empty");
        }

    }


    public static void main(String[] args) {
        BankQueue myQueue = new BankQueue();
        myQueue.enqueue(187);
        myQueue.enqueue(24);
        myQueue.enqueue(-31);
        myQueue.dequeue();
        myQueue.rear();
        myQueue.front();
        myQueue.isEmpty();
        myQueue.size();


    }
}
