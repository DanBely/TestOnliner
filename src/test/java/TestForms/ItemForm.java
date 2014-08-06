/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestForms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Link;

/**
 *
 * @author Dan Bely
 */
public class ItemForm  extends BaseForm{

    private static By formlocator = By.className("ten-skin");
    
    String item = "Nokia Lumia 930";
    String sections = "Мобильные телефоны";
   
    private Link catalog_ln = new Link(By.xpath("//*[@href='http://catalog.onliner.by/']"), "click Catalog");
    private Link section_ln = new Link(By.partialLinkText(sections), "click Section");
    private Link item_ln = new Link(By.partialLinkText(item), "click Item");

    public ItemForm() {
        super(formlocator, "Catalog page");
        }	
    
    public void gotoCatalog(){
	catalog_ln.click();
	}
    
    public void gotoSection(){
        assert(section_ln.isPresent());
	section_ln.click();
	}
    
    public void chooseItem(){
        item_ln.click();
	}
    
    public void assertItem(){
	assert(item_ln.isPresent());
	}
          
}
