package abstraction;

public class Kane extends Wrestler {// when we are inheriting the class we have to use extends keyword

	@Override
	public void thememusic() {
	System.out.println("Play Kane's theme Music");
	}

	@Override
	public void finisher() {
		System.out.println("Tombstone");
	}

}
