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
import webdriver.elements.TextBox;

/**
 *
 * @author Dan Bely
 */
public class SearchItemAndCompareForm extends BaseForm {

    private static By formlocator = By.id("container");
    
    String request = "HTC One";
    String item1 = "HTC One (M8) (16Gb)";
    String item2 = "HTC One (32Gb)";
    
    private TextBox request_tbx = new TextBox(By.name("search_text"), "Enter request");
    private Button search_btn = new Button(By.xpath("//button[@class='top-search-button']"), "click Search");
    private Button compare_btn = new Button(By.xpath("//*[@src='http://catalog.onliner.by/pic/btn_compare.gif']"), "click Compare");
    private CheckBox item1_cb = new CheckBox(By.id("htc_one_m8_16"), "Chose first item");
    private CheckBox item2_cb = new CheckBox(By.id("htc_one"), "Chose second item");
    private Label item1_lb = new Label(By.linkText(item1), "Verify first item");
    private Label item2_lb = new Label(By.linkText(item2), "Verify second item");
    
    public SearchItemAndCompareForm() {
        super(formlocator, "Main page");
        }
    
    public void writeRequest(){
	request_tbx.type(request);
        search_btn.click();
	}
    
    public void compare(){
        assert(item1_cb.isPresent());
        assert(item2_cb.isPresent());
        item1_cb.click();
        item2_cb.click();
        compare_btn.click();
	}
    
    public void assertCompare(){
	assertEquals(item1, item1_lb.getText());
	assertEquals(item2, item2_lb.getText());
	}
    
}
