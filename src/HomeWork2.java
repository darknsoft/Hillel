public class HomeWork2{

	public static void main(String[] args){

		try{
			System.out.println("Hello " + args[0]);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ERROR: " + ex);
			System.out.println("Add some parameter. For example: WORLD");
		}
		catch(Exception ex){
			System.out.println("ERROR: " + ex);
		}
	}

}
