/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.ItemForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestItem extends BaseTest {
    
    @Override
    public void runTest() {
        logger.step(1);
        ItemForm itf = new ItemForm();
        itf.gotoCatalog();
        logger.step(2);
        itf.gotoSection();
        logger.step(3);
        itf.chooseItem();
        logger.step(4);
        itf.assertItem();
    }
}
