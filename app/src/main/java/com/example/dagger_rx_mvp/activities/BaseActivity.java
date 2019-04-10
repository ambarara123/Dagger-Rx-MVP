package com.example.dagger_rx_mvp.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getContentView());
        onViewReady(savedInstanceState,getIntent());
    }

    protected abstract int getContentView();



    protected void onViewReady(Bundle savedIntanceState, Intent intent){

    }

    protected void showDialog(String message){
        if (progressDialog==null){
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setCancelable(true);
        }
        progressDialog.setMessage(message);
        progressDialog.show();
    }

    protected void hideDialogue(){
        if (progressDialog.isShowing()&&progressDialog!=null){
            progressDialog.dismiss();
        }
    }
}
