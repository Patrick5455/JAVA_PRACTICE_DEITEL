package exercises_9.inhertiance;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double
                                      grossSales, double commissionRate, double baseSalary){

        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base Salary must >=0.0");

        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary){

        if (baseSalary <0.0)
            throw new IllegalArgumentException("Base Salary must be >=0.0");

        this.baseSalary = baseSalary;
    }

    //get base salary
    public double getBaseSalary(){
        return baseSalary;
    }

    // calculate earnings
    @Override
    public double earnings(){
        return super.earnings() + getBaseSalary();
    }

    //return String representation of BasePlusCommissionPlayer
    @Override
    public String toString(){

        return String.format("%s %s%n%s: %.2f","base salary", super.toString(), "base salary",
                getBaseSalary());
    }
} // end of BasePlusCommissionEmployee
