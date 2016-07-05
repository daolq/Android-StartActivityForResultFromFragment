package vn.fstyle.startactivityforresultfromfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import vn.fstyle.library.BaseActivityForResult;

public class MainActivity extends BaseActivityForResult {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.rootView, TestFragment.newInstance());
        fragmentTransaction.commit();
    }
}
