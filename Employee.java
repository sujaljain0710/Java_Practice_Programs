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
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Employee Name: ");
    String name = sc.nextLine();
	

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
	sc.nextLine();
	
	
	System.out.println("Enter department name: ");
	String department= sc.nextLine();
	
	System.out.print("Enter Salary: ");
    double salary = sc.nextDouble();
    sc.nextLine();
	
	employees.add(new Employee(id,name,age,department,salary));
	
	System.out.println("Employee Added Successfully");
	
	
	
	}
	
	
	
	public void display(){
	   System.out.println("Employee Id is:"+ id);
	   System.out.println("Employee name is:" + name);
	   System.out.println("Employee age is" + age);
	   System.out.println("Employee department is" + department);
	   System.out.println("Employee salary is" + salary);
	   System.out.println();
	   System.out.println();
	   
	}
	
	public static void searchById(List<Employee> employees,int id){
		
		for(Employee emp: employees){
			
			if(emp.id == id){
				emp.display();
				return;
			}
			
		}
	
	}
	
	
	
	public static void main(String[]args){
		
		List<Employee> employees=new ArrayList<>();
		/*employees.add(new Employee(101,"Sam",23,"IT"));
		employees.add(new Employee(102,"Ram",24,"Sales"));
		employees.add(new Employee(103,"Ravi",23,"IT"));
		employees.add(new Employee(104,"Radhika",23,"Sales"));
		employees.add(new Employee(105,"Sanika",23,"HR"));
		
	    
		
		for(Employee emp: employees){
			emp.display();		
	    }
		
		searchById(employees,101);*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Employee Management System");
		System.out.println("====================");
		System.out.println("Choose the task:-");
		System.out.println("1.Add Employee");
		System.out.println("2.Search Employee");
		System.out.println("3.Display All Employees");
		System.out.println("4.Exit");
		
		int choice = sc.nextInt();
		
		switch(choice){
			
			case 1:{
			     System.out.println("Adding the employee");
				 addEmployee(employees);
				 break;
			}
			
			case 2:{
				System.out.println("Search the employee By Id");
				
				break;
				
			}
			case 3:{
				System.out.println("Details Of All EMployees are:-");
				break;
				
			}	
			
			default:{
				System.out.println("Please enter a Valid Option")
			}
			
		}
		
		
		
	
	}
	
	
}
