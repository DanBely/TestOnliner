/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.ThemeForumForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestThemeForum extends BaseTest{
    
    @Override
    public void runTest() {
        logger.step(1);
        ThemeForumForm tff = new ThemeForumForm();
        tff.gotoForum();
        logger.step(2);
        tff.gotoOfftopick();
        logger.step(3);
        tff.createTheme();
        logger.step(4);
        tff.writeTheme();
        logger.step(5);
        tff.inspectTheme();
    }
}    
