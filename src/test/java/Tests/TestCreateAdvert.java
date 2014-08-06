/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.CreateNewAdvertForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestCreateAdvert extends BaseTest {
    
    @Override
    public void runTest() {
        logger.step(1);
        CreateNewAdvertForm cnaf = new CreateNewAdvertForm();
        cnaf.assertBaraholka();
        logger.step(2);
        cnaf.gotoBaraholka();
        logger.step(4);
        cnaf.createTheme();
        logger.step(5);
        browser.waitForPageToLoad();
        logger.step(6);
        cnaf.fillAdvert();
        logger.step(7);
        cnaf.assertAdvert();
    }
}
