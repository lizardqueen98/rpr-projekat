package ba.unsa.etf.rpr.projekat;

public class Salary {
    private int salaryId;
    private double currentSalary;
    private double commissionPercentage;

    public Salary(int salaryId, double currentSalary, double commissionPercentage) {
        this.salaryId = salaryId;
        this.currentSalary = currentSalary;
        this.commissionPercentage = commissionPercentage;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }
}
