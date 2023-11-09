package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bottomdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomdialog = findViewById(R.id.dialogbox);
        bottomdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomdialog);

        LinearLayout editLayout =dialog.findViewById(R.id.layoutEdit);
        LinearLayout shareLayout =dialog.findViewById(R.id.layoutShare);
        LinearLayout printLayout =dialog.findViewById(R.id.layoutPrint);
        LinearLayout uploadLayout =dialog.findViewById(R.id.layoutUpload);

        editLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Edit is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        shareLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Share is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        printLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Print is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        uploadLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Upload is clicked",Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().getAttributes().windowAnimations = R.style.Theme_DialogBox;
        dialog.getWindow().setGravity(Gravity.BOTTOM);

    }
}