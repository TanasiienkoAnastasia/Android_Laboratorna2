package com.example.android_laboratorna2;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;


public class FragmentPicker extends Fragment {
    interface OnFragmentSendDataListener {
        void onSendData(String dataType, String dateFirm);
    }

    private RadioGroup radioGroupColour;
    private RadioGroup radioGroupPriceRange;
    private Button buttonOk;



}
