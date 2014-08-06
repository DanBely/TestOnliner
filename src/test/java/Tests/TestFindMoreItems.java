/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.FindMoreItemsForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestFindMoreItems extends BaseTest{
    
    @Override
    public void runTest() {
        logger.step(1);
        FindMoreItemsForm fmif = new FindMoreItemsForm();
        fmif.assertCatalog();
        logger.step(2);
        fmif.gotoCatalog();
        logger.step(3);
        fmif.chooseSection();
        logger.step(4);
        fmif.fillSearch();
        logger.step(5);
        fmif.tablView();
        logger.step(6);
        fmif.inspectElements();
    }
}
