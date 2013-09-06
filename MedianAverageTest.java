import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianAverageTest
{
    private static double average(ArrayList<Double> nums)
    {
        double sum = 0;
        
        for (int i = 0; i < nums.size(); i++)
            sum += nums.get(i);
            
        return sum / nums.size();
    }
    
    private static double median(ArrayList<Double> nums)
    {
        Collections.sort(nums);
        
        int len = nums.size();
        int mid = len / 2;
        double median = nums.get(mid);
        
        if (len % 2 == 0)
            median = (median + nums.get(mid + 1)) / 2;
        
        return median;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Average: ");
        String averageInput = reader.nextLine();
        
        System.out.print("Median: ");
        String medianInput = reader.nextLine();
        
        String[] splitAverage = averageInput.split(" ");
        ArrayList<Double> averageNums = new ArrayList<Double>();
        
        for (int i = 0; i < splitAverage.length; i++)
        {
            try
            {
                Double num = Double.valueOf(splitAverage[i]);
                averageNums.add(num);
            }
            catch (NumberFormatException ex)
            {
            }
        }
        
        String[] splitMedian = medianInput.split(" ");
        ArrayList<Double> medianNums = new ArrayList<Double>();
        
        for (int i = 0; i < splitMedian.length; i++)
        {
            try
            {
                Double num = Double.valueOf(splitMedian[i]);
                medianNums.add(num);
            }
            catch (NumberFormatException ex)
            {
            }
        }
        
        double average = average(averageNums);
        double median = median(medianNums);
        
        System.out.println("Average is " + average + " and median is " + median);
    }
}