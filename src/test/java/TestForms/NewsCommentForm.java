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
public class NewsCommentForm extends BaseForm{

    private static By formlocator = By.className("ten-skin");
    
    String msg = "Крутой фильм";
    String username = "KronosJuniorL";
    
    private TextBox comment_tb = new TextBox(By.name("message"), "Enter Comment");
    private Button send_btn = new Button(By.xpath("//*[@class='btn-2-green btn-2-green-send']"), "click Send");
    private Button technology_btn = new Button(By.linkText("Технологии"), "click Technology");
    private Link popularNews_ln = new Link(By.className("b-tile-main"), "click Popular news");
    private Label comment_lb = new Label(By.partialLinkText(username), "Verify username");
    
    public NewsCommentForm() {
        super(formlocator, "News page");
        }
    
    public void gotoTechnology(){
	technology_btn.click();
	}
        
    public void gotoPopularNews(){
	popularNews_ln.click();
	}
    
    public void writeComment(){
	comment_tb.type(msg);
        send_btn.click();
	}
    
    public void inspectMessage(){
	assert(comment_lb.isPresent());
	}
}
