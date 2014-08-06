/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestForms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.CheckBox;
import webdriver.elements.Label;
import webdriver.elements.Link;
import webdriver.elements.TextBox;

/**
 *
 * @author Dan Bely
 */
public class ProfileForm extends BaseForm{

    private static By formlocator = By.className("ten-skin");
    
    String city = "Минск";
    String interests = "beacon";
    String occupation = "Tester";
    String username = "KronosJuniorL";
    
    private TextBox city_tb = new TextBox(By.name("city"), "Enter city");
    private TextBox occupation_tb = new TextBox(By.name("occupation"), "Enter occupation");
    private TextBox interests_tb = new TextBox(By.name("interests"), "Enter iterests");
    private Button settings_btn = new Button(By.partialLinkText("Настройки"), "click Settings");
    private Button saveInfo_btn = new Button(By.xpath("//*[@class='btn-style btn-send']"), "click Save"); 
    private Link username_ln = new Link(By.xpath("//*[@class='onliner__user__name']/a"), "click Profile");
    private Link updateProfile_ln = new Link(By.partialLinkText("Редактировать личные данные"), "click Edit profile");
    private CheckBox hide_cb = new CheckBox(By.name("hideOnlineStatus"), "check Hide or Visible");
    private CheckBox email_cb = new CheckBox(By.name("showEmail"), "check Email");
    private Label username_lb = new Label(By.partialLinkText(username), "Verify username");
    
    public ProfileForm() {
        super(formlocator, "Profile page");
        }
    
    public void gotoProfile(){
        assert(username_ln.isPresent());
	username_ln.click();
	}
    
    public void assertUser(){
	assertEquals(username, username_lb.getText());
	}
   
    public void chooseSection(){
	updateProfile_ln.click();
	}        
    
    public void assertFieldInfo(){
	assert(city_tb.isPresent());
        assert(occupation_tb.isPresent());
        assert(interests_tb.isPresent());
	}
    
    public void fillProfile(){
        city_tb.type(city);
        occupation_tb.type(interests);
        interests_tb.type(occupation); 
        assert(saveInfo_btn.isPresent());
        saveInfo_btn.click();
	} 
    
    public void gotoSettings(){
        settings_btn.click();
	}        
    
    public void checkSettings(){
        assert(hide_cb.isPresent());
        hide_cb.click();
        assert(email_cb.isPresent());
        email_cb.click();
        assert(saveInfo_btn.isPresent());
        saveInfo_btn.click();
	}
}
