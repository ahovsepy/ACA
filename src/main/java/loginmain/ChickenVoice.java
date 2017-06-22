package loginmain;

public class ChickenVoice	
{
	static EggVoice mAnotherOpinion;	
	
	public static void main(String[] args)
	{
		mAnotherOpinion = new EggVoice();	
		System.out.println("The Beginning...");
		mAnotherOpinion.start(); 			
		
		for(int i = 0; i < 5; i++)
		{
			try{
				Thread.sleep(1000);		
			}catch(InterruptedException e){}
			
			System.out.println("Chicken!");
		}
		
		if(mAnotherOpinion.isAlive())	// double checks if the opponent is done The java.lang.Thread.isAlive() method tests if this // thread is alive. A thread is alive if it has been started and has not yet died.
		{
			try{
				mAnotherOpinion.join(); //wait until the opponent is not done  Blocks the calling thread //until the thread represented by this instance terminates, while continuing to perform standard COM //and SendMessage pumping.
			}catch(InterruptedException e){}
			
			System.out.println("Egg was the first!");
		}
		else	
		{
			System.out.println("Chicken was the first!");
		}
		System.out.println("The End!");	
	}
}


