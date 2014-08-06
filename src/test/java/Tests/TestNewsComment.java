/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.NewsCommentForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestNewsComment extends BaseTest{
    
    @Override
    public void runTest() {
        logger.step(1);
        NewsCommentForm ncf = new NewsCommentForm();
        ncf.gotoTechnology();
        logger.step(2);
        ncf.gotoPopularNews();
        logger.step(3);
        ncf.writeComment();
        logger.step(4);
        ncf.inspectMessage();
    }
}
