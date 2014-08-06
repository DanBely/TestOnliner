/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestForms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

/**
 *
 * @author Dan Bely
 */
public class LoginForm extends BaseForm {
   
   private static By formlocator= By.id("minWidth");
   
   String username = "KronosJuniorL";
   String password = "123456kak";
    
   private TextBox login_tb = new TextBox(By.id("username"), "Enter username");
   private TextBox password_tb = new TextBox(By.id("password"), "Enter password");
   private Button submit_btn = new Button(By.xpath("//*[@class='btn']"), "Enter on account");
   private Label username_lb = new Label(By.partialLinkText(username), "Verify enter profile");
   private Label logo_lb = new Label(By.xpath("//a[@href='http://www.onliner.by']"), "Verify onliner.by logo");
   
    public LoginForm() {
        super(formlocator, "Login page");
    }
    
    public void logOn() {
    	login_tb.type(username);
        password_tb.type(password);
    	submit_btn.click();
    }
    
    public void assertUser(){
		assertEquals(username, username_lb.getText());
	}
    
    public void assertLogo(){
		assert(logo_lb.isPresent());
	}
}
