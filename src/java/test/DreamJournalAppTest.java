/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Brecht
 */
public class DreamJournalAppTest {
        private static final String PASSWORD = "password";
	private static final String NAME = "user1";
	private static final String EMAIL = "user1@gmail.com";
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		// TODO you have to modify this to the name of your own project
		driver.get("http://localhost:8080/r0457206_DreamJournal/");
	}
	
	@After
	public void clean(){
		driver.quit();
	}

	@Test
	public void test_Form_is_shown_again_with_errors_if_name_left_empty () {
        fillInName("");
        fillInEmail(EMAIL);
        fillInPassword(PASSWORD);
        
        clickOnButton();
        checkOnSamePageAfterError();
		
	}

	@Test
	public void test_Form_is_shown_again_with_errors_if_email_left_empty () {
        fillInName(NAME);
        fillInEmail("");
        fillInPassword(PASSWORD);
        
        clickOnButton();
        checkOnSamePageAfterError();
	}

	@Test
	public void test_Form_is_shown_again_with_errors_if_password_left_empty () {
        fillInName(NAME);
        fillInEmail(EMAIL);
        fillInPassword("");
        
        clickOnButton();
        checkOnSamePageAfterError();	
	}

	@Test
	public void test_Overview_is_shown_if_form_was_properly_filled_in () {
        fillInName(NAME);
        fillInEmail(EMAIL);
        fillInPassword(PASSWORD);
        
        clickOnButton();
        
        assertEquals("Overview of Users", driver.getTitle());
		
	}

	private void fillInName(String name) {
		WebElement nameField = driver.findElement(By.id("name"));
        nameField.clear();
        nameField.sendKeys(name);
	}

	private void fillInEmail(String email) {
		WebElement emailField = driver.findElement(By.id("email"));
        emailField.clear();
        emailField.sendKeys(email);
	}

	private void fillInPassword(String password) {
		WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(password);
	}

	private void clickOnButton() {
		WebElement calculateButton = driver.findElement(By.id("register"));
        calculateButton.click();
	}

	private void checkOnSamePageAfterError() {
		assertEquals("Registration Form", driver.getTitle());
        List<WebElement> messages = driver.findElements(By.tagName("li"));
        assertEquals(1, messages.size());
	}
	
	private void testTest() {
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.clear();
		passwordField.sendKeys("blabla");
		WebElement button = driver.findElement(By.id("register"));
		button.click();
	}
}
