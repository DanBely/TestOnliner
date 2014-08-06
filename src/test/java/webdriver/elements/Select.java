package webdriver.elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

/**
 * Class, Describing element select
 */
public class Select extends BaseElement {

    /**
     *
     * @param locator
     * @param name
     */
    public Select(final By locator, final String name) {
        super(locator, name);
    }

    public Select(String string, String name) {
    	 super(string, name);
	}

    public Select(By locator){
        super(locator);
    }

    @Override
    protected String getElementType() {
        return getLoc("loc.select");
    }

    public boolean isEnabled(){
    	return this.getElement().isEnabled();
    }
    
    public void Select_in(String value){
       WebDriver driver = browser.getDriver();
       RemoteWebElement selects = (RemoteWebElement) driver.findElement(locator);
       selects.click();
       List<WebElement> options = selects.findElements(By.tagName("option"));
       for (WebElement option : options){
            if(value.equals(option.getText())){
               option.click();
            }
       }
    }
    
}
