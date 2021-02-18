interface Exam{
	void percent_cal();
}
class Student1{
	String name;
	int roll_no,marks1,marks2;
	public Student1(String name, int roll_no, int marks1, int marks2) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll_no = "+roll_no);
		System.out.println("Marks1 = "+marks1);
		System.out.println("Marks2 = "+marks2);
		
	}
}
class Result extends Student1 implements Exam{
	Result(String n, int r, int m1, int m2)
	{
		super(n,r,m1,m2);
	}
	public void percent_cal()
	{
		int total=(marks1+marks2);
		float percent=total*100/200;
		System.out.println ("Percentage: "+percent+"%");
	}
	void display()
	{
		super.display();
	}
}


public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result R = new Result("John",12,93,84);
		R.display();
		R.percent_cal();
		

	}

}
