package prajakta;

public class shape {
	void display()
	{
		System.out.println("Shape");
	}
		}
	class circle extends shape{
		void area()
		{
	    double pie=3.14;
		int r=8;
		Double a=pie*r*r;
		System.out.println("area of circle is =" +a);
	}
	}
	class Square extends shape{
		void Area()
		{
			int a=4;
			int b=a*a;
			System.out.println("Area of Square is" +b);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square S =new Square();
		S.display();
		S.Area();
	}
	}



