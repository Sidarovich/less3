package epm.com.jdk1;

public class Example4 {

	public static void main(String[] args) {
		double x=1;
		double y=0;
		double z=0;
		
    
    while (x<2) {
     y=x/2;
     z=2*Math.tan(y) +1;
     System.out.println("Z" + z); 
     x=x+0.1;
    }
	}

}
