/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.ForumCommentForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestForumComment extends BaseTest {
    
    @Override
    public void runTest() {
        logger.step(1);
        ForumCommentForm fcf = new ForumCommentForm();
        fcf.assertForum();
        logger.step(2);
        fcf.gotoForum();
        logger.step(3);
	fcf.gotoPopularTheme();
	logger.step(4);
        fcf.writeComment();
        logger.step(5);
        fcf.assertTextBox();
    }
}
