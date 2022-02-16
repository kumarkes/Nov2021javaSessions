package OOP_Encapsulation;

//By Default class is creating a default constructor if we didn't create manually, thats why we are allow to create object 
//of any class
public class EmpList {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setname("Keshav");
		e1.setAge(20);
		e1.setSalary(200.20);
		
		System.out.println(e1.getInfo());
		e1.setInfo("Keshav", 30, 200.40);
		
		System.out.println(e1.getInfo());
		//System.out.println(e1.getName());
		//System.out.println(e1.getAge());
		//System.out.println(e1.getSalary());
		
		

	}

}
