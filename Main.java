import java.util.Date;

public class Main extends Student {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
Student s =new Student();
s.setId(41);
int b=  s.getId();
System.out.println("id is "+b);
s.setFullName("surya mopuru");
String a=s.getFullname();
System.out.println("full name is "+a);
s.setBirthDate(1997);
int c=s.getBirthDate();
System.out.println("birth date is "+c);
s.setAvgMark(79.87);
double d=s.getAvgMark();
System.out.println("Average Mark is "+d);


	}

}
