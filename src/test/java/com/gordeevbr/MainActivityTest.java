package com.gordeevbr;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", constants = BuildConfig.class)
public class MainActivityTest {

  private MainActivity activity;

  @Before
  public void setup() {
    activity = Robolectric.setupActivity(MainActivity.class);
  }

  @Test
  public void test() {
  }

}
