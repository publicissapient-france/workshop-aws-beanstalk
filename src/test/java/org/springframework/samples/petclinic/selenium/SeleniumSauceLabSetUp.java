package org.springframework.samples.petclinic.selenium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumSauceLabSetUp extends TestCase {

	protected WebDriver driver;

	protected String targetUrl;

	public void setUp() throws Exception {
		DesiredCapabilities capabillities = DesiredCapabilities.firefox();

		// TODO : Add the desired capabilities properties to choose which
		// browser version and OS you want to emulate.

		// TODO : Add a name to your test.

		this.driver = new RemoteWebDriver(new URL(System.getProperty("saucelabs.account.url")), capabillities);
		this.targetUrl = System.getProperty("selenium.target.host");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Running selenium tests against: " + targetUrl);
	}

	public void tearDown() throws Exception {
		this.driver.quit();
	}

}
