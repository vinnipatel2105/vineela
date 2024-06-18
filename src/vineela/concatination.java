package vineela;

public class concatination {
	public static void main(String [] args) {
//
		concatination a =new concatination();
		a.test();
		a.testadd();
		a.mul(12,12);
		a.div(40, 10);
		a.sub(50, 40);
	}
// with no input and output
public void test() {
	System.out.println("this 1 method");	
}
//with no input and with output
public void testadd() {
	int a =10;
	int b= 60;
	System.out.println(a+b);	
}
// with input and output
public void mul(int x, int y) {
	System.out.println(x*y);
}
public void div(int x,int y) {
	System.out.println(x/y);
}
public void sub(int x,int y) {
	System.out.println(x-y);
}

}
