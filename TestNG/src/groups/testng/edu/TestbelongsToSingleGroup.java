package groups.testng.edu;

import org.testng.annotations.Test;

public class TestbelongsToSingleGroup {
	
	@Test(groups = {"sanity-group"})
	public void Test1() {
		System.out.println("This belongs to sanity group");
		
	}

	@Test()
	public void Test2() {
		System.out.println("This belongs no group");
		
	}
	@Test(groups = {"sanity-group"})
	public void Test3() {
		System.out.println("This belongs to sanity group");
		
	}
}
