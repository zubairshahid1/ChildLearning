package com.codies.childlearning;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ml.vision.FirebaseVision;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;

import java.util.ArrayList;
import java.util.List;

public class Drawingg extends AppCompatActivity {

    MyView mv;
    AlertDialog dialog;

    ImageButton eraseBT;
    Button checkBT;
    ImageView alphaIMG;
    ImageView dottedIMG;


    List<Drawable> alphabetsList;
    List<Drawable> dottedList;
    List<Character> alphabetName;
    String currentChar;
    int iterator = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawing_view);

        alphabetsList = new ArrayList<>();
        dottedList = new ArrayList<>();
        alphabetName = new ArrayList<>();

        eraseBT = findViewById(R.id.eraseBT);
        checkBT = findViewById(R.id.checkBT);
        alphaIMG = findViewById(R.id.alphaImage);
        dottedIMG = findViewById(R.id.dottedimageView);
        mv = findViewById(R.id.myView);


        initMap();
        makeLogic(iterator);
        eraseBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

        checkBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detectText(mv.getDrawingCache());
            }
        });

    }

    private void detectText(Bitmap bitmap) {
        FirebaseVisionImage image = FirebaseVisionImage.fromBitmap(bitmap);
        FirebaseVisionTextRecognizer detector = FirebaseVision.getInstance().getOnDeviceTextRecognizer();

        Task<FirebaseVisionText> result = detector.processImage(image)
                .addOnSuccessListener(new OnSuccessListener<FirebaseVisionText>() {
                    @Override
                    public void onSuccess(FirebaseVisionText firebaseVisionText) {
                        if (firebaseVisionText.getText().toLowerCase().equals(currentChar)) {
                            iterator++;
                            makeLogic(iterator);
                            Toast.makeText(Drawingg.this, "Success!!", Toast.LENGTH_SHORT).show();
                            recreate();
                            return;
                        }
                        Toast.makeText(Drawingg.this, "Try Again", Toast.LENGTH_SHORT).show();

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.i("THHHE", "onFailure: " + e.getLocalizedMessage());
                    }
                });
    }

    public void initMap() {
        alphabetsList.add(getResources().getDrawable(R.drawable.aa));
        alphabetsList.add(getResources().getDrawable(R.drawable.bb));
        alphabetsList.add(getResources().getDrawable(R.drawable.cc));
        alphabetsList.add(getResources().getDrawable(R.drawable.dd));
        alphabetsList.add(getResources().getDrawable(R.drawable.ee));
        alphabetsList.add(getResources().getDrawable(R.drawable.ff));
        alphabetsList.add(getResources().getDrawable(R.drawable.gg));
        alphabetsList.add(getResources().getDrawable(R.drawable.hh));
        alphabetsList.add(getResources().getDrawable(R.drawable.ii));
        alphabetsList.add(getResources().getDrawable(R.drawable.jj));
        alphabetsList.add(getResources().getDrawable(R.drawable.kk));
        alphabetsList.add(getResources().getDrawable(R.drawable.ll));
        alphabetsList.add(getResources().getDrawable(R.drawable.mm));
        alphabetsList.add(getResources().getDrawable(R.drawable.nn));
        alphabetsList.add(getResources().getDrawable(R.drawable.oo));
        alphabetsList.add(getResources().getDrawable(R.drawable.pp));
        alphabetsList.add(getResources().getDrawable(R.drawable.qq));
        alphabetsList.add(getResources().getDrawable(R.drawable.rr));
        alphabetsList.add(getResources().getDrawable(R.drawable.ss));
        alphabetsList.add(getResources().getDrawable(R.drawable.tt));
        alphabetsList.add(getResources().getDrawable(R.drawable.uu));
        alphabetsList.add(getResources().getDrawable(R.drawable.vv));
        alphabetsList.add(getResources().getDrawable(R.drawable.ww));
        alphabetsList.add(getResources().getDrawable(R.drawable.xx));
        alphabetsList.add(getResources().getDrawable(R.drawable.yy));
        alphabetsList.add(getResources().getDrawable(R.drawable.zz));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_a));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_b));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_c));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_d));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_e));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_f));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_g));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_h));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_i));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_j));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_k));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_l));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_m));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_n));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_o));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_p));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_q));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_r));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_s));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_t));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_u));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_v));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_w));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_x));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_y));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_z));
        alphabetName.add('a');
        alphabetName.add('b');
        alphabetName.add('c');
        alphabetName.add('d');
        alphabetName.add('e');
        alphabetName.add('f');
        alphabetName.add('g');
        alphabetName.add('h');
        alphabetName.add('i');
        alphabetName.add('j');
        alphabetName.add('k');
        alphabetName.add('l');
        alphabetName.add('m');
        alphabetName.add('n');
        alphabetName.add('o');
        alphabetName.add('p');
        alphabetName.add('q');
        alphabetName.add('r');
        alphabetName.add('s');
        alphabetName.add('t');
        alphabetName.add('u');
        alphabetName.add('v');
        alphabetName.add('w');
        alphabetName.add('x');
        alphabetName.add('y');
        alphabetName.add('z');    }

    public void makeLogic(int iterator) {
        Log.i("th", "makeLogic: " + iterator);
        Drawable currentImg = alphabetsList.get(iterator);
        Drawable dottedImg = dottedList.get(iterator);
        alphaIMG.setImageDrawable(currentImg);
        dottedIMG.setImageDrawable(dottedImg);
        currentChar = alphabetName.get(iterator).toString();

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("MyInt", iterator);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        iterator = savedInstanceState.getInt("MyInt");
        makeLogic(iterator);
    }



}
