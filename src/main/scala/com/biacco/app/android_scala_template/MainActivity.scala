package com.biacco.app.android_scala_template

import android.app.Activity
import android.os.Bundle

class MainActivity extends Activity with TypedFindView {
  /** Called when the activity is first created. */
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}
