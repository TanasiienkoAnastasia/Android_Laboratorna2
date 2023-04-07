package com.example.android_laboratorna2;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;


public class FragmentPicker extends Fragment {
    public FragmentPicker() {
        super(R.layout.fragment_picker);
    }


    private RadioGroup radioGroupColour;
    private RadioGroup radioGroupPriceRange;
    private Button buttonOk;

}
