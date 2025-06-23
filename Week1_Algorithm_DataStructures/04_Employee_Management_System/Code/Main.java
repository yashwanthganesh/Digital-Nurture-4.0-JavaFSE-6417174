public class Main {
    public static void main(String[] args) {
        Company company = new Company(5);

        company.addEmployee(new Employee(1, "Yash", "developer", 40000));
        company.addEmployee(new Employee(2, "Ganesh", "tester", 50000));
        company.addEmployee(new Employee(3, "parthipan", "sys admin", 60000));
        company.addEmployee(new Employee(4, "john wick", "hr", 80000));
        company.addEmployee(new Employee(5, "doe", "network engineer", 70000));

        company.traverseEmployee();

        System.out.println();

        System.out.println("Searched Employee");
        company.searchEmployee(4);

        System.out.println();

        System.out.println("Employee Deleted");
        company.deleteEmployee(2);
        company.traverseEmployee();
    }    
}
