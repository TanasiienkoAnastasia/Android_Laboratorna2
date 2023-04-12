package com.example.android_laboratorna2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements FragmentPicker.OnFragmentSendDataListener  {
    private FragmentPicker fragmentPicker;
    private FragmentOutput fragmentOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentPicker = (FragmentPicker) getSupportFragmentManager()
                .findFragmentById(R.id.frameLayoutPicker);

        fragmentOutput = (FragmentOutput) getSupportFragmentManager()
                .findFragmentById(R.id.frameLayoutOutput);
    }

    private void CreateAlertDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setMessage(message);
        builder.setTitle("Warning!");
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", (DialogInterface.OnClickListener) (dialog, which) -> {
            dialog.cancel();
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public void onSendData(String typeOfColor, String rangeOfPrice) {
        if (Objects.equals(typeOfColor, ""))
        {
            CreateAlertDialog("Select type of color");
            return;
        }

        if (Objects.equals(rangeOfPrice, ""))
        {
            CreateAlertDialog("Select range of price");
            return;
        }

        if(!Objects.equals(typeOfColor, "") && !Objects.equals(rangeOfPrice, ""))
        {
            String text = typeOfColor + " " + rangeOfPrice;
            fragmentOutput.setDataTextView(text);
        }
    }
}