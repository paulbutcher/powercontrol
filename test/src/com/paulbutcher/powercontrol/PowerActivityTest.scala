package com.paulbutcher.powercontrol

import android.app.Application
import android.content.{Context, ContextWrapper, Intent}
import android.test.ActivityUnitTestCase

import com.borachio.junit3.MockFactory

class PowerActivityTest
  extends ActivityUnitTestCase[PowerActivity](classOf[PowerActivity]) 
  with MockFactory {
    
  val startIntent = new Intent(Intent.ACTION_MAIN)
    
  def testStartImportant {
    val mockPowerControl = mock[PowerControl]
    val application = new PowerControlApplication {
      powerControl = mockPowerControl
    }
    setApplication(application)
    startActivity(startIntent, null, null)
    
    withExpectations {
      mockPowerControl expects 'disablePowerOff once
    
      getActivity.startImportant(null)
    }
  }
}
