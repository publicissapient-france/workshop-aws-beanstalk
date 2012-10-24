package org.springframework.samples.petclinic.selenium;

public class HomePageSelenium extends SeleniumSauceLabSetUp {

    public void test_home_page_should_have_correct_title() throws Exception {
            driver.get(targetUrl);
            assertEquals("PetClinic :: a Spring Framework demonstration", driver.getTitle());
        }
}
