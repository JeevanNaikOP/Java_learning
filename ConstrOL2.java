public class Second extends First{
	
	String name = "child class";
	
	
	 Second(String name) 
	 {
		super("parent class");
	 }


	public void dispData()
	 {
		 super.dispData();
		 System.out.println("derived name:"+name);
	 }
	
	

}
