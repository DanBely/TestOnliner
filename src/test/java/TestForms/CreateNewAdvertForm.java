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
import webdriver.elements.Select;
import webdriver.elements.TextBox;

/**
 *
 * @author d.bely
 */
public class CreateNewAdvertForm extends BaseForm {
    
    private static By formlocator = By.className("ten-skin");

    String title = "Hello Beacon";
    String msg = "I love beacon";
    String price = "10";
    String section_text = "Все остальное, что не вошло в другие категории.";
    
    private TextBox title_tb = new TextBox(By.name("subject"), "Enter title");
    private TextBox msg_tb = new TextBox(By.id("message"), "Enter message");
    private TextBox short_msg_tb = new TextBox(By.name("topic_desc"), "Enter short message");
    private TextBox price_text_tb = new TextBox(By.name("topic_price"), "Enter price");
    private Select section_slt = new Select(By.name("f"), "Chose section");
    private Button baraholka_btn = new Button(By.xpath("//*[@class='onav__ul']/li[6]"), "click Baraholka");
    private Button createTheme_btn = new Button(By.partialLinkText("Разместить объявление"), "click Create theme");
    private Button create_btn = new Button(By.id("btnFleaMarketPostingSubmitEnabled"), "Add advert");
    private Label baraholkaBar_lb = new Label(By.className("onav__ul"), "Verify main buttonbar");
    private Label title_lb = new Label(By.xpath("//*[@class='m-title']/h1"), "Verify title");
    
    public CreateNewAdvertForm() {
        super(formlocator, "Baraholka page");
    }
    
    public void assertBaraholka(){
        assert(baraholkaBar_lb.isPresent());
    }
    
    public void gotoBaraholka(){
	baraholka_btn.click();
	}
	
    public void createTheme(){
	createTheme_btn.click();
	}
	
    public void fillAdvert(){
        section_slt.Select_in(section_text);
	title_tb.type(title);
        msg_tb.type(msg);
        short_msg_tb.type(msg);
        price_text_tb.type(price);
        create_btn.click();
	}
    
    public void assertAdvert(){
        assertEquals(title, title_lb.getText());
    }
}
