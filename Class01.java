class CCircle{
	String Cal_area;
	int length;
	int width;
	int height;
	double radius;
	double pi = 3.14159;	
	
	void setradius(double r) {
		radius=r;
	}
	void setlength(int l) {
		length=l;
	}
	void setwidth(int w) {
		width=w;
	}
	void setheight(int h) {
		height=h;
	}
	void show() {
		System.out.println("半徑 = "+radius);
		System.out.println("球體體積 = "+pi*radius*radius*radius*4/3);
		System.out.println();
		System.out.println("長 = "+length+",寬 = "+width+",高 = "+height);
		System.out.println("立方體表面積 = "+2*(length*width+length*height+width*height));
	}
}
public class Class01 {
public static void main (String args[]) {
	CCircle ca = new CCircle();
	ca.setradius(10);
	ca.setlength(4);
	ca.setwidth(5);
	ca.setheight(6);
	ca.show();
}
}
