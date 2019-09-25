 package mehisen.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import mehisen.instagram.Utils.BottomNavigationViewHelper;

 public class HomeActivity extends AppCompatActivity {

    private static final  String TAG  = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG,"onCreate: starting");

        _setupBottomNavigationView();
    }

     /**
      * BottomNavigationView setup
      */
     private void _setupBottomNavigationView()
     {
         Log.d(TAG,"setupBottomNavigationView: setting up BottomNavigationView");
         BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavigationBar);
         BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);


     }
 }
