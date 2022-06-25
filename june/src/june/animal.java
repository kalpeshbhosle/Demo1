package june;

public abstract class animal 
{
	abstract void animalsound();
	public void sleep() {
		System.out.println("zzzzzzz");
		
	}
}

class pig extends animal{
	public void animalsound() {
	System.out.println("the pig says : 'wee wee wee'");
	}
}

class main{
	public static void main(String [] args) {
	pig newpig = new pig();
	newpig.animalsound();
	newpig.sleep();
}
}