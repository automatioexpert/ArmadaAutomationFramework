package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {

	public WebDriver driver;

	public SeleniumUtils(WebDriver driver) {
		this.driver = driver;
	}

	public String getRandomCharacter(int number) {

		return RandomStringUtils.randomAlphanumeric(number);
	}

	public String getRandomNumber(int number) {
		return RandomStringUtils.randomNumeric(number);
	}

	public String randoms(int nos) {
		return RandomStringUtils.random(nos, getCurrentDate());
	}

	public String getCurrentDate() {
		SimpleDateFormat sf = new SimpleDateFormat("MM:dd:YYYY");

		Date d = new Date();

		return sf.format(d);
	}

	public long getCurrentTimeMissec() {

		return System.currentTimeMillis();
	}

	public int roundOffValue(double num) {

		return (int) Math.round(num);
	}

}
