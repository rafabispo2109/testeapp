import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
	
		
		private String name;
		private int age;
		private String city;
		private double salary;
	   
			
		public Person(String name, int age, String city, double salary) {
			this.name = name;
			this.age = age;
			this.city = city;
			this.salary = salary;
			
		}

		public String getName() { return name; }
		public int getAge() { return age; }
		public String getCity() { return city; }
		
		public String toststring() {
			return name + " from " + city + " ,Age " + age + " ,Salary" + salary;  
}
}