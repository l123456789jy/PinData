package com.test.pindata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.github.mzule.activityrouter.router.Routers;

/**
 * @author ljy
 */
public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Routers.open(this, "mzule://main");

  }
}
