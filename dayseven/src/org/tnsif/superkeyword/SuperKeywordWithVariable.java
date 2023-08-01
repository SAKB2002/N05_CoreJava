package org.tnsif.superkeyword;
class State{
	String statename="Punjab";
}
class Capital extends State{
	String statename="Hariyana";
	String capital="Chandigarh";
	
	public void display()
	{
		System.out.println(super.statename);
		System.out.println(statename);
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Capital c = new Capital();
		c.display();
		
		

	}

}
