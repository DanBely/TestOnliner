/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import TestForms.SendMessageForm;
import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class TestSendMessage extends BaseTest{
    
    @Override
    public void runTest() {
        logger.step(1);
        SendMessageForm smf = new SendMessageForm();
        smf.gotoProfile();
        logger.step(2);
        smf.MyMsg();
        logger.step(3);
        smf.WriteMsg();
        logger.step(4);
        smf.writeWhom();
        logger.step(5);
        smf.gotoSent();
        logger.step(6);
        smf.assertMessage();
    }
}
