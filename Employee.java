import java.util.Scanner;
 
public class Employee {
 
 int code;
 String name,city,department;
 float salary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the code :: ");
  code = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
  System.out.print("Enter the city :: ");
  city = in.next();
  System.out.print("Enter the department :: ");
  department = in.next();
 }
 
 public void display() {
  
  System.out.println("Employee code = " + code);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
  System.out.println("Employee city = " + city);
  System.out.println("Employee department = " + department);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[5];
  
  for(int i=0; i<5; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<5; i++) {
   
   e[i].display();
  }
 }
}
