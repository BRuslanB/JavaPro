package Lesson_Pr_6_2;

public class Programmers implements Workers{
    int id;
    String nickname;
    double salary;
    int bonusSalary;
    double KPIValue;

    public Programmers(){

    }

    public Programmers(int id, String nickname, double salary, int bonusSalary, double KPIValue){
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ", Nick Name: " + nickname + ", Salary: " + salary + ", Bonus Salary: " + bonusSalary + ", KPI Value: " + KPIValue + ", Total Salary: " + getSalary();
    }

    @Override
    public double getSalary() {
        return salary + KPIValue * bonusSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}