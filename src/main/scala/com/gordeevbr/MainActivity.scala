package com.gordeevbr

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity extends AppCompatActivity {

  var vh: TypedViewHolder.main = _

  override def onCreate(savedInstanceState: Bundle) = {
    super.onCreate(savedInstanceState)

    vh = TypedViewHolder
      .setContentView(this, TR.layout.main)
      .asInstanceOf[TypedViewHolder.main]
  }
}
