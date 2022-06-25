package june;

abstract class Bike //abstract class
{
	abstract void run();//abstract method
	void stop()
	{
		System.out.println("stopped");
	}
}	
	class Honda extends Bike{
		void run()
		{
			System.out.println("running safely");
		}
	public static void main(String[] args) 
	{
		Honda newbike = new Honda();//Honda is a child class thats why we have to create obj for Honda
		newbike.run();
		newbike.stop();
//bike is a abstract class contains only one abstract method run() its implimentation provided in class honda	
	}

}