package abstraction;
//If there is mixture of unique(abstract methods) and generalized methods that your sub class will inherit
//then you should use abstract class as superclass

public abstract class Wrestler{// abstract class as the super class
		public void PaymentForWork(int hours) {// general method
			System.out.println("The wrestlers will make $ " +hours* 250 +" for tonights match!!!");
			
	}
		public abstract void thememusic();//abstract method // these are the qualities of wrestlers which are qnique 
		public abstract void finisher();//abstract method

}
