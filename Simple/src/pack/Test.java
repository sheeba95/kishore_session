package pack;
@FunctionalInterface
interface Add
{
   public int getSum(int a,int b);
   
}
public class Test {

		    public static void main(String[] args) {
				Add add1 =(a,b) ->  a+b ;
		        System.out.println(add1.getSum(5, 6));		    		
	}

}
