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
public class SendMessageForm extends BaseForm {

    private static By formlocator = By.className("ten-skin");
    
    String name = "Lol";
    String title = "Hello Beacon";
    String msg = "Hello my dear Beacon";
    
    private TextBox whom_tb = new TextBox(By.id("compose_uname"), "Enter whom");
    private TextBox title_tb = new TextBox(By.id("compose_subject"), "Enter title");
    private TextBox msg_tb = new TextBox(By.id("compose_text"), "Enter message");
    private Button send_btn = new Button(By.name("post"), "click Send");
    private Link username_ln = new Link(By.xpath("//*[@class='onliner__user__name']/a"), "click Profile");
    private Link msgSentbox_ln = new Link(By.linkText("Отправленные"), "click Sentbox");
    private Link myMsg_ln = new Link(By.className("profpnav__a__sendpm"), "click My messages");
    private Button msg_btn = new Button(By.className("vnav__create__link"), "click Write message");
    private Label sentMsg_lb = new Label(By.partialLinkText(title), "Verify message");
    
    
    
    public SendMessageForm() {
        super(formlocator, "Profile page");
        }
    
    public void gotoProfile(){
	username_ln.click();
	}
    
    public void MyMsg(){
	myMsg_ln.click();
	}    
    
    public void WriteMsg(){
	msg_btn.click();
	}
   
    public void writeWhom(){
	whom_tb.type(name);
        title_tb.type(title);
        msg_tb.type(msg);
        send_btn.click();
	} 
    
    public void gotoSent(){
	msgSentbox_ln.click();
	}
    
    public void assertMessage(){
	assertEquals(title, sentMsg_lb.getText());
	}
}
