package assignment.method;

public class Method1 {
	 public static void main(String[] args) {
		  calc(10,20); 
		  
		 }
		 static void calc(int a, int b) {
		  int add = a+b;
		  int min = a-b;
		  int mul = a*b;
		  int div = a/b;
		  int rem = a%b;
		  
		  System.out.println(a+"+"+b+"="+add);
		  System.out.println(a+"-"+b+"="+min);
		  System.out.println(a+"x"+b+"="+mul);
		  System.out.println(a+"/"+b+"="+"몫:"+div+"나머지:"+rem);
		  
		 }

}
