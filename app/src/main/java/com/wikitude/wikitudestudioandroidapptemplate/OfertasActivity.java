package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class OfertasActivity extends Activity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ofertas_activity);


        int images[]= {R.drawable.software, R.drawable.mecaica, R.drawable.conta};

        v_flipper=findViewById(R.id.v_flipper);

        //blucle
        for (int image:images){
            flipperImages(image);
        }
    }
    public void scan(View view) {
        String nombre_paquete = "com.example.escanner";
        Intent e = new Intent();
        PackageManager manager = getPackageManager();
        e = manager.getLaunchIntentForPackage(nombre_paquete);
        e.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(e);
    }
    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000); //4 segundos
        v_flipper.setAutoStart(true);

        //animacion
        v_flipper.setInAnimation(this,  android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}