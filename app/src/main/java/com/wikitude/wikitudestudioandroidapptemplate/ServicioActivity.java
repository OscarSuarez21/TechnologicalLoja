package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ServicioActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicio_activity);
    }
    //public void map(View view) {
      //  String nombre_paquete = "com.example.martes";
        //Intent e = new Intent();
        //PackageManager manager = getPackageManager();
        //e = manager.getLaunchIntentForPackage(nombre_paquete);
        //e.addCategory(Intent.CATEGORY_LAUNCHER);
        //startActivity(e);
    //}
    public void irmapa(View view){
        Intent i =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@-3.9759845,-79.2058785,3a,75y,351.65h,94.18t/data=!3m4!1e1!3m2!1sJqyDj26dHxEzL2OyBeoEcA!2e0"));
        startActivity(i);
    }
}