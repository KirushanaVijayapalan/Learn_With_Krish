
public class Application {

	public static void main(String[] args) {
	Employee employee1=new Employee("CAE001",524312,"Kirushana","965482316v","Vavuniya");
	Employee employee2=new Employee("CAE002",524313,"Thanu","995482316v","Jaffna");
	Employee employee3=new Employee("CAE003",524314,"Vathany","706548236v","Colombo");
	
	System.out.println(employee1.equals(employee2));
	
	
	System.out.println("Employee 1 : "+employee1);
	System.out.println("Employee 2 : "+employee2);
	System.out.println("Employee 3 : "+employee3);
	
	
	System.out.println(employee1.equals(employee3));
	
	employee2.setEmpId("CAE001");
	employee2.setEmpCode(524312);
	
System.out.println(employee1.equals(employee2));
	
	
	System.out.println("Employee 1 : "+employee1);
	System.out.println("Employee 2 : "+employee2);
	System.out.println("Employee 3 : "+employee3);

	}

}
