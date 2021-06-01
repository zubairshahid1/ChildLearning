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

public class DrawingDigit extends AppCompatActivity {

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
        setContentView(R.layout.drawing_view_digit);

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
                            Toast.makeText(DrawingDigit.this, "Success!!", Toast.LENGTH_SHORT).show();
                            recreate();
                            return;
                        }
                        Toast.makeText(DrawingDigit.this, "Try Again", Toast.LENGTH_SHORT).show();

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
        alphabetsList.add(getResources().getDrawable(R.drawable.one));
        alphabetsList.add(getResources().getDrawable(R.drawable.two));
        alphabetsList.add(getResources().getDrawable(R.drawable.three));
        alphabetsList.add(getResources().getDrawable(R.drawable.four));
        alphabetsList.add(getResources().getDrawable(R.drawable.five));
        alphabetsList.add(getResources().getDrawable(R.drawable.six));
        alphabetsList.add(getResources().getDrawable(R.drawable.seven));
        alphabetsList.add(getResources().getDrawable(R.drawable.eight));
        alphabetsList.add(getResources().getDrawable(R.drawable.nine));


        dottedList.add(getResources().getDrawable(R.drawable.dotted_one));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_two));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_three));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_four));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_five));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_six));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_seven));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_eight));
        dottedList.add(getResources().getDrawable(R.drawable.dotted_nine));

        alphabetName.add('1');
        alphabetName.add('2');
        alphabetName.add('3');
        alphabetName.add('4');
        alphabetName.add('5');
        alphabetName.add('6');
        alphabetName.add('7');
        alphabetName.add('8');
        alphabetName.add('9');
    }

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
