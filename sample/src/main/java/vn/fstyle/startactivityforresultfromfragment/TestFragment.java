package vn.fstyle.startactivityforresultfromfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import vn.fstyle.library.BaseFragmentForResult;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must
 * Use the {@link TestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TestFragment extends BaseFragmentForResult {

    public static final String ARG_TEST = "test";
    private static final int REQUEST_CODE_TEST = 100;

    private TextView mTvName;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment TestFragment.
     */
    public static TestFragment newInstance() {
        return new TestFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        mTvName = (TextView) view.findViewById(R.id.tvName);
        mTvName.setText(getString(R.string.your_name, ""));
        view.findViewById(R.id.btnClickSetNew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(getActivity(), TestActivity.class), REQUEST_CODE_TEST);
            }
        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != Activity.RESULT_OK) {
            return;
        }
        if (requestCode == REQUEST_CODE_TEST) {
            mTvName.setText(getString(R.string.your_name, data.getStringExtra(ARG_TEST)));
        }
    }
}
