package rough;

import org.openqa.selenium.WebDriver;

import utils.SeleniumUtils;

public class RandomTest {

	public static void main(String[] args) {

		WebDriver driver = null;

		SeleniumUtils sel = new SeleniumUtils(driver);
		System.out.println(sel.getRandomCharacter(10));
		System.out.println(sel.getRandomNumber(10));

		String date = sel.getCurrentDate();
		System.out.println(date);

		System.out.println("================");
		System.out.println(sel.getCurrentTimeMissec());

		System.out.println(sel.randoms(19));
		System.out.println("============Round Off=================");
		System.out.println(sel.roundOffValue(14.178));
		System.out.println(sel.roundOffValue(14.278));
		System.out.println(sel.roundOffValue(14.499));
		System.out.println(sel.roundOffValue(14.5));
		System.out.println(sel.roundOffValue(14.785));
		
		
	}

}
