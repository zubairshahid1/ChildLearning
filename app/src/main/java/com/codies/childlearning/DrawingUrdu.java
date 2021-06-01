package com.codies.childlearning;


import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
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

public class DrawingUrdu extends AppCompatActivity {

    MyView mv;
    AlertDialog dialog;
    TextView tv_demo;

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
        setContentView(R.layout.drawing_view_urdu);

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
                            Toast.makeText(DrawingUrdu.this, "Success!!", Toast.LENGTH_SHORT).show();
                            recreate();
                            return;
                        }
                        Toast.makeText(DrawingUrdu.this, "Try Again ب" , Toast.LENGTH_SHORT).show();


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
        alphabetsList.add(getResources().getDrawable(R.drawable.aliff));
        alphabetsList.add(getResources().getDrawable(R.drawable.bay));
        alphabetsList.add(getResources().getDrawable(R.drawable.pay));
        alphabetsList.add(getResources().getDrawable(R.drawable.tay));
        alphabetsList.add(getResources().getDrawable(R.drawable.tey));
        alphabetsList.add(getResources().getDrawable(R.drawable.say));
        alphabetsList.add(getResources().getDrawable(R.drawable.jeem));
        alphabetsList.add(getResources().getDrawable(R.drawable.chay));
        alphabetsList.add(getResources().getDrawable(R.drawable.hay));
        alphabetsList.add(getResources().getDrawable(R.drawable.khay));
        alphabetsList.add(getResources().getDrawable(R.drawable.daal));
        alphabetsList.add(getResources().getDrawable(R.drawable.daaal));
        alphabetsList.add(getResources().getDrawable(R.drawable.za));
        alphabetsList.add(getResources().getDrawable(R.drawable.ra));
        alphabetsList.add(getResources().getDrawable(R.drawable.zaa));
        alphabetsList.add(getResources().getDrawable(R.drawable.seen));
        alphabetsList.add(getResources().getDrawable(R.drawable.sheen));
        alphabetsList.add(getResources().getDrawable(R.drawable.suat));
        alphabetsList.add(getResources().getDrawable(R.drawable.zuat));
        alphabetsList.add(getResources().getDrawable(R.drawable.toi));
        alphabetsList.add(getResources().getDrawable(R.drawable.zoi));
        alphabetsList.add(getResources().getDrawable(R.drawable.aen));
        alphabetsList.add(getResources().getDrawable(R.drawable.gaen));
        alphabetsList.add(getResources().getDrawable(R.drawable.faa));
        alphabetsList.add(getResources().getDrawable(R.drawable.kaaf));
        alphabetsList.add(getResources().getDrawable(R.drawable.keef));
        alphabetsList.add(getResources().getDrawable(R.drawable.gaaf));
        alphabetsList.add(getResources().getDrawable(R.drawable.laam));
        alphabetsList.add(getResources().getDrawable(R.drawable.meem));
        alphabetsList.add(getResources().getDrawable(R.drawable.noon));
        alphabetsList.add(getResources().getDrawable(R.drawable.wao));
        alphabetsList.add(getResources().getDrawable(R.drawable.haa));
        alphabetsList.add(getResources().getDrawable(R.drawable.yaa));



        dottedList.add(getResources().getDrawable(R.drawable.dotted_alif));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_bay));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_pay));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_tay));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_tey));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_say));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_jeem));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_chay));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_hay));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_khay));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_daal));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_daaal));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_za));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_ra));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_zaa));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_seen));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_sheen));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_suat));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_zuat));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_toi));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_zoi));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_aen));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_gaen));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_faa));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_kaaf));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_keef));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_gaaf));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_laam));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_meem));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_noon));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_wao));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_haa));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_yaa));




        alphabetName.add('1');
        alphabetName.add('ب');
        alphabetName.add('p');
        alphabetName.add('t');
        alphabetName.add('t');
        alphabetName.add('j');
        alphabetName.add('c');
        alphabetName.add('h');
        alphabetName.add('k');
        alphabetName.add('d');
        alphabetName.add('d');
        alphabetName.add('r');
        alphabetName.add('z');
        alphabetName.add('z');
        alphabetName.add('s');
        alphabetName.add('s');
        alphabetName.add('s');
        alphabetName.add('z');
        alphabetName.add('t');
        alphabetName.add('z');
        alphabetName.add('a');
        alphabetName.add('g');
        alphabetName.add('f');
        alphabetName.add('k');
        alphabetName.add('k');
        alphabetName.add('g');
        alphabetName.add('l');
        alphabetName.add('m');
        alphabetName.add('n');
        alphabetName.add('w');
        alphabetName.add('h');
        alphabetName.add('y'); }

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
