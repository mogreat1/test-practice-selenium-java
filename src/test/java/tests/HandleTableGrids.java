package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basics.BasicMethods;

public class HandleTableGrids extends BasicMethods {

	@BeforeTest
	public void initializeBrowser() {
		initialize();
		driver.get("https://www.flashscore.com/football/england/premier-league/standings/");
	}

	@Test
	public void HandleTableGridsTest() {
		int sumWinValueInt = 0;
		int sumDefeatValueInt = 0;
		WebElement table = driver.findElement(By.id("table-type-1"));

		int rowCount = table.findElements(By.xpath("//tr[contains(@class,'glib-participant')]")).size();

		List<WebElement> wins = table.findElements(
				By.xpath("//tr[contains(@class,'glib-participant')] //*[@class='wins_regular col_wins_regular']"));
		int winCount = wins.size();

		for (int i = 0; i < winCount; i++) {
			String winValue = wins.get(i).getText();
			int winValueInt = Integer.parseInt(winValue);

			sumWinValueInt = sumWinValueInt + winValueInt;

		}
		System.out.println("**************");
		List<WebElement> defeats = table.findElements(
				By.xpath("//tr[contains(@class,'glib-participant')] //*[@class='losses_regular col_losses_regular']"));
		int defeatsCount = defeats.size();

		for (int e = 0; e < defeatsCount; e++) {
			String defeatValue = defeats.get(e).getText();
			int defeatValueInt = Integer.parseInt(defeatValue);

			sumDefeatValueInt = sumDefeatValueInt + defeatValueInt;
		}
		Assert.assertEquals(sumDefeatValueInt, sumWinValueInt);

	}

}
