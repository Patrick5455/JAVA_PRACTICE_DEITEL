package exercises_9.inhertiance;

public class CommissionEmployee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNUmber;
    private double grossSales;
    private double commissionRate;

    //five argument constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNUmbe,
                              double grossSales, double commissionRate){

        // implicit call to Object constructor occurs here

        // if gorssSales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Sales must be >= 0.0");

        // if commissionRate is invalid throw exception
        if (commissionRate < 0.0 || commissionRate >1.0)
            throw new IllegalArgumentException("Commissions Rate must be >0.0  and < 1,0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNUmber = socialSecurityNUmbe;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }// end constructor

    // return first name
    public String getFirstName(){
        return  firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public  String getSocialSecurityNUmber(){
        return socialSecurityNUmber;
    }

    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }

    public double getGrossSales(){
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross Saels musrt be >= 0.0");
        return grossSales;
    }

    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {

        if (commissionRate < 0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("Commission Rate must be >0.0 and <1.0");
        return commissionRate;
    }

    // calculate earnings
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString(){

        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", getFirstName(),
                getLastName(), "social security number", getSocialSecurityNUmber(),"gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}// end of class

