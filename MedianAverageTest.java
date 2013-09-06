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
            median = (median + nums.get(mid - 1)) / 2;
        
        return median;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Input numbers: ");
        String input = reader.nextLine();
        
        String[] split = input.split(" ");
        ArrayList<Double> parsed = new ArrayList<Double>();
        
        for (int i = 0; i < split.length; i++)
        {
            try
            {
                Double num = Double.valueOf(split[i]);
                parsed.add(num);
            }
            catch (NumberFormatException ex)
            {
            }
        }
        
        double average = average(parsed);
        double median = median(parsed);
        
        System.out.println("Average is " + average + " and median is " + median);
    }
}