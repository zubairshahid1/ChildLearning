package com.codies.childlearning;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    List<Item> itemList;
    TextToSpeech textToSpeech;
    List<String> itemNameA;
    List<String> itemNameB;
    List<String> itemNameC;
    List<String> itemNameD;
    List<String> itemNameE;
    List<String> itemNameF;
    List<String> itemNameG;
    List<String> itemNameH;
    List<String> itemNameI;
    List<String> itemNameJ;
    List<String> itemNameK;
    List<String> itemNameL;
    List<String> itemNameM;
    List<String> itemNameN;
    List<String> itemNameO;
    List<String> itemNameP;
    List<String> itemNameQ;
    List<String> itemNameR;
    List<String> itemNameS;
    List<String> itemNameT;
    List<String> itemNameU;
    List<String> itemNameV;
    List<String> itemNameW;
    List<String> itemNameX;
    List<String> itemNameY;
    List<String> itemNameZ;

    List<String> alif;
    List<String> bay;
    List<String> pay;
    List<String> tay;
    List<String> tey;
    List<String> say;
    List<String> jeem;
    List<String> chay;
    List<String> hay;
    List<String> khay;
    List<String> daal;
    List<String> daaal;
    List<String> ra;
    List<String> za;
    List<String> zaa;
    List<String> seen;
    List<String> sheen;
    List<String> suat;
    List<String> zuat;
    List<String> toi;
    List<String> zoi;
    List<String> ain;
    List<String> gain;
    List<String> fa;
    List<String> keef;
    List<String> kaaf;
    List<String> gaaf;
    List<String> laam;
    List<String> meem;
    List<String> noon;
    List<String> vao;
    List<String> ha;
    List<String> yay;

    List<String> one;
    List<String> two;
    List<String> three;
    List<String> four;
    List<String> five;
    List<String> six;
    List<String> seven;
    List<String> eight;
    List<String> nine;
    List<String> ten;
    List<String> elev;
    List<String> telv;
    List<String> thirtn;
    List<String> fortn;
    List<String> fiftn;
    List<String> sixtn;
    List<String> sevntn;
    List<String> eightn;
    List<String> nintn;
    List<String> twinti;
    List<String> twinti_one;
    List<String> twinti_two;
    List<String> twinti_three;
    List<String> twinti_four;
    List<String> twinti_five;
    List<String> twinti_six;
    List<String> twinti_seven;
    List<String> twinti_eight;
    List<String> twinti_nine;
    List<String> thirty;
    List<String> thirty_one;
    List<String> thirty_two;
    List<String> thirty_three;
    List<String> thirty_four;
    List<String> thirty_five;
    List<String> thirty_six;
    List<String> thirty_seven;
    List<String> thirty_eight;
    List<String> thirty_nine;
    List<String> forty;
    List<String> forty_one;
    List<String> forty_two;
    List<String> forty_three;
    List<String> forty_four;
    List<String> forty_five;
    List<String> forty_six;
    List<String> forty_seven;
    List<String> forty_eight;
    List<String> forty_nine;
    List<String> fifty;



    List<Drawable> alifImg;
    List<Drawable> bayImg;
    List<Drawable> payImg;
    List<Drawable> tayImg;
    List<Drawable> teyImg;
    List<Drawable> sayImg;
    List<Drawable> jeemImg;
    List<Drawable> chayImg;
    List<Drawable> hayImg;
    List<Drawable> khayImg;
    List<Drawable> daalImg;
    List<Drawable> daaalImg;
    List<Drawable> raImg;
    List<Drawable> zaImg;
    List<Drawable> zaaImg;
    List<Drawable> seenImg;
    List<Drawable> sheenImg;
    List<Drawable> suatImg;
    List<Drawable> zuatImg;
    List<Drawable> toiImg;
    List<Drawable> zoiImg;
    List<Drawable> ainImg;
    List<Drawable> gainImg;
    List<Drawable> faImg;
    List<Drawable> keefImg;
    List<Drawable> kaafImg;
    List<Drawable> gaafImg;
    List<Drawable> laamImg;
    List<Drawable> meemImg;
    List<Drawable> noonImg;
    List<Drawable> vaoImg;
    List<Drawable> haImg;
    List<Drawable> yayImg;

    List<Drawable> oneImg;
    List<Drawable> twoImg;
    List<Drawable> threeImg;
    List<Drawable> fourImg;
    List<Drawable> fiveImg;
    List<Drawable> sixImg;
    List<Drawable> sevenImg;
    List<Drawable> eightImg;
    List<Drawable> nineImg;
    List<Drawable> tenImg;
    List<Drawable> elevImg;
    List<Drawable> telvImg;
    List<Drawable> thirtnImg;
    List<Drawable> fortnImg;
    List<Drawable> fiftnImg;
    List<Drawable> sixtnImg;
    List<Drawable> sevntnImg;
    List<Drawable> eightnImg;
    List<Drawable> nintnImg;
    List<Drawable> twintiImg;
    List<Drawable> twinti_oneImg;
    List<Drawable> twinti_twoImg;
    List<Drawable> twinti_threeImg;
    List<Drawable> twinti_fourImg;
    List<Drawable> twinti_fiveImg;
    List<Drawable> twinti_sixImg;
    List<Drawable> twinti_sevenImg;
    List<Drawable> twinti_eightImg;
    List<Drawable> twinti_nineImg;
    List<Drawable> thirtyImg;
    List<Drawable> thirty_oneImg;
    List<Drawable> thirty_twoImg;
    List<Drawable> thirty_threeImg;
    List<Drawable> thirty_fourImg;
    List<Drawable> thirty_fiveImg;
    List<Drawable> thirty_sixImg;
    List<Drawable> thirty_sevenImg;
    List<Drawable> thirty_eightImg;
    List<Drawable> thirty_nineImg;
    List<Drawable> fortyImg;
    List<Drawable> forty_oneImg;
    List<Drawable> forty_twoImg;
    List<Drawable> forty_threeImg;
    List<Drawable> forty_fourImg;
    List<Drawable> forty_fiveImg;
    List<Drawable> forty_sixImg;
    List<Drawable> forty_sevenImg;
    List<Drawable> forty_eightImg;
    List<Drawable> forty_nineImg;
    List<Drawable> fiftyImg;

    List<Drawable> imageListA;
    List<Drawable> imageListB;
    List<Drawable> imageListC;
    List<Drawable> imageListD;
    List<Drawable> imageListE;
    List<Drawable> imageListF;
    List<Drawable> imageListG;
    List<Drawable> imageListH;
    List<Drawable> imageListI;
    List<Drawable> imageListJ;
    List<Drawable> imageListK;
    List<Drawable> imageListL;
    List<Drawable> imageListM;
    List<Drawable> imageListN;
    List<Drawable> imageListO;
    List<Drawable> imageListP;
    List<Drawable> imageListQ;
    List<Drawable> imageListR;
    List<Drawable> imageListS;
    List<Drawable> imageListT;
    List<Drawable> imageListU;
    List<Drawable> imageListV;
    List<Drawable> imageListW;
    List<Drawable> imageListX;
    List<Drawable> imageListY;
    List<Drawable> imageListZ;

    RecyclerView recyclerView;
    ItemAdapter itemsAdapter;

    Intent intent;

    String alpha;
    String urdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemList = new ArrayList<>();
        intent = getIntent();
        initViews();
        getUrdu();
        getNumeric();
        getEnglish();


        alpha = intent.getStringExtra("char");

        switch (alpha) {
            case "a":
                itemsAdapter.setItems(imageListA, itemNameA);
                break;
            case "b":
                itemsAdapter.setItems(imageListB, itemNameB);
                break;
            case "c":
                itemsAdapter.setItems(imageListC, itemNameC);
                break;
            case "d":
                itemsAdapter.setItems(imageListD, itemNameD);
                break;
            case "e":
                itemsAdapter.setItems(imageListE, itemNameD);
                break;
            case "f":
                itemsAdapter.setItems(imageListF, itemNameF);
                break;
            case "g":
                itemsAdapter.setItems(imageListG, itemNameG);
                break;
            case "h":
                itemsAdapter.setItems(imageListH, itemNameH);
                break;
            case "i":
                itemsAdapter.setItems(imageListI, itemNameI);
                break;
            case "j":
                itemsAdapter.setItems(imageListJ, itemNameJ);
                break;
            case "k":
                itemsAdapter.setItems(imageListK, itemNameK);
                break;
            case "l":
                itemsAdapter.setItems(imageListL, itemNameL);
                break;
            case "m":
                itemsAdapter.setItems(imageListM, itemNameM);
                break;
            case "n":
                itemsAdapter.setItems(imageListN, itemNameN);
                break;
            case "o":
                itemsAdapter.setItems(imageListO, itemNameO);
                break;
            case "p":
                itemsAdapter.setItems(imageListP, itemNameP);
                break;
            case "q":
                itemsAdapter.setItems(imageListQ, itemNameQ);
                break;
            case "r":
                itemsAdapter.setItems(imageListR, itemNameR);
                break;
            case "s":
                itemsAdapter.setItems(imageListS, itemNameS);
                break;
            case "t":
                itemsAdapter.setItems(imageListT, itemNameT);
                break;
            case "u":
                itemsAdapter.setItems(imageListU, itemNameU);
                break;
            case "v":
                itemsAdapter.setItems(imageListV, itemNameV);
                break;
            case "w":
                itemsAdapter.setItems(imageListW, itemNameW);
                break;
            case "x":
                itemsAdapter.setItems(imageListX, itemNameX);
                break;
            case "y":
                itemsAdapter.setItems(imageListY, itemNameY);
                break;
            case "z":
                itemsAdapter.setItems(imageListZ, itemNameZ);
                break;
            case "alif":
                itemsAdapter.setItems(alifImg, alif);
                break;
            case "bay":
                itemsAdapter.setItems(bayImg,bay);
                break;
            case "pay":
                itemsAdapter.setItems(payImg,pay);
                break;
            case "tay":
                itemsAdapter.setItems(tayImg,tay);
                break;
            case "tey":
                itemsAdapter.setItems(teyImg,tey);
                break;
            case "say":
                itemsAdapter.setItems(sayImg,say);
                break;
            case "jeem":
                itemsAdapter.setItems(jeemImg,jeem);
                break;
            case "chay":
                itemsAdapter.setItems(chayImg,chay);
                break;
            case "hay":
                itemsAdapter.setItems(hayImg,hay);
                break;
            case "khay":
                itemsAdapter.setItems(khayImg,khay);
                break;
            case "daal":
                itemsAdapter.setItems(daalImg,daal);
                break;
            case "daaal":
                itemsAdapter.setItems(daaalImg,daaal);
                break;
            case "ra":
                itemsAdapter.setItems(raImg,ra);
                break;
            case "za":
                itemsAdapter.setItems(zaImg,za);
                break;
            case "zaa":
                itemsAdapter.setItems(zaaImg,zaa);
                break;
            case "seen":
                itemsAdapter.setItems(seenImg,seen);
                break;
            case "sheen":
                itemsAdapter.setItems(sheenImg,sheen);
                break;
            case "suat":
                itemsAdapter.setItems(suatImg,suat);
                break;
            case "zuat":
                itemsAdapter.setItems(zuatImg,zuat);
                break;
            case "toi":
                itemsAdapter.setItems(toiImg,toi);
                break;
            case "zoi":
                itemsAdapter.setItems(zoiImg,zoi);
                break;
            case "aen":
                itemsAdapter.setItems(ainImg,ain);
                break;
            case "gaen":
                itemsAdapter.setItems(gainImg,gain);
                break;
            case "faa":
                itemsAdapter.setItems(faImg,fa);
                break;
            case "kaaf":
                itemsAdapter.setItems(kaafImg,kaaf);
                break;
            case "keef":
                itemsAdapter.setItems(keefImg,keef);
                break;
            case "gaaf":
                itemsAdapter.setItems(gaafImg,gaaf);
                break;
            case "laam":
                itemsAdapter.setItems(laamImg,laam);
                break;
            case "meem":
                itemsAdapter.setItems(meemImg,meem);
                break;
            case "noon":
                itemsAdapter.setItems(noonImg,noon);
                break;
            case "yaa":
                itemsAdapter.setItems(yayImg,yay);
                break;
            case "haa":
                itemsAdapter.setItems(haImg,ha);
                break;
            case "wao":
                itemsAdapter.setItems(vaoImg,vao);
                break;
            case "one":
                itemsAdapter.setItems(oneImg,one);
                break;
            case "two":
                itemsAdapter.setItems(twoImg,two);
                break;
            case "three":
                itemsAdapter.setItems(threeImg,three);
                break;
            case "four":
                itemsAdapter.setItems(fourImg,four);
                break;
            case "five":
                itemsAdapter.setItems(fiveImg,five);
                break;
            case "six":
                itemsAdapter.setItems(sixImg,six);
                break;
            case "seven":
                itemsAdapter.setItems(sevenImg,seven);
                break;
            case "eight":
                itemsAdapter.setItems(eightImg,eight);
                break;
            case "nine":
                itemsAdapter.setItems(nineImg,nine);
                break;
            case "ten":
                itemsAdapter.setItems(tenImg,ten);
                break;
            case "elev":
                itemsAdapter.setItems(elevImg,elev);
                break;
            case "telv":
                itemsAdapter.setItems(telvImg,telv);
                break;
            case "thirtn":
                itemsAdapter.setItems(thirtnImg,thirtn);
                break;
            case "fortn":
                itemsAdapter.setItems(fortnImg,fortn);
                break;
            case "fiftn":
                itemsAdapter.setItems(fiftnImg,fiftn);
                break;
            case "sixtn":
                itemsAdapter.setItems(sixtnImg,sixtn);
                break;
            case "sevntn":
                itemsAdapter.setItems(sevntnImg,sevntn);
                break;
            case "eightn":
                itemsAdapter.setItems(eightnImg,eightn);
                break;
            case "nintn":
                itemsAdapter.setItems(nintnImg,nintn);
                break;
            case "twinti":
                itemsAdapter.setItems(twintiImg,twinti);
                break;
            case "twinti_one":
                itemsAdapter.setItems(twinti_oneImg,twinti_one);
                break;
            case "twinti_two":
                itemsAdapter.setItems(twinti_twoImg,twinti_two);
                break;
            case "twinti_three":
                itemsAdapter.setItems(twinti_threeImg,twinti_three);
                break;
            case "twinti_four":
                itemsAdapter.setItems(twinti_fourImg,twinti_four);
                break;
            case "twinti_five":
                itemsAdapter.setItems(twinti_fiveImg,twinti_five);
                break;
   /*         case "twinti_six":
                itemsAdapter.setItems(twinti_sixImg,twinti_six);
                break;
            case "twinti_seven":
                itemsAdapter.setItems(twinti_sevenImg,twinti_seven);
                break;
            case "twinti_eight":
                itemsAdapter.setItems(twinti_eightImg,twinti_eight);
                break;
            case "twinti_nine":
                itemsAdapter.setItems(twinti_nineImg,twinti_nine);
                break;
            case "thirty":
                itemsAdapter.setItems(thirtyImg,thirty);
                break;
            case "thirty_one":
                itemsAdapter.setItems(thirty_oneImg,thirty_one);
                break;
            case "thirty_two":
                itemsAdapter.setItems(thirty_twoImg,thirty_two);
                break;
            case "thirty_three":
                itemsAdapter.setItems(thirty_threeImg,thirty_three);
                break;
            case "thirty_four":
                itemsAdapter.setItems(thirty_fourImg,thirty_four);
                break;
            case "thirty_five":
                itemsAdapter.setItems(thirty_fiveImg,thirty_five);
                break;
            case "thirty_six":
                itemsAdapter.setItems(thirty_sixImg,thirty_six);
                break;
            case "thirty_seven":
                itemsAdapter.setItems(thirty_sevenImg,thirty_seven);
                break;
            case "thirty_eight":
                itemsAdapter.setItems(thirty_eightImg,thirty_eight);
                break;
            case "thirty_nine":
                itemsAdapter.setItems(thirty_nineImg,thirty_nine);
                break;
            case "forty":
                itemsAdapter.setItems(fortyImg,forty);
                break;
            case "forty_one":
                itemsAdapter.setItems(forty_oneImg,forty_one);
                break;
            case "forty_two":
                itemsAdapter.setItems(forty_twoImg,forty_two);
                break;
            case "forty_three":
                itemsAdapter.setItems(forty_threeImg,forty_three);
                break;
            case "forty_four":
                itemsAdapter.setItems(forty_fourImg,forty_four);
                break;
            case "forty_five":
                itemsAdapter.setItems(forty_fiveImg,forty_five);
                break;
            case "forty_six":
                itemsAdapter.setItems(forty_sixImg,forty_six);
                break;
            case "forty_seven":
                itemsAdapter.setItems(forty_sevenImg,forty_seven);
                break;
            case "forty_eight":
                itemsAdapter.setItems(forty_eightImg,forty_eight);
                break;
            case "forty_nine":
                itemsAdapter.setItems(forty_nineImg,forty_nine);
                break;
            case "fifty":
                itemsAdapter.setItems(fiftyImg,fifty);
                break;*/

        }


        //to get name of image

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int ttsLang = textToSpeech.setLanguage(Locale.US);

                    if (ttsLang == TextToSpeech.LANG_MISSING_DATA
                            || ttsLang == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "The Language is not supported!");
                    } else {
                        Log.i("TTS", "Language Supported.");
                    }
                    Log.i("TTS", "Initialization success.");
                } else {
                    Toast.makeText(getApplicationContext(), "TTS Initialization failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void initViews() {
        recyclerView = findViewById(R.id.items_RV);
        itemsAdapter = new ItemAdapter(new ArrayList<Drawable>(), new ArrayList<String>(), this, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(itemsAdapter);
    }

    public void getUrdu() {

        alif = new ArrayList<>();
        bay = new ArrayList<>();
        pay = new ArrayList<>();
        tay = new ArrayList<>();
        tey = new ArrayList<>();
        say = new ArrayList<>();
        jeem = new ArrayList<>();
        chay = new ArrayList<>();
        hay = new ArrayList<>();
        khay = new ArrayList<>();
        daal = new ArrayList<>();
        daaal = new ArrayList<>();
        ra = new ArrayList<>();
        za = new ArrayList<>();
        zaa = new ArrayList<>();
        seen = new ArrayList<>();
        sheen = new ArrayList<>();
        suat = new ArrayList<>();
        zuat = new ArrayList<>();
        toi = new ArrayList<>();
        zoi = new ArrayList<>();
        ain = new ArrayList<>();
        gain = new ArrayList<>();
        fa = new ArrayList<>();
        keef = new ArrayList<>();
        kaaf = new ArrayList<>();
        gaaf = new ArrayList<>();
        laam = new ArrayList<>();
        meem = new ArrayList<>();
        noon = new ArrayList<>();
        vao = new ArrayList<>();
        ha = new ArrayList<>();
        yay = new ArrayList<>();

        alifImg = new ArrayList<>();
        alifImg.add(getResources().getDrawable(R.drawable.anar));
        alifImg.add(getResources().getDrawable(R.drawable.angoor));
        alif.add("alif anar");
        alif.add("alif angoor");


        bayImg = new ArrayList<>();
        bayImg.add(getResources().getDrawable(R.drawable.bandr));
        bayImg.add(getResources().getDrawable(R.drawable.bili));
        bay.add("bay baandar");
        bay.add("bay bili");

        payImg = new ArrayList<>();
        payImg.add(getResources().getDrawable(R.drawable.pankha));
        payImg.add(getResources().getDrawable(R.drawable.patang));
        pay.add("pay pankha");
        pay.add("pay patang");

        tayImg = new ArrayList<>();
        tayImg.add(getResources().getDrawable(R.drawable.titli));
        tay.add("tay titli");

        teyImg = new ArrayList<>();
        teyImg.add(getResources().getDrawable(R.drawable.tamatar));
        teyImg.add(getResources().getDrawable(R.drawable.topi));
        tey.add("tey tamatar");
        tey.add("tey topi");

        sayImg = new ArrayList<>();
        sayImg.add(getResources().getDrawable(R.drawable.samar));
        say.add("say samar");

        jeemImg = new ArrayList<>();
        jeemImg.add(getResources().getDrawable(R.drawable.jahaz));
        jeemImg.add(getResources().getDrawable(R.drawable.jug));
        jeem.add("jeem jahaz");
        jeem.add("jeem jug");

        chayImg = new ArrayList<>();
        chayImg.add(getResources().getDrawable(R.drawable.chabi));
        chayImg.add(getResources().getDrawable(R.drawable.chand));
        chay.add("chay chabi");
        chay.add("chay chand");

        hayImg = new ArrayList<>();
        hayImg.add(getResources().getDrawable(R.drawable.huqah));
        hay.add("hay huqah");

        khayImg = new ArrayList<>();
        khayImg.add(getResources().getDrawable(R.drawable.khargosh));
        khay.add("khay khargosh");

        daalImg = new ArrayList<>();
        daalImg.add(getResources().getDrawable(R.drawable.darakht));
        daalImg.add(getResources().getDrawable(R.drawable.dewar));
        daal.add("daal darakht");
        daal.add("daal dewar");

        daaalImg = new ArrayList<>();
        daaalImg.add(getResources().getDrawable(R.drawable.daba));
        daaalImg.add(getResources().getDrawable(R.drawable.dhol));
        daaal.add("daaal daba");
        daaal.add("daaal dhol");

        raImg = new ArrayList<>();
        raImg.add(getResources().getDrawable(R.drawable.raksha));
        raImg.add(getResources().getDrawable(R.drawable.rasi));
        ra.add("ra raksha");
        ra.add("ra rasi");

        zaImg = new ArrayList<>();
        zaImg.add(getResources().getDrawable(R.drawable.zameen));;
        za.add("za zameen");

        zaaImg = new ArrayList<>();
        zaaImg.add(getResources().getDrawable(R.drawable.zakhera));
        zaa.add("zaa zakhera");

        seenImg = new ArrayList<>();
        seenImg.add(getResources().getDrawable(R.drawable.saib));
        seenImg.add(getResources().getDrawable(R.drawable.saikal));
        seenImg.add(getResources().getDrawable(R.drawable.sooraj));
        seen.add("seen saib");
        seen.add("seen saikal");
        seen.add("seen sooraj");

        sheenImg = new ArrayList<>();
        sheenImg.add(getResources().getDrawable(R.drawable.sher));
        sheen.add("sheen sher");

        suatImg = new ArrayList<>();
        suatImg.add(getResources().getDrawable(R.drawable.sandook));
        suatImg.add(getResources().getDrawable(R.drawable.sofa));
        suat.add("suat sandook");
        suat.add("suat sofa");

        zuatImg = new ArrayList<>();
        zuatImg.add(getResources().getDrawable(R.drawable.zaeef));
        zuat.add("zuat zaeef");

        toiImg = new ArrayList<>();
        toiImg.add(getResources().getDrawable(R.drawable.tota));
        toi.add("toi tota");

        zoiImg = new ArrayList<>();
        zoiImg.add(getResources().getDrawable(R.drawable.zaroof));
        zoi.add("zoi zaroof");

        ainImg = new ArrayList<>();
        ainImg.add(getResources().getDrawable(R.drawable.ainak));
        ain.add("ain ainak");

        gainImg = new ArrayList<>();
        gainImg.add(getResources().getDrawable(R.drawable.gubaray));
        gain.add("gain gubaray");

        faImg = new ArrayList<>();
        faImg.add(getResources().getDrawable(R.drawable.footbal));
        fa.add("fa footbal");

        keefImg = new ArrayList<>();
        keefImg.add(getResources().getDrawable(R.drawable.kaila));
        keefImg.add(getResources().getDrawable(R.drawable.kainchi));
        keefImg.add(getResources().getDrawable(R.drawable.kitab));
        keef.add("keef kaila");
        keef.add("keef kainchi");
        keef.add("keef kitab");

        gaafImg = new ArrayList<>();
        gaafImg.add(getResources().getDrawable(R.drawable.gajar));
        gaafImg.add(getResources().getDrawable(R.drawable.gaind));
        gaaf.add("gaaf gajar");
        gaaf.add("gaaf gaind");

        kaafImg = new ArrayList<>();
        kaafImg.add(getResources().getDrawable(R.drawable.qalam));
        kaaf.add("kaaf qalam");

        laamImg = new ArrayList<>();
        laamImg.add(getResources().getDrawable(R.drawable.loomri));
        laam.add("laam loomri");

        meemImg = new ArrayList<>();
        meemImg.add(getResources().getDrawable(R.drawable.malta));
        meemImg.add(getResources().getDrawable(R.drawable.matar));
        meem.add("meem malta");
        meem.add("meem matar");

        noonImg = new ArrayList<>();
        noonImg.add(getResources().getDrawable(R.drawable.narail));
        noonImg.add(getResources().getDrawable(R.drawable.nashpati));
        noonImg.add(getResources().getDrawable(R.drawable.nalka));
        noon.add("noon narail");
        noon.add("noon nashpati");
        noon.add("noon nalka");

        vaoImg = new ArrayList<>();
        vaoImg.add(getResources().getDrawable(R.drawable.wark));
        vao.add("vao vark");

        haImg = new ArrayList<>();
        haImg.add(getResources().getDrawable(R.drawable.hathora));
        haImg.add(getResources().getDrawable(R.drawable.heera));
        ha.add("ha hathora");
        ha.add("ha heera");

        yayImg = new ArrayList<>();
        yayImg.add(getResources().getDrawable(R.drawable.yaka));
        yay.add("yay yaka");
    }

    public void  getNumeric(){
        oneImg = new ArrayList<>();
        twoImg = new ArrayList<>();
        threeImg = new ArrayList<>();
        fourImg = new ArrayList<>();
        fiveImg = new ArrayList<>();
        sixImg = new ArrayList<>();
        sevenImg = new ArrayList<>();
        eightImg = new ArrayList<>();
        nineImg = new ArrayList<>();
        tenImg = new ArrayList<>();
        elevImg = new ArrayList<>();
        telvImg = new ArrayList<>();
        thirtnImg = new ArrayList<>();
        fortnImg = new ArrayList<>();
        fiftnImg = new ArrayList<>();
        sixtnImg = new ArrayList<>();
        sevntnImg = new ArrayList<>();
        eightnImg = new ArrayList<>();
        nintnImg = new ArrayList<>();
        twintiImg = new ArrayList<>();
        twinti_oneImg = new ArrayList<>();
        twinti_twoImg = new ArrayList<>();
        twinti_threeImg = new ArrayList<>();
        twinti_fourImg = new ArrayList<>();
        twinti_fiveImg = new ArrayList<>();
        twinti_sevenImg = new ArrayList<>();
        twinti_eightImg = new ArrayList<>();
        twinti_nineImg = new ArrayList<>();
        thirtyImg = new ArrayList<>();
        thirty_oneImg = new ArrayList<>();
        thirty_twoImg = new ArrayList<>();
        thirty_threeImg = new ArrayList<>();
        thirty_fourImg = new ArrayList<>();
        thirty_fiveImg = new ArrayList<>();
        thirty_sixImg = new ArrayList<>();
        thirty_sevenImg = new ArrayList<>();
        thirty_eightImg = new ArrayList<>();
        thirty_nineImg = new ArrayList<>();
        fortyImg = new ArrayList<>();
        forty_oneImg = new ArrayList<>();
        forty_twoImg = new ArrayList<>();
        forty_threeImg = new ArrayList<>();
        forty_fourImg = new ArrayList<>();
        forty_fiveImg = new ArrayList<>();
        forty_sixImg = new ArrayList<>();
        forty_sevenImg = new ArrayList<>();
        forty_eightImg = new ArrayList<>();
        forty_nineImg = new ArrayList<>();
        fiftyImg = new ArrayList<>();


        one = new ArrayList<>();
        two = new ArrayList<>();
        three = new ArrayList<>();
        four = new ArrayList<>();
        five = new ArrayList<>();
        six = new ArrayList<>();
        seven = new ArrayList<>();
        eight = new ArrayList<>();
        nine = new ArrayList<>();
        ten = new ArrayList<>();
        elev = new ArrayList<>();
        telv = new ArrayList<>();
        thirtn = new ArrayList<>();
        fortn = new ArrayList<>();
        fiftn = new ArrayList<>();
        sixtn = new ArrayList<>();
        sevntn = new ArrayList<>();
        eightn = new ArrayList<>();
        nintn = new ArrayList<>();
        twinti = new ArrayList<>();
        twinti_one = new ArrayList<>();
        twinti_two = new ArrayList<>();
        twinti_three = new ArrayList<>();
        twinti_four = new ArrayList<>();
        twinti_five = new ArrayList<>();
        twinti_seven = new ArrayList<>();
        twinti_eight = new ArrayList<>();
        twinti_nine = new ArrayList<>();
        thirty = new ArrayList<>();
        thirty_one = new ArrayList<>();
        thirty_two = new ArrayList<>();
        thirty_three = new ArrayList<>();
        thirty_four = new ArrayList<>();
        thirty_five = new ArrayList<>();
        thirty_six = new ArrayList<>();
        thirty_seven = new ArrayList<>();
        thirty_eight = new ArrayList<>();
        thirty_nine = new ArrayList<>();
        forty = new ArrayList<>();
        forty_one = new ArrayList<>();
        forty_two = new ArrayList<>();
        forty_three = new ArrayList<>();
        forty_four = new ArrayList<>();
        forty_five = new ArrayList<>();
        forty_six = new ArrayList<>();
        forty_seven = new ArrayList<>();
        forty_eight = new ArrayList<>();
        forty_nine = new ArrayList<>();
        fifty = new ArrayList<>();



        oneImg.add(getResources().getDrawable(R.drawable.oneimg));
        oneImg.add(getResources().getDrawable(R.drawable.oneimg_));
        oneImg.add(getResources().getDrawable(R.drawable.oneimg__));
        oneImg.add(getResources().getDrawable(R.drawable.oneimg___));
        one.add("one finger");
        one.add("one aeroplane");
        one.add("one elephant");
        one.add("one apple");

        twoImg.add(getResources().getDrawable(R.drawable.twoimg));
        twoImg.add(getResources().getDrawable(R.drawable.twoimg_));
        twoImg.add(getResources().getDrawable(R.drawable.twoimg__));
        two.add("two seahorses");
        two.add("two fishes");
        two.add("two snakes");

        threeImg.add(getResources().getDrawable(R.drawable.threeimg));
        threeImg.add(getResources().getDrawable(R.drawable.threeimg_));
        three.add("three panda");
        three.add("three apple");

        fourImg.add(getResources().getDrawable(R.drawable.fourimg));
        fourImg.add(getResources().getDrawable(R.drawable.fourimg_));
        fourImg.add(getResources().getDrawable(R.drawable.fourimg__));
        four.add("four fishes");
        four.add("four oranges");
        four.add("four cats");

        fiveImg.add(getResources().getDrawable(R.drawable.fiveimg));
        five.add("five fingers");

        sixImg.add(getResources().getDrawable(R.drawable.siximg));
        sixImg.add(getResources().getDrawable(R.drawable.siximg_));
        six.add("six guava");
        six.add("six stars");

        sevenImg.add(getResources().getDrawable(R.drawable.sevenimg));
        sevenImg.add(getResources().getDrawable(R.drawable.sevenimg_));
        seven.add("seven birds");
        seven.add("seven fingers");

        eightImg.add(getResources().getDrawable(R.drawable.eightimg));
        eight.add("eight horses");

        nineImg.add(getResources().getDrawable(R.drawable.nineimg));
        nineImg.add(getResources().getDrawable(R.drawable.nineimg_));
        nine.add("nine strawberries");
        nine.add("nine lions");

        tenImg.add(getResources().getDrawable(R.drawable.tenimg));
        ten.add("ten fingers");

        elevImg.add(getResources().getDrawable(R.drawable.elevimg));
        elevImg.add(getResources().getDrawable(R.drawable.elevimg_));
        elev.add("eleven fishes");
        elev.add("eleven balls");

        telvImg.add(getResources().getDrawable(R.drawable.telvimg));
        telvImg.add(getResources().getDrawable(R.drawable.telvimg_));
        telv.add("twelve flowers");
        telv.add("twelve butterflies");

        thirtnImg.add(getResources().getDrawable(R.drawable.thirtnimg));
        thirtnImg.add(getResources().getDrawable(R.drawable.thirtnimg_));
        thirtn.add("thirteen pencils");
        thirtn.add("thirteen womens");

        fortnImg.add(getResources().getDrawable(R.drawable.fortnimg));
        fortn.add("fourteen shoes");

        fiftnImg.add(getResources().getDrawable(R.drawable.fiftnimg));
        fiftnImg.add(getResources().getDrawable(R.drawable.fiftnimg_));
        fiftn.add("fifteen apples");
        fiftn.add("fifteen flowers");

        sixtnImg.add(getResources().getDrawable(R.drawable.sixtnimg));
        sixtn.add("sixteen images");

        sevntnImg.add(getResources().getDrawable(R.drawable.sevntnimg));
        sevntnImg.add(getResources().getDrawable(R.drawable.sevntnimg_));
        sevntn.add("seventeen dragon flies");
        sevntn.add("seventeen guava");

        eightnImg.add(getResources().getDrawable(R.drawable.eightnimg));
        eightnImg.add(getResources().getDrawable(R.drawable.eightnimg_));
        eightn.add("eighteen hearts");
        eightn.add("eighteen pencils");

        nintnImg.add(getResources().getDrawable(R.drawable.nintnimg));
        nintn.add("nineteen colored eggs");

        twintiImg.add(getResources().getDrawable(R.drawable.twintiimg));
        twinti.add("twenty colored balls");

        twinti_oneImg.add(getResources().getDrawable(R.drawable.twinti_oneimg));
        twinti_one.add("twenty one buckets");

        twinti_twoImg.add(getResources().getDrawable(R.drawable.twinti_twoimg));
        twinti_two.add("twenty two cars");

        twinti_threeImg.add(getResources().getDrawable(R.drawable.twinti_threeimg));
        twinti_three.add("twenty three shoes");

        twinti_fourImg.add(getResources().getDrawable(R.drawable.twinti_fourimg));
        twinti_four.add("twenty four butterflies");

        twinti_fiveImg.add(getResources().getDrawable(R.drawable.twinti_fiveimg));
        twinti_five.add("twenty five ducks");
/*
       twinti_sixImg.add(getResources().getDrawable(R.drawable.twinti_siximg));
        twinti_six.add("a for apple");

        twinti_sevenImg.add(getResources().getDrawable(R.drawable.twinti_sevenimg));
        twinti_seven.add("a for apple");

        twinti_eightImg.add(getResources().getDrawable(R.drawable.twinti_eightimg));
        twinti_eight.add("a for apple");

        twinti_nineImg.add(getResources().getDrawable(R.drawable.twinti_nineimg));
        twinti_nine.add("a for apple");

        thirtyImg.add(getResources().getDrawable(R.drawable.thirtyimg));
        thirty.add("a for apple");*/

    }

    public void getEnglish() {
        imageListA = new ArrayList<>();
        imageListB = new ArrayList<>();
        imageListC = new ArrayList<>();
        imageListD = new ArrayList<>();
        imageListE = new ArrayList<>();
        imageListF = new ArrayList<>();
        imageListG = new ArrayList<>();
        imageListH = new ArrayList<>();
        imageListI = new ArrayList<>();
        imageListJ = new ArrayList<>();
        imageListK = new ArrayList<>();
        imageListL = new ArrayList<>();
        imageListM = new ArrayList<>();
        imageListN = new ArrayList<>();
        imageListO = new ArrayList<>();
        imageListP = new ArrayList<>();
        imageListQ = new ArrayList<>();
        imageListR = new ArrayList<>();
        imageListS = new ArrayList<>();
        imageListT = new ArrayList<>();
        imageListU = new ArrayList<>();
        imageListV = new ArrayList<>();
        imageListW = new ArrayList<>();
        imageListX = new ArrayList<>();
        imageListY = new ArrayList<>();
        imageListZ = new ArrayList<>();

        itemNameA = new ArrayList<>();
        itemNameB = new ArrayList<>();
        itemNameC = new ArrayList<>();
        itemNameD = new ArrayList<>();
        itemNameE = new ArrayList<>();
        itemNameF = new ArrayList<>();
        itemNameG = new ArrayList<>();
        itemNameH = new ArrayList<>();
        itemNameI = new ArrayList<>();
        itemNameJ = new ArrayList<>();
        itemNameK = new ArrayList<>();
        itemNameL = new ArrayList<>();
        itemNameM = new ArrayList<>();
        itemNameN = new ArrayList<>();
        itemNameO = new ArrayList<>();
        itemNameP = new ArrayList<>();
        itemNameQ = new ArrayList<>();
        itemNameR = new ArrayList<>();
        itemNameS = new ArrayList<>();
        itemNameT = new ArrayList<>();
        itemNameU = new ArrayList<>();
        itemNameV = new ArrayList<>();
        itemNameW = new ArrayList<>();
        itemNameX = new ArrayList<>();
        itemNameY = new ArrayList<>();
        itemNameZ = new ArrayList<>();

        imageListA.add(getResources().getDrawable(R.drawable.airplane));
        imageListA.add(getResources().getDrawable(R.drawable.alligator));
        imageListA.add(getResources().getDrawable(R.drawable.anchor));
        imageListA.add(getResources().getDrawable(R.drawable.ant));
        imageListA.add(getResources().getDrawable(R.drawable.apple));
        imageListA.add(getResources().getDrawable(R.drawable.arrow));
        imageListA.add(getResources().getDrawable(R.drawable.axe));
        itemNameA.add("a for airplane");
        itemNameA.add("a for alligator");
        itemNameA.add("a for anchor");
        itemNameA.add("a for ant");
        itemNameA.add("a for apple");
        itemNameA.add("a for arrow");
        itemNameA.add("a for axe");


        imageListB.add(getResources().getDrawable(R.drawable.ball));
        imageListB.add(getResources().getDrawable(R.drawable.balloon));
        imageListB.add(getResources().getDrawable(R.drawable.banana));
        imageListB.add(getResources().getDrawable(R.drawable.bell));
        imageListB.add(getResources().getDrawable(R.drawable.boy));
        imageListB.add(getResources().getDrawable(R.drawable.bus));
        imageListB.add(getResources().getDrawable(R.drawable.butterfly));
        itemNameB.add("b for ball");
        itemNameB.add("b for balloon");
        itemNameB.add("b for banana");
        itemNameB.add("b for bell");
        itemNameB.add("b for boy");
        itemNameB.add("b for bus");
        itemNameB.add("b for butterfly");


        imageListC.add(getResources().getDrawable(R.drawable.cake));
        imageListC.add(getResources().getDrawable(R.drawable.camel));
        imageListC.add(getResources().getDrawable(R.drawable.car));
        imageListC.add(getResources().getDrawable(R.drawable.castle));
        imageListC.add(getResources().getDrawable(R.drawable.cat));
        imageListC.add(getResources().getDrawable(R.drawable.cow));
        imageListC.add(getResources().getDrawable(R.drawable.crayons));
        itemNameC.add("c for cake");
        itemNameC.add("c for camel");
        itemNameC.add("c for car");
        itemNameC.add("c for castle");
        itemNameC.add("c for cat");
        itemNameC.add("c for cow");
        itemNameC.add("c for crayons");

        imageListD.add(getResources().getDrawable(R.drawable.deer));
        imageListD.add(getResources().getDrawable(R.drawable.dog));
        imageListD.add(getResources().getDrawable(R.drawable.doll));
        imageListD.add(getResources().getDrawable(R.drawable.dolphin));
        imageListD.add(getResources().getDrawable(R.drawable.dots));
        imageListD.add(getResources().getDrawable(R.drawable.drum));
        imageListD.add(getResources().getDrawable(R.drawable.duck));
        itemNameD.add("d for deer");
        itemNameD.add("d for dog");
        itemNameD.add("d for doll");
        itemNameD.add("d for dolphin");
        itemNameD.add("d for dots");
        itemNameD.add("d for drum");
        itemNameD.add("d for duck");

        imageListE.add(getResources().getDrawable(R.drawable.eagle));
        imageListE.add(getResources().getDrawable(R.drawable.ear));
        imageListE.add(getResources().getDrawable(R.drawable.earth));
        imageListE.add(getResources().getDrawable(R.drawable.eggs));
        imageListE.add(getResources().getDrawable(R.drawable.elephant));
        imageListE.add(getResources().getDrawable(R.drawable.engine));
        imageListE.add(getResources().getDrawable(R.drawable.envelope));
        itemNameE.add("e for eagle");
        itemNameE.add("e for ear");
        itemNameE.add("e for earth");
        itemNameE.add("e for eggs");
        itemNameE.add("e for elephant");
        itemNameE.add("e for engine");
        itemNameE.add("e for envelope");

        imageListF.add(getResources().getDrawable(R.drawable.fairy));
        imageListF.add(getResources().getDrawable(R.drawable.family));
        imageListF.add(getResources().getDrawable(R.drawable.fan));
        imageListF.add(getResources().getDrawable(R.drawable.fish));
        imageListF.add(getResources().getDrawable(R.drawable.flowers));
        imageListF.add(getResources().getDrawable(R.drawable.frog));
        imageListF.add(getResources().getDrawable(R.drawable.fruits));
        itemNameF.add("f for fairy");
        itemNameF.add("f for family");
        itemNameF.add("f for fan");
        itemNameF.add("f for fish");
        itemNameF.add("f for flowers");
        itemNameF.add("f for frog");
        itemNameF.add("f for fruits");

        imageListG.add(getResources().getDrawable(R.drawable.gate));
        imageListG.add(getResources().getDrawable(R.drawable.giraffe));
        imageListG.add(getResources().getDrawable(R.drawable.girl));
        imageListG.add(getResources().getDrawable(R.drawable.grapes));
        imageListG.add(getResources().getDrawable(R.drawable.grass));
        imageListG.add(getResources().getDrawable(R.drawable.green));
        imageListG.add(getResources().getDrawable(R.drawable.guitar));
        itemNameG.add("g for gate");
        itemNameG.add("g for giraffe");
        itemNameG.add("g for girl");
        itemNameG.add("g for grapes");
        itemNameG.add("g for grass");
        itemNameG.add("g for green");
        itemNameG.add("g for guitar");

        imageListH.add(getResources().getDrawable(R.drawable.hammer));
        imageListH.add(getResources().getDrawable(R.drawable.hands));
        imageListH.add(getResources().getDrawable(R.drawable.hat));
        imageListH.add(getResources().getDrawable(R.drawable.heart));
        imageListH.add(getResources().getDrawable(R.drawable.helicopter));
        imageListH.add(getResources().getDrawable(R.drawable.horse));
        imageListH.add(getResources().getDrawable(R.drawable.house));
        itemNameH.add("h for hammer");
        itemNameH.add("h for hands");
        itemNameH.add("h for hat");
        itemNameH.add("h for heart");
        itemNameH.add("h for helicopter");
        itemNameH.add("h for horse");
        itemNameH.add("h for house");

        imageListI.add(getResources().getDrawable(R.drawable.icecream));
        imageListI.add(getResources().getDrawable(R.drawable.icecube));
        imageListI.add(getResources().getDrawable(R.drawable.igloo));
        imageListI.add(getResources().getDrawable(R.drawable.infant));
        imageListI.add(getResources().getDrawable(R.drawable.ink));
        imageListI.add(getResources().getDrawable(R.drawable.insect));
        imageListI.add(getResources().getDrawable(R.drawable.iron));
        itemNameI.add("i for icecream");
        itemNameI.add("i for icecube");
        itemNameI.add("i for igloo");
        itemNameI.add("i for infant");
        itemNameI.add("i for ink");
        itemNameI.add("i for insect");
        itemNameI.add("i for iron");

        imageListJ.add(getResources().getDrawable(R.drawable.jaguar));
        imageListJ.add(getResources().getDrawable(R.drawable.jar));
        imageListJ.add(getResources().getDrawable(R.drawable.jeep));
        imageListJ.add(getResources().getDrawable(R.drawable.jelly));
        imageListJ.add(getResources().getDrawable(R.drawable.jellyfish));
        imageListJ.add(getResources().getDrawable(R.drawable.joker));
        imageListJ.add(getResources().getDrawable(R.drawable.jugg));
        itemNameJ.add("j for jaguar");
        itemNameJ.add("j for jar");
        itemNameJ.add("j for jeep");
        itemNameJ.add("j for jelly");
        itemNameJ.add("j for jellyfish");
        itemNameJ.add("j for joker");
        itemNameJ.add("j for jug");

        imageListK.add(getResources().getDrawable(R.drawable.kettle));
        imageListK.add(getResources().getDrawable(R.drawable.kangaroo));
        imageListK.add(getResources().getDrawable(R.drawable.key));
        imageListK.add(getResources().getDrawable(R.drawable.king));
        imageListK.add(getResources().getDrawable(R.drawable.kit));
        imageListK.add(getResources().getDrawable(R.drawable.kite));
        imageListK.add(getResources().getDrawable(R.drawable.knife));
        itemNameK.add("k for kettle");
        itemNameK.add("k for kangaroo");
        itemNameK.add("k for key");
        itemNameK.add("k for king");
        itemNameK.add("k for kit");
        itemNameK.add("k for kite");
        itemNameK.add("k for knife");

        imageListL.add(getResources().getDrawable(R.drawable.ladder));
        imageListL.add(getResources().getDrawable(R.drawable.lamp));
        imageListL.add(getResources().getDrawable(R.drawable.leaf));
        imageListL.add(getResources().getDrawable(R.drawable.lion));
        imageListL.add(getResources().getDrawable(R.drawable.lips));
        imageListL.add(getResources().getDrawable(R.drawable.lock));
        imageListL.add(getResources().getDrawable(R.drawable.lotus));
        itemNameL.add("l for ladder");
        itemNameL.add("l for lamp");
        itemNameL.add("l for leaf");
        itemNameL.add("l for lion");
        itemNameL.add("l for lips");
        itemNameL.add("l for lock");
        itemNameL.add("l for lotus");

        imageListM.add(getResources().getDrawable(R.drawable.mask));
        imageListM.add(getResources().getDrawable(R.drawable.man));
        imageListM.add(getResources().getDrawable(R.drawable.mango));
        imageListM.add(getResources().getDrawable(R.drawable.monkey));
        imageListM.add(getResources().getDrawable(R.drawable.moon));
        imageListM.add(getResources().getDrawable(R.drawable.mother));
        imageListM.add(getResources().getDrawable(R.drawable.mouse));
        itemNameM.add("m for mask");
        itemNameM.add("m for man");
        itemNameM.add("m for mango");
        itemNameM.add("m for monkey");
        itemNameM.add("m for moon");
        itemNameM.add("m for mother");
        itemNameM.add("m for mouse");

        imageListN.add(getResources().getDrawable(R.drawable.necklace));
        imageListN.add(getResources().getDrawable(R.drawable.nest));
        imageListN.add(getResources().getDrawable(R.drawable.net));
        imageListN.add(getResources().getDrawable(R.drawable.nib));
        imageListN.add(getResources().getDrawable(R.drawable.nose));
        imageListN.add(getResources().getDrawable(R.drawable.nurse));
        imageListN.add(getResources().getDrawable(R.drawable.nut));
        itemNameN.add("n for necklace");
        itemNameN.add("n for nest");
        itemNameN.add("n for net");
        itemNameN.add("n for nib");
        itemNameN.add("n for nose");
        itemNameN.add("n for nurse");
        itemNameN.add("n for nut");

        imageListO.add(getResources().getDrawable(R.drawable.octopus));
        imageListO.add(getResources().getDrawable(R.drawable.olives));
        imageListO.add(getResources().getDrawable(R.drawable.onion));
        imageListO.add(getResources().getDrawable(R.drawable.orange));
        imageListO.add(getResources().getDrawable(R.drawable.ostrich));
        imageListO.add(getResources().getDrawable(R.drawable.oven));
        imageListO.add(getResources().getDrawable(R.drawable.owl));
        itemNameO.add("o for octopus");
        itemNameO.add("o for olives");
        itemNameO.add("o for onion");
        itemNameO.add("o for orange");
        itemNameO.add("o for ostrich");
        itemNameO.add("o for oven");
        itemNameO.add("o for owl");

        imageListP.add(getResources().getDrawable(R.drawable.pan));
        imageListP.add(getResources().getDrawable(R.drawable.panda));
        imageListP.add(getResources().getDrawable(R.drawable.parachute));
        imageListP.add(getResources().getDrawable(R.drawable.parrot));
        imageListP.add(getResources().getDrawable(R.drawable.penguin));
        imageListP.add(getResources().getDrawable(R.drawable.pig));
        imageListP.add(getResources().getDrawable(R.drawable.plant));
        itemNameP.add("p for pan");
        itemNameP.add("p for panda");
        itemNameP.add("p for parachute");
        itemNameP.add("p for parrot");
        itemNameP.add("p for penguin");
        itemNameP.add("p for pig");
        itemNameP.add("p for plant");

        imageListQ.add(getResources().getDrawable(R.drawable.quail));
        imageListQ.add(getResources().getDrawable(R.drawable.quarter));
        imageListQ.add(getResources().getDrawable(R.drawable.queen));
        imageListQ.add(getResources().getDrawable(R.drawable.questionmark));
        imageListQ.add(getResources().getDrawable(R.drawable.quiet));
        imageListQ.add(getResources().getDrawable(R.drawable.quill));
        imageListQ.add(getResources().getDrawable(R.drawable.quilt));
        itemNameQ.add("q for quail");
        itemNameQ.add("q for quarter");
        itemNameQ.add("q for queen");
        itemNameQ.add("q for questionmark");
        itemNameQ.add("q for quiet");
        itemNameQ.add("q for quill");
        itemNameQ.add("q for quilt");

        imageListR.add(getResources().getDrawable(R.drawable.rabbit));
        imageListR.add(getResources().getDrawable(R.drawable.rainbow));
        imageListR.add(getResources().getDrawable(R.drawable.rat));
        imageListR.add(getResources().getDrawable(R.drawable.ring));
        imageListR.add(getResources().getDrawable(R.drawable.rhinoceros));
        imageListR.add(getResources().getDrawable(R.drawable.robot));
        imageListR.add(getResources().getDrawable(R.drawable.rose));
        itemNameR.add("r for rabbit");
        itemNameR.add("r for rainbow");
        itemNameR.add("r for rat");
        itemNameR.add("r for ring");
        itemNameR.add("r for rhinoceros");
        itemNameR.add("r for robot");
        itemNameR.add("r for rose");

        imageListS.add(getResources().getDrawable(R.drawable.scissors));
        imageListS.add(getResources().getDrawable(R.drawable.shark));
        imageListS.add(getResources().getDrawable(R.drawable.sheep));
        imageListS.add(getResources().getDrawable(R.drawable.ship));
        imageListS.add(getResources().getDrawable(R.drawable.snake));
        imageListS.add(getResources().getDrawable(R.drawable.strawberry));
        imageListS.add(getResources().getDrawable(R.drawable.sun));
        itemNameS.add("s for scissors");
        itemNameS.add("s for shark");
        itemNameS.add("s for sheep");
        itemNameS.add("s for ship");
        itemNameS.add("s for snake");
        itemNameS.add("s for strawberry");
        itemNameS.add("s for sun");

        imageListT.add(getResources().getDrawable(R.drawable.table));
        imageListT.add(getResources().getDrawable(R.drawable.teddy));
        imageListT.add(getResources().getDrawable(R.drawable.tent));
        imageListT.add(getResources().getDrawable(R.drawable.tiger));
        imageListT.add(getResources().getDrawable(R.drawable.tomato));
        imageListT.add(getResources().getDrawable(R.drawable.tortoise));
        imageListT.add(getResources().getDrawable(R.drawable.tree));
        itemNameT.add("t for table");
        itemNameT.add("t for teddy");
        itemNameT.add("t for tent");
        itemNameT.add("t for tiger");
        itemNameT.add("t for tomato");
        itemNameT.add("t for tortoise");
        itemNameT.add("t for tree");

        imageListU.add(getResources().getDrawable(R.drawable.umbrella));
        imageListU.add(getResources().getDrawable(R.drawable.undergarment));
        imageListU.add(getResources().getDrawable(R.drawable.unicorn));
        imageListU.add(getResources().getDrawable(R.drawable.unicycle));
        imageListU.add(getResources().getDrawable(R.drawable.uniform));
        imageListU.add(getResources().getDrawable(R.drawable.up));
        imageListU.add(getResources().getDrawable(R.drawable.urn));
        itemNameU.add("u for umbrella");
        itemNameU.add("u for undergarment");
        itemNameU.add("u for unicorn");
        itemNameU.add("u for unicycle");
        itemNameU.add("u for uniform");
        itemNameU.add("u for up");
        itemNameU.add("u for urn");

        imageListV.add(getResources().getDrawable(R.drawable.vaccumcleaner));
        imageListV.add(getResources().getDrawable(R.drawable.van));
        imageListV.add(getResources().getDrawable(R.drawable.vase));
        imageListV.add(getResources().getDrawable(R.drawable.vegetables));
        imageListV.add(getResources().getDrawable(R.drawable.vest));
        imageListV.add(getResources().getDrawable(R.drawable.violin));
        imageListV.add(getResources().getDrawable(R.drawable.vulture));
        itemNameV.add("v for vaccumcleaner");
        itemNameV.add("v for van");
        itemNameV.add("v for vase");
        itemNameV.add("v for vegetable");
        itemNameV.add("v for vest");
        itemNameV.add("v for violin");
        itemNameV.add("v for vulture");

        imageListW.add(getResources().getDrawable(R.drawable.wall));
        imageListW.add(getResources().getDrawable(R.drawable.watch));
        imageListW.add(getResources().getDrawable(R.drawable.water));
        imageListW.add(getResources().getDrawable(R.drawable.watermelon));
        imageListW.add(getResources().getDrawable(R.drawable.well));
        imageListW.add(getResources().getDrawable(R.drawable.wheel));
        imageListW.add(getResources().getDrawable(R.drawable.window));
        itemNameW.add("w for wall");
        itemNameW.add("w for watch");
        itemNameW.add("w for water");
        itemNameW.add("w for watermelon");
        itemNameW.add("w for well");
        itemNameW.add("w for wheel");
        itemNameW.add("w for window");

        imageListX.add(getResources().getDrawable(R.drawable.xmastree));
        imageListX.add(getResources().getDrawable(R.drawable.xylophone));
        itemNameX.add("x for xmastree");
        itemNameX.add("x for xylophone");

        imageListY.add(getResources().getDrawable(R.drawable.yacht));
        imageListY.add(getResources().getDrawable(R.drawable.yak));
        imageListY.add(getResources().getDrawable(R.drawable.yam));
        imageListY.add(getResources().getDrawable(R.drawable.yellow));
        imageListY.add(getResources().getDrawable(R.drawable.yoga));
        imageListY.add(getResources().getDrawable(R.drawable.yolk));
        imageListY.add(getResources().getDrawable(R.drawable.yoyo));
        itemNameY.add("y for yacht");
        itemNameY.add("y for yak");
        itemNameY.add("y for yam");
        itemNameY.add("y for yellow");
        itemNameY.add("y for yoga");
        itemNameY.add("y for yolk");
        itemNameY.add("y for yoyo");

        imageListZ.add(getResources().getDrawable(R.drawable.zebra));
        imageListZ.add(getResources().getDrawable(R.drawable.zebracrossing));
        imageListZ.add(getResources().getDrawable(R.drawable.zero));
        imageListZ.add(getResources().getDrawable(R.drawable.zigzag));
        imageListZ.add(getResources().getDrawable(R.drawable.zip));
        imageListZ.add(getResources().getDrawable(R.drawable.zoo));
        imageListZ.add(getResources().getDrawable(R.drawable.zucchini));
        itemNameZ.add("z for zebra");
        itemNameZ.add("z for zebracrossing");
        itemNameZ.add("z for zero");
        itemNameZ.add("z for zigzag");
        itemNameZ.add("z for zip");
        itemNameZ.add("z for zoo");
        itemNameZ.add("z for zucchini");
    }

    @Override
    public void onClick(String name, AppCompatImageView itemImage) {

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide);
        Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide1);
        Animation animationstart[]={animation1,animation2,animation3,animation4,animation5};
        Random r = new Random();
        int randomNumber = r.nextInt(5);

        itemImage.startAnimation(animationstart[randomNumber]);

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        Log.i("HELL", "onClick: " + name);
        int speechStatus = textToSpeech.speak(name, TextToSpeech.QUEUE_FLUSH, null);

        if (speechStatus == TextToSpeech.ERROR) {
            Log.e("TTS", "Error in converting Text to Speech!");
        }
    }
}
