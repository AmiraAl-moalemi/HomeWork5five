import java.util.Scanner;

public class classEmployeeEx10 {
    private String name;double salary;
    public classEmployeeEx10(String initialName,double initialSalary){name=initialName;salary=initialSalary;};
    public String getName(){return name=name;}
    public double getSalary(){return salary=salary;}
    public void raiseSalary(double byPercent){
        salary=(salary/(byPercent*100))+getSalary();
    }



}
