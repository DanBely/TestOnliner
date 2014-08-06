/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;


import webdriver.BaseTest;

/**
 *
 * @author Dan Bely
 */
public class MainTest extends BaseTest {
    
    @Override
    public void runTest() {
        
        TestLogin tl = new TestLogin();
        tl.runTest();
//        
//        TestSearchAndCompare tsac = new TestSearchAndCompare();
//        tsac.runTest();
//        
//        TestCreateAdvert tca = new TestCreateAdvert();
//        tca.runTest();
          
        TestFindMoreItems tftmi = new TestFindMoreItems();
        tftmi.runTest();
          
//        TestForumComment tfc = new TestForumComment();
//        tfc.runTest();
//          
//        TestItem ti = new TestItem();
//        ti.runTest();
//        
//        TestThemeForum ttf = new TestThemeForum();
//        ttf.runTest();
//        
//        TestSendMessage tsm = new TestSendMessage();
//        tsm.runTest();
//        
//        TestProfile tp = new TestProfile();
//        tp.runTest();
//        
//        TestNewsComment tnc = new TestNewsComment();
//        tnc.runTest();

    }
    
}
