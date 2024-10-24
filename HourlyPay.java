/**
 *
 * @author iandr
 */
package midtermreview;
public class HourlyPay {
    public static class Employee {
        private String Name;
        private double Hours;
        private double PayRate;
        private double Holdings;
        private double Payment;

    public Employee(String Name, double Hours, double PayRate) {
        this.Name = Name;
        this.Hours = Hours;
        this.PayRate = PayRate;
    }

    public Employee(String Name, double Hours, double PayRate, double Holdings) {
        this.Name = Name;
        this.Hours = Hours;
        this.PayRate = PayRate;
        this.Holdings = Holdings;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setHours(double Hours) {
        this.Hours = Hours;
    }

    public void setPayRate(double PayRate) {
        this.PayRate = PayRate;
    }

    public void setHoldings(double Holdings) {
        this.Holdings = Holdings;
    }

    public String getName() {
        return Name;
    }

    public double getHours() {
        return Hours;
    }

    public double getPayRate() {
        return PayRate;
    }

    public double getHoldings() {
        return Holdings;
    }

    public double getPayment() {
        return Payment;
    }
    
    public void CalculatePay()
    {
        this.Payment=(this.Hours*this.PayRate)-this.Holdings;
    }
  }
}