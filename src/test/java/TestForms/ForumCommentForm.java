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
public class ForumCommentForm extends BaseForm {
    
    private static By formlocator = By.className("ten-skin");
    
    String text = "Cool";
    String username = "KronosJuniorL";
    
    private TextBox comment_tb = new TextBox(By.id("postmessage"), "Enter message");
    private Button forum_btn = new Button(By.xpath("//*[@class='onav__ul']/li[7]"), "click Forumbar");
    private Button send_btn = new Button(By.xpath("//*[@class='btn-style btn-send']"), "click Send");
    private Link popularTheme_ln = new Link(By.xpath("//a[@href='./viewtopic.php?t=10378336']"), "click Popular theme");
    private Label forumBar_lb = new Label(By.className("onav__ul"), "Verify main buttonbar");
    private Label user_lb = new Label(By.partialLinkText(username), "Verify message");

    public ForumCommentForm() {
        super(formlocator, "Forum page");
    }
    
    public void assertForum(){
        assert(forumBar_lb.isPresent());
    }
    
    public void gotoForum(){
        forum_btn.click();
	}
	
    public void gotoPopularTheme(){
        popularTheme_ln.click();
	}
	
    public void writeComment(){
        comment_tb.type(text);
        send_btn.click();
	}
    
    public void assertMessages(){
        assert(user_lb.isPresent());
    }
    
}
