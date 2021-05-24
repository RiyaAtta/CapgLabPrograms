package Day7.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionTest {
	Addition ad=new Addition();
	@Test
	public void addTest()
	{
		int expectedResult=11;
		int actualResult=ad.add(5, 6);
		assertEquals(expectedResult,actualResult);
	}

}