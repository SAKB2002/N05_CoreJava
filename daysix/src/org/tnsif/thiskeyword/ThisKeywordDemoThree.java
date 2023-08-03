package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree 
{
void print(ThisKeywordDemoThree t)
{System.out.println("Use of this Keyword");}

void display()
{
	print(this);   // Here we have use this keyword as an argument in method call
	
}
	public static void main(String[] args)
	{
		ThisKeywordDemoThree t = new ThisKeywordDemoThree();
		t.display();
	}

}