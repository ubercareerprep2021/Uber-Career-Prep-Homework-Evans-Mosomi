public class HayStacks {
    int number= 15;
    int[] scratch_stack = new int[number];
    int basecounter = -1;
    void push(int value)
    {
            scratch_stack[basecounter+1] = value;
            System.out.println("Pushed value is: " + scratch_stack[basecounter+1]);


            for(int i=0; i<scratch_stack.length; i++)
            {
                if (scratch_stack[i]!=0)
                {
                    System.out.print(scratch_stack[i]);
                    System.out.print(", ");
                }
                else
                {
                    System.out.print(", - ");
                }
            }

        System.out.println();
            int[] appendedArray = new int [number++];
            for (int j=0; j<appendedArray.length-1; j++)
            {
                appendedArray[j] = scratch_stack[basecounter+1];
            }
        basecounter++;

    }

    void pop()
    {
                if(basecounter==-1)
        {
            System.out.println("Please add values to your stack!");
        }
        else
            {
                System.out.println("The popped value of the stack is:");
                System.out.println(scratch_stack[basecounter]);
                basecounter--;
            }
    }

    void top()
    {
        System.out.println("The top value of the stack is:");
        System.out.println(scratch_stack[basecounter]);
    }

    boolean isEmpty()
    {
        if(scratch_stack[basecounter+1] == 0)
        {
            System.out.println("Empty array");
            return true;
        }
        else
        {
            System.out.println("Array is valid");
            return false;
        }
    }

    int size()
    {
        System.out.println();
        int arraysize = basecounter+1;
        System.out.println("Array size is: " + arraysize);
        return arraysize;
    }

    public static void main(String[] args) {

        HayStacks test = new HayStacks();
        test.push(10);
        test.push(20);
        test.push(-9);
        test.pop();
        test.top();
        test.isEmpty();
        test.size();

    }

}
