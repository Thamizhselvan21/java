package Day1;

class Student 
{
	int Sid;
	String Sname;
	Student()//default constructor
	{
		Sid=101;
		Sname="unknown name";
	}
	Student(int i,String n)//parameterized constructor
	{
		Sid=i;
		Sname=n;
	}
	public void display()
	{
		System.out.println(Sid+" "+Sname);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		
		Student S1=new Student();//invoke default constructor
		Student S2=new Student();//invoke default constructor
		Student S3=new Student(103,"Arun");//invoke parameterized constructor
		S2.Sid=102;
		S2.Sname="Priya";
		S1.display();
		S2.display();
		S3.display();
		
		
	}

}
