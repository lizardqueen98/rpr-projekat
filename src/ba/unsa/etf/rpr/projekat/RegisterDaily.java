package ba.unsa.etf.rpr.projekat;

import java.time.LocalDate;

public class RegisterDaily {
    private Employee employee;
    private LocalDate checkIn, checkOut;
    private String report;

    public RegisterDaily(Employee employee, LocalDate checkIn, LocalDate checkOut, String report) {
        this.employee = employee;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.report = report;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
