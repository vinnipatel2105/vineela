package vineela;

public class Constructors {
	int i;
	public static void main(String[] args) {
	//creation of instance(object)
		Constructors x = new Constructors(100);
		System.out.println(x.i);
		
		}
	//creation of explicit constructor:(without parameters)
	/*public Constructors() {
		i=30;
		
	}*/
	//creation of explicit constructor:(with parameters)
	public Constructors(int a){
		i=a;
	}

}
