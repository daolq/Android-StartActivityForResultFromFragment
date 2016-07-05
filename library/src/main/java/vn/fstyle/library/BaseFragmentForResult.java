package vn.fstyle.library;

import android.content.Intent;
import android.support.annotation.CallSuper;
import android.support.v4.app.Fragment;

import com.squareup.otto.Subscribe;

/**
 * Copyright © 2016 AsianTech inc.
 * Created by DaoLQ on 1/6/16.
 */
public class BaseFragmentForResult extends Fragment {

    @CallSuper
    @Override
    public void onResume() {
        super.onResume();
        BusProvider.getInstance().register(mActivityResultSubscriber);
    }

    @CallSuper
    @Override
    public void onPause() {
        super.onPause();
        BusProvider.getInstance().unregister(mActivityResultSubscriber);
    }

    private Object mActivityResultSubscriber = new Object() {
        @Subscribe
        public void onActivityResultReceived(ActivityResultEvent event) {
            int requestCode = event.getRequestCode();
            int resultCode = event.getResultCode();
            Intent data = event.getData();
            onActivityResult(requestCode, resultCode, data);
        }
    };
}
