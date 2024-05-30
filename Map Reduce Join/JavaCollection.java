
import java.util.HashMap;

public class JavaCollection {

	public static void main(String[] args) {
HashMap<Integer,String> Employees = new HashMap<>();
		
		Employees.put(20, "John");
		Employees.put(35, "Mary");
		//Employees.put(20, "Alan");
		
		System.out.println(Employees.size());
		
		System.out.println(Employees);
		
		System.out.println(Employees.get(21));
		
		//System.out.println(Collections.singletonList(Employees)); // method 2

	}

}
