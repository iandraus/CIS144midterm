/**
 *
 * @author iandr
 */
package midtermreview2;

public class sales {
    String name;
    double TotalSales;
    
    public sales(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void AccTotal(double s)
    {
        TotalSales+=s;
    }
    
    public double getTotSales()
    {
        return TotalSales;
    }
    
    public double CalcAverage(int m)
    {
        return TotalSales/m;
    }
}