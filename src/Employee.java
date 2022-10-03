import java.util.Scanner;

public class Employee {
    private int empno;
    private String ename;
    private int salary;

    public Employee(int empno, String ename, int salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }

    class CRUDDemo {
        public static void main(String[] args) {
            int ch;
            Scanner sc=new Scanner(System.in);
            do {
                System.out.println("1. INSERT");
                System.out.println("2. DISPLAY");
                System.out.println("3. SEARCH");
                System.out.println("4. DELETE");
                System.out.println("5. UPDATE");
                System.out.println("ENTER YOUR CHOICE");
                ch= sc.nextInt();

            } while (ch != 0);
        }
    }
}
