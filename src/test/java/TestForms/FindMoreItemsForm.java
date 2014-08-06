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
import webdriver.elements.Select;
import webdriver.elements.TextBox;

/**
 *
 * @author Dan Bely
 */
public class FindMoreItemsForm extends BaseForm {
    
    private static By formlocator = By.className("ten-skin");

    String min_price = "300";
    String max_price = "500";
    String year = "2014";
    String min_diagonal = "30\"";
    String max_diagonal = "42\"";
    String resolution = "1920x1080";
    String type = "ЖК";
    
    private TextBox priceMin_tb = new TextBox(By.id("smth2"), "Enter min price");
    private TextBox priceMax_tb = new TextBox(By.id("smth3"), "Enter max price");
    private TextBox year_tb = new TextBox(By.id("lbirthday"), "Enter year");
    private Select type_slt = new Select(By.id("ltype_tv0"), "Chose type");
    private Select diagonalMax_slt = new Select(By.id("ldiagonal_tv_2"), "Choose Max diagonal");
    private Select diagonalMin_slt = new Select(By.id("ldiagonal_tv"), "Chose Min diagonal");
    private Select resolution_slt = new Select(By.id("lresolution_tv0"), "Chose resolution");
    private Button search_btn = new Button(By.name("search"), "click Search");
    private Button catalog_btn = new Button(By.xpath("//*[@class='onav__ul']/li[1]"), "click Catalog");
    private Button table_btn = new Button(By.linkText("Табличный вид для быстрого обзора"), "click Table view");
    private Link  section_ln = new Link(By.partialLinkText("Телевизоры"), "click Section");
    private Label catalogBar_lb = new Label(By.className("onav__ul"), "Verify main buttonbar");
    private Label element_lb = new Label(By.className("pgimage"), "Verify element");
    
    
    public FindMoreItemsForm() {
        super(formlocator, "Catalog Page");
    }
    
    public void assertCatalog(){
        assert(catalogBar_lb.isPresent());
    }
    
    public void gotoCatalog(){
	catalog_btn.click();
    }
    
    public void chooseSection(){
	section_ln.click();
    }
    
    public void fillSearch(){
	priceMin_tb.type(min_price);
	priceMax_tb.type(max_price);
        year_tb.type(year);
        type_slt.Select_in(type); 
        diagonalMin_slt.Select_in(min_diagonal);
        diagonalMax_slt.Select_in(max_diagonal);
        resolution_slt.Select_in(resolution);
        search_btn.click();
    } 
    
    public void tablView(){
	table_btn.click();
    } 
    

    public void inspectElements(){
            assert(element_lb.isPresent());
    }
}