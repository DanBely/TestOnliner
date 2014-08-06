/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.LoginForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestLogin extends BaseTest{
    
    @Override
    public void runTest() {
        logger.step(1);
        browser.navigate("https://profile.onliner.by/login?redirect=http%3A%2F%2Fwww.onliner.by%2F");
	logger.step(2);
	LoginForm lf = new LoginForm();
        lf.assertLogo();
        logger.step(3);
	lf.logOn();
	logger.step(4);
        browser.waitForPageToLoad();
	logger.step(5);
	lf.assertUser();
    }
}
