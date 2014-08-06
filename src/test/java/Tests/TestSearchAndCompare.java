/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.SearchItemAndCompareForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestSearchAndCompare extends BaseTest{
    
    @Override
    public void runTest() {
        logger.step(1);
        SearchItemAndCompareForm siacf = new SearchItemAndCompareForm();
        siacf.writeRequest();
        logger.step(2);
        siacf.compare();
        logger.step(3);
        siacf.assertCompare();
    }
}
