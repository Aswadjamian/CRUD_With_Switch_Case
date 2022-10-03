import java.util.*;
import java.lang.String;
import java.util.function.DoubleToIntFunction;

public class CRUDDemo {
    public static void main(String[] args) {
        Collection<Employee>c=new ArrayList<>();
        int ch;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
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
                   String ename= sc1.nextLine();

                    System.out.println("Enter Salary");
                    int salary= sc.nextInt();

                    c.add(new Employee(eno,ename,salary));
                    break;
                case 2:
                    System.out.println("----------------------------");
                    Iterator<Employee>i=c.iterator();
                    while (i.hasNext()){
                        Employee e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("----------------------------");
                    break;
                case 3:

                    System.out.println("----------------------------");
                    boolean found=false;
                    System.out.println("Enter Employee Number to search");
                    int empno=sc.nextInt();
                    i=c.iterator();
                    while (i.hasNext()){
                        Employee e=i.next();
                        if (e.getEmpno()==empno){
                            System.out.println(e);
                            found=true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("----------------------------");
                    break;

                case 4:
                    found=false;
                    System.out.println("----------------------------");
                    System.out.println("Enter Employee Number to delete");
                    empno=sc.nextInt();
                    i=c.iterator();
                    while (i.hasNext()){
                        Employee e=i.next();
                        if (e.getEmpno()==empno){
                            i.remove();
                            System.out.println("Record deleted Successfully");
                            found=true;
                        }
                    }
                    if (!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("----------------------------");
                    break;

                    case 5:
                        found=false;
                        System.out.println("----------------------------");
                        System.out.println("Enter Employee Number to update");
                        empno=sc.nextInt();
                        ListIterator<Employee>li=((ArrayList<Employee>) c).listIterator();
                        while (li.hasNext()){
                            Employee e=li.next();
                            if (e.getEmpno()==empno){
                                System.out.println("Enter new Name");
                                ename=sc1.nextLine();
                                System.out.println("Enter new Salary");
                                salary= sc.nextInt();
                                li.set(new Employee(empno,ename,salary));
                                System.out.println("Record updated Successfully");
                                found=true;
                            }
                        }
                        if (!found){
                            System.out.println("Record Not Found");
                        }
                        System.out.println("----------------------------");
                        break;

            }

        } while (ch != 0);
    }
}

