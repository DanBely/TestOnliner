/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.ProfileForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestProfile extends BaseTest{
    
    @Override
    public void runTest() {
        logger.step(1);
        ProfileForm pf = new ProfileForm ();
        pf.gotoProfile();
        logger.step(2);
        pf.assertUser();
        logger.step(3);
        pf.chooseSection();
        logger.step(4);
        pf.assertFieldInfo();
        logger.step(5);
        pf.fillProfile();
        logger.step(6);
        pf.gotoSettings();
        logger.step(7);
        pf.checkSettings();
    }
}
