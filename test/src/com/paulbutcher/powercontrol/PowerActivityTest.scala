package com.paulbutcher.powercontrol

import android.content.{Context, ContextWrapper, Intent}
import android.test.ActivityUnitTestCase

import com.borachio.junit3.MockFactory

class PowerActivityTest
  extends ActivityUnitTestCase[PowerActivity](classOf[PowerActivity]) 
  with MockFactory {
    
  val startIntent = new Intent(Intent.ACTION_MAIN)
    
  override def setUp() {
    super.setUp
    resetExpectations
  }
  
  override def tearDown() {
    verifyExpectations
    super.tearDown
  }
  
  def testAttempt1 {
    startActivity(startIntent, null, null)
  }
}
