package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import foundation.AutomationPracticeTestBase;
import pageObjects.HomePage;

public class ViewProduct extends AutomationPracticeTestBase{
	
	@Test
	public void wind17canClickProductTitleViewTheDetails() {
		String expected = "Compositions Cotton\n"
				+ "Styles Casual\n"
				+ "Properties Short Sleeve";
		String actual = new HomePage(this.getDriver(),baseUrl)
				.clickBlouseTitleJumpProductPage()
				.getBlouseProductDetails();

		assertEquals(actual, expected);
	}

	@Test
	public void wind17canClickProductImageViewTheDetails() {
		String expected = "Compositions Cotton\n"
				+ "Styles Casual\n"
				+ "Properties Short Sleeve";
		String actual = new HomePage(this.getDriver(),baseUrl)
				.clickBlouseImageJumpProductPage()
				.getBlouseProductDetails();

		assertEquals(actual, expected);	  
	}
}
