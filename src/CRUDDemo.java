import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CRUDDemo {
    public static void main(String[] args) {
        Collection<Employee>c=new ArrayList<>();
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("ENTER YOUR CHOICE");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter empno");
                    int eno= sc.nextInt();

                    System.out.println("Enter ename");
                    String ename= sc.nextLine();

                    System.out.println("Enter Salary");
                    int salary= sc.nextInt();
                    c.add(new Employee(eno,ename,salary));
            }

        } while (ch != 0);
    }
}

