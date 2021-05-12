import java.util.*;

public class PairsFunction
 {


    public void pairsThatEqualSum(List<Integer> inputArray, Integer targetSum)
    {

        Collections.sort(inputArray);
        System.out.println("Sorted array:" + inputArray );
        System.out.println("The target sum is: " + targetSum);
        System.out.println();

        for (int i=0; i<inputArray.size(); i++)
        {
            for (int j=inputArray.size(); j>i;j--)
            {
                Integer x = inputArray.get(i) + inputArray.get(j-1);
                if (x.equals(targetSum))
                    {
                    System.out.println("The Match is " + inputArray.get(i) + ", " + inputArray.get(j - 1));
                    }
                
            }

        }





    }
    public static void main(String[] args)
        {
            PairsFunction obj1 = new PairsFunction();
            List<Integer> inputArray = new ArrayList<>(Arrays.asList(35, 23 , 12, 11, 44, 72, 80, 9, -1));
            obj1.pairsThatEqualSum(inputArray,35);
        }

 }
