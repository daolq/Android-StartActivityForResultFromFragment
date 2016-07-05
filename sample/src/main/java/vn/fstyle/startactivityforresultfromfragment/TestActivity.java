package vn.fstyle.startactivityforresultfromfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {

    private EditText mEdtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mEdtName = (EditText) findViewById(R.id.edtName);
    }

    public void clickok(View button) {
        String name = mEdtName.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra(TestFragment.ARG_TEST, name);
        setResult(RESULT_OK, intent);
        finish();
    }
}
