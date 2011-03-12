package com.paulbutcher.powercontrol

import android.app.Application
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
  
  def testStartImportant {
    val mockPowerControl = mock[PowerControl]
    val application = new PowerControlApplication {
      powerControl = mockPowerControl
    }
    setApplication(application)
    startActivity(startIntent, null, null)
    
    mockPowerControl expects 'disablePowerOff once
    
    getActivity.startImportant(null)
  }
}
