package ba.unsa.etf.rpr.projekat;

import java.time.LocalDate;

public class Employee {
    private int employeeId;
    private String name, lastName, adress, eMail;
    private LocalDate birthDate;
    private int password;

    public Employee(int employeeId, String name, String lastName, String adress, String eMail, LocalDate birthDate, int password) {
        this.employeeId = employeeId;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.eMail = eMail;
        this.birthDate = birthDate;
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
