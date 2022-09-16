public class Ex10Test {
    public static void main(String[] args) {
        classEmployeeEx10 harry = new classEmployeeEx10("Hacker,Harry", 50000);
        System.out.println("The name: " + harry.getName());
        System.out.println("salary= "+harry.getSalary());
        harry.raiseSalary(10);
        System.out.println("raise salary :"+harry.getSalary());

    }}