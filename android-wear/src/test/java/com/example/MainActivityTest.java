package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

  @Test
  public void onCreate_shouldContainTextView() {
    final MainActivity activity = Robolectric.setupActivity(MainActivity.class);
    assertThat(activity.findViewById(R.id.text)).isNotNull();
  }
}
