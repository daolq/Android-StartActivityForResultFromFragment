package vn.fstyle.library;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

/**
 * BaseActivity.
 *
 * @author DaoLQ
 */
public class BaseActivityForResult extends Activity {

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                BusProvider.getInstance().post(new ActivityResultEvent(requestCode, resultCode, data));
            }
        });
    }
}
