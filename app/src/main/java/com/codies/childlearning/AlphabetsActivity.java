package com.codies.childlearning;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AlphabetsActivity extends AppCompatActivity implements AlphabetClickListener {

    public static final String TAG = "ALPHABETSACTIVITY";


    RecyclerView alphabetsRV;
    List<Drawable> alphabetsList;
    List<String> alphabetName;
    AlphabetAdapter alphabetAdapter;
    String isUrdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        alphabetsRV = findViewById(R.id.alphabetsR);
        alphabetsList = new ArrayList<>();
        alphabetName = new ArrayList<>();

        Intent intent = getIntent();
        isUrdu = intent.getStringExtra("check");
        if (isUrdu.equals("isUrdu")) {
            addUrdu();
        }
        if (isUrdu.equals("isEnglish")) {
            addEnglish();
        }
        if (isUrdu.equals("isNumber")) {
            addNumeric();
        }



        alphabetAdapter = new AlphabetAdapter(alphabetsList, alphabetName,this, this);
        alphabetsRV.setLayoutManager(new GridLayoutManager(this, 3));
        alphabetsRV.setAdapter(alphabetAdapter);
    }

    @Override
    public void onClick(String name) {
        Log.i(TAG, "onClick: " + name);
        Intent intent = new Intent(AlphabetsActivity.this, MainActivity.class);
        intent.putExtra("char", name);
        startActivity(intent);
    }

    public void addEnglish() {
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
        alphabetName.add("a");
        alphabetName.add("b");
        alphabetName.add("c");
        alphabetName.add("d");
        alphabetName.add("e");
        alphabetName.add("f");
        alphabetName.add("g");
        alphabetName.add("h");
        alphabetName.add("i");
        alphabetName.add("j");
        alphabetName.add("k");
        alphabetName.add("l");
        alphabetName.add("m");
        alphabetName.add("n");
        alphabetName.add("o");
        alphabetName.add("p");
        alphabetName.add("q");
        alphabetName.add("r");
        alphabetName.add("s");
        alphabetName.add("t");
        alphabetName.add("u");
        alphabetName.add("v");
        alphabetName.add("w");
        alphabetName.add("x");
        alphabetName.add("y");
        alphabetName.add("z");
    }

    public void addNumeric(){
        alphabetsList.add(getResources().getDrawable(R.drawable.one));
        alphabetsList.add(getResources().getDrawable(R.drawable.two));
        alphabetsList.add(getResources().getDrawable(R.drawable.three));
        alphabetsList.add(getResources().getDrawable(R.drawable.four));
        alphabetsList.add(getResources().getDrawable(R.drawable.five));
        alphabetsList.add(getResources().getDrawable(R.drawable.six));
        alphabetsList.add(getResources().getDrawable(R.drawable.seven));
        alphabetsList.add(getResources().getDrawable(R.drawable.eight));
        alphabetsList.add(getResources().getDrawable(R.drawable.nine));
        alphabetsList.add(getResources().getDrawable(R.drawable.ten));
        alphabetsList.add(getResources().getDrawable(R.drawable.elev));
        alphabetsList.add(getResources().getDrawable(R.drawable.telv));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirtn));
        alphabetsList.add(getResources().getDrawable(R.drawable.fortn));
        alphabetsList.add(getResources().getDrawable(R.drawable.fiftn));
        alphabetsList.add(getResources().getDrawable(R.drawable.sixtn));
        alphabetsList.add(getResources().getDrawable(R.drawable.sevntn));
        alphabetsList.add(getResources().getDrawable(R.drawable.eightn));
        alphabetsList.add(getResources().getDrawable(R.drawable.nintn));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_one));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_two));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_three));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_four));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_five));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_six));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_seven));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_eight));
        alphabetsList.add(getResources().getDrawable(R.drawable.twinti_nine));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_one));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_two));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_three));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_four));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_five));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_six));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_seven));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_eight));
        alphabetsList.add(getResources().getDrawable(R.drawable.thirty_nine));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_one));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_two));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_three));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_four));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_five));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_six));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_seven));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_eight));
        alphabetsList.add(getResources().getDrawable(R.drawable.forty_nine));
        alphabetsList.add(getResources().getDrawable(R.drawable.fifty));


        alphabetName.add("one");
        alphabetName.add("two");
        alphabetName.add("three");
        alphabetName.add("four");
        alphabetName.add("five");
        alphabetName.add("six");
        alphabetName.add("seven");
        alphabetName.add("eight");
        alphabetName.add("nine");
        alphabetName.add("ten");
        alphabetName.add("elev");
        alphabetName.add("telv");
        alphabetName.add("thirtn");
        alphabetName.add("fortn");
        alphabetName.add("fiftn");
        alphabetName.add("sixtn");
        alphabetName.add("sevntn");
        alphabetName.add("eightn");
        alphabetName.add("nintn");
        alphabetName.add("twinti");
        alphabetName.add("twinti_one");
        alphabetName.add("twinti_two");
        alphabetName.add("twinti_three");
        alphabetName.add("twinti_four");
        alphabetName.add("twinti_five");
        alphabetName.add("twinti_six");
        alphabetName.add("twinti_seven");
        alphabetName.add("twinti_eight");
        alphabetName.add("twinti_nine");
        alphabetName.add("thirty");
        alphabetName.add("thirty_one");
        alphabetName.add("thirty_two");
        alphabetName.add("thirty_three");
        alphabetName.add("thirty_four");
        alphabetName.add("thirty_five");
        alphabetName.add("thirty_six");
        alphabetName.add("thirty_seven");
        alphabetName.add("thirty_eight");
        alphabetName.add("thirty_nine");
        alphabetName.add("forty");
        alphabetName.add("forty_one");
        alphabetName.add("forty_two");
        alphabetName.add("forty_three");
        alphabetName.add("forty_four");
        alphabetName.add("forty_five");
        alphabetName.add("forty_six");
        alphabetName.add("forty_seven");
        alphabetName.add("forty_eight");
        alphabetName.add("forty_nine");
        alphabetName.add("fifty");

    }

    public void addUrdu() {
        alphabetsList.add(getResources().getDrawable(R.drawable.pay));
        alphabetsList.add(getResources().getDrawable(R.drawable.bay));
        alphabetsList.add(getResources().getDrawable(R.drawable.alif));

        alphabetsList.add(getResources().getDrawable(R.drawable.say));
        alphabetsList.add(getResources().getDrawable(R.drawable.tey));
        alphabetsList.add(getResources().getDrawable(R.drawable.tay));

        alphabetsList.add(getResources().getDrawable(R.drawable.hay));
        alphabetsList.add(getResources().getDrawable(R.drawable.chay));
        alphabetsList.add(getResources().getDrawable(R.drawable.jeem));

        alphabetsList.add(getResources().getDrawable(R.drawable.daaal));
        alphabetsList.add(getResources().getDrawable(R.drawable.daal));
        alphabetsList.add(getResources().getDrawable(R.drawable.khay));

        alphabetsList.add(getResources().getDrawable(R.drawable.zaa));
        alphabetsList.add(getResources().getDrawable(R.drawable.za));
        alphabetsList.add(getResources().getDrawable(R.drawable.ra));

        alphabetsList.add(getResources().getDrawable(R.drawable.suat));
        alphabetsList.add(getResources().getDrawable(R.drawable.sheen));
        alphabetsList.add(getResources().getDrawable(R.drawable.seen));

        alphabetsList.add(getResources().getDrawable(R.drawable.zoi));
        alphabetsList.add(getResources().getDrawable(R.drawable.toi));
        alphabetsList.add(getResources().getDrawable(R.drawable.zuat));

        alphabetsList.add(getResources().getDrawable(R.drawable.faa));
        alphabetsList.add(getResources().getDrawable(R.drawable.gaen));
        alphabetsList.add(getResources().getDrawable(R.drawable.aen));

        alphabetsList.add(getResources().getDrawable(R.drawable.gaaf));
        alphabetsList.add(getResources().getDrawable(R.drawable.keef));
        alphabetsList.add(getResources().getDrawable(R.drawable.kaaf));

        alphabetsList.add(getResources().getDrawable(R.drawable.noon));
        alphabetsList.add(getResources().getDrawable(R.drawable.meem));
        alphabetsList.add(getResources().getDrawable(R.drawable.laam));

        alphabetsList.add(getResources().getDrawable(R.drawable.yaa));
        alphabetsList.add(getResources().getDrawable(R.drawable.haa));
        alphabetsList.add(getResources().getDrawable(R.drawable.wao));

        alphabetName.add("pay");
        alphabetName.add("bay");
        alphabetName.add("alif");

        alphabetName.add("say");
        alphabetName.add("tey");
        alphabetName.add("tay");

        alphabetName.add("hay");
        alphabetName.add("chay");
        alphabetName.add("jeem");

        alphabetName.add("daaal");
        alphabetName.add("daal");
        alphabetName.add("khay");

        alphabetName.add("zaa");
        alphabetName.add("za");
        alphabetName.add("ra");

        alphabetName.add("suat");
        alphabetName.add("sheen");
        alphabetName.add("seen");

        alphabetName.add("zoi");
        alphabetName.add("toi");
        alphabetName.add("zuat");

        alphabetName.add("faa");
        alphabetName.add("gaen");
        alphabetName.add("aen");

        alphabetName.add("gaaf");
        alphabetName.add("keef");
        alphabetName.add("kaaf");

        alphabetName.add("noon");
        alphabetName.add("meem");
        alphabetName.add("laam");

        alphabetName.add("yaa");
        alphabetName.add("haa");
        alphabetName.add("wao");

    }
}
