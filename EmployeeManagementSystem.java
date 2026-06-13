import java.util.*;

class Employee{

	int id;
	String name;
	int age;
	double salary;
	String department;

	public Employee(int id,String name,int age,double salary,String department){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}

	public static void addEmployee(List<Employee> employees){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Employee ID: ");
		int id=sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String name=sc.nextLine();

		System.out.print("Enter Age: ");
		int age=sc.nextInt();

		System.out.print("Enter Salary: ");
		double salary=sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter Department Name: ");
		String department=sc.nextLine();

		employees.add(new Employee(id,name,age,salary,department));

		System.out.println("Employee Added Successfully");
	}

	public void display(){

		System.out.println("Employee Id is: "+id);
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee Age is: "+age);
		System.out.println("Employee Department is: "+department);
		System.out.println("Employee Salary is: "+salary);
		System.out.println();
	}

	public static void searchById(List<Employee> employees,int id){

		for(Employee emp:employees){

			if(emp.id==id){

				emp.display();
				return;
			}
		}

		System.out.println("Employee Not Found");
	}

	public static void displayAllEmployees(List<Employee> employees){

		if(employees.isEmpty()){

			System.out.println("No Employees Found");
			return;
		}

		for(Employee emp:employees){

			emp.display();
		}
	}

	public static void removeEmployee(List<Employee> employees,int id){

		for(int i=0;i<employees.size();i++){

			if(employees.get(i).id==id){

				employees.remove(i);
				System.out.println("Employee Removed Successfully");
				return;
			}
		}

		System.out.println("Employee Not Found");
	}

	public static void updateSalary(List<Employee> employees,int id,double newSalary){

		for(Employee emp:employees){

			if(emp.id==id){

				emp.salary=newSalary;
				System.out.println("Salary Updated Successfully");
				return;
			}
		}

		System.out.println("Employee Not Found");
	}

	public static void highestPaidEmployee(List<Employee> employees){

		if(employees.isEmpty()){

			System.out.println("No Employees Found");
			return;
		}

		Employee highest=employees.get(0);

		for(Employee emp:employees){

			if(emp.salary>highest.salary){

				highest=emp;
			}
		}

		System.out.println("Highest Paid Employee Details:");
		highest.display();
	}
}

public class EmployeeManagementSystem{

	public static void main(String[] args){

		List<Employee> employees=new ArrayList<>();
		Scanner sc=new Scanner(System.in);

		while(true){

			System.out.println("\n===== Employee Management System =====");
			System.out.println("1.Add Employee");
			System.out.println("2.Search Employee");
			System.out.println("3.Display All Employees");
			System.out.println("4.Remove Employee");
			System.out.println("5.Update Salary");
			System.out.println("6.Highest Paid Employee");
			System.out.println("7.Exit");

			System.out.print("Enter Choice: ");
			int choice=sc.nextInt();

			switch(choice){

				case 1:

					Employee.addEmployee(employees);
					break;

				case 2:

					System.out.print("Enter Employee ID: ");
					int searchId=sc.nextInt();

					Employee.searchById(employees,searchId);
					break;

				case 3:

					Employee.displayAllEmployees(employees);
					break;

				case 4:

					System.out.print("Enter Employee ID: ");
					int removeId=sc.nextInt();

					Employee.removeEmployee(employees,removeId);
					break;

				case 5:

					System.out.print("Enter Employee ID: ");
					int updateId=sc.nextInt();

					System.out.print("Enter New Salary: ");
					double newSalary=sc.nextDouble();

					Employee.updateSalary(employees,updateId,newSalary);
					break;

				case 6:

					Employee.highestPaidEmployee(employees);
					break;

				case 7:

					System.out.println("Thank You For Using The Services");
					System.exit(0);

				default:

					System.out.println("Please Enter A Valid Option");
			}
		}
	}
}