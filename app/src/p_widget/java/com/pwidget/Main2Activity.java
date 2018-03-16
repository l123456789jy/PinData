package com.pwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.github.mzule.activityrouter.annotation.Router;
import com.test.pindata.R;

/**
 * @author ljy
 */
@Router("main")
public class Main2Activity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
  }
}
