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
import webdriver.elements.Link;
import webdriver.elements.TextBox;

/**
 *
 * @author Dan Bely
 */
public class ThemeForumForm extends BaseForm{

    private static By formlocator = By.className("ten-skin");
    
    String msg = "beacon";
    String title = "Hello Beaconmm";
    
    private TextBox title_tb = new TextBox(By.id("subject"), "Enter title");
    private TextBox msg_tb = new TextBox(By.id("message"), "Enter message");
    private Button createNewTheme_btn = new Button(By.id("submit_text"), "click Create new theme");
    private Button createTheme_btn = new Button(By.id("post"), "click Create theme");
    private Button forum_btn = new Button(By.xpath("//*[@class='onav__ul']/li[7]"), "click Forumbar");
    private Link offtopick_ln = new Link(By.xpath("//a[@href='./viewforum.php?f=11']"), "click Offtopic");
    private Label  theme_lb = new Label(By.partialLinkText(title), "Verify theme");
    
    public ThemeForumForm() {
        super(formlocator, "Forum page");
        }
    
    public void gotoForum(){
        forum_btn.click();
	}
    
    public void gotoOfftopick(){
        offtopick_ln.click();
	}
    
    public void createTheme(){
	createNewTheme_btn.click();
	}
    
    public void writeTheme(){
        title_tb.type(title);
        msg_tb.type(msg);    
        createTheme_btn.click();
	}    
    
    public void inspectTheme(){
	assertEquals(title, theme_lb.getText());
	}
}
