package midtermreview2;
import java.util.Scanner;

/**
 *
 * @author iandr
 */
public class Midtermreview2 {
    public static Scanner sc=new Scanner(System.in);
    public static String StoreName;
    public static double Sales = 0;
    public static int months;
    
    public static void main(String[] args)  {
        System.out.print ("enter name of store: ");
        StoreName = sc.next();
        
        sales ixchel = new sales(StoreName);
        
        System.out.print("how many months you want to evaluate: ");
        months = sc.nextInt();
        
        for(int i=1;i<=months; i++)
        {
            System.out.print("enter month# " +i+ " sales: ");
            Sales = sc.nextDouble();
            ixchel.AccTotal(Sales);
        }
        System.out.println("the store loction: " + ixchel.getName());
        System.out.println("the total sales: $" + ixchel.getTotSales());
        System.out.println("the average sales: $" + ixchel.CalcAverage(months));
    }
}
