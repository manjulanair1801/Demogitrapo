package abstraction;

public class Stone extends Wrestler {//When we are inheriting the class we have to use extends keyword
	
	@Override
	public void thememusic() {
	System.out.println("Play Stone's theme Music");
	}

	@Override
	public void finisher() {
		System.out.println("Stone cold summer");
	}

}

