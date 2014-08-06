package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Class, Describing element link
 */
public class Link extends BaseElement {

    /**
     *
     * @param locator
     * @param name
     */
    public Link(final By locator, final String name) {
        super(locator, name);
    }

    public Link(String string, String name) {
    	 super(string, name);
	}


	protected String getElementType() {
        return getLoc("loc.link");
    }

    public boolean isEnabled(){
    	return this.getElement().isEnabled();
    }


	


	public Link(By locator) {
		super(locator);
	}


}