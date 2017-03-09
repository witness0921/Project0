package com.example.witness.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Toast mToast=null;

    private void show(String msg){
        if(mToast==null){
            mToast=Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(msg);
        }
        mToast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v){
        switch(v.getId()){
            case R.id.btn_movies:
                show(getString(R.string.startApplication)+":"+getString(R.string.movies));
                break;
            case R.id.btn_stock:
                show(getString(R.string.startApplication)+":"+getString(R.string.stock));
                break;
            case R.id.btn_browser:
                show(getString(R.string.startApplication)+":"+getString(R.string.browser));
                break;
            case R.id.btn_news:
                show(getString(R.string.startApplication)+":"+getString(R.string.news));
                break;
            case R.id.btn_graduationProject:
                show(getString(R.string.startApplication)+":"+getString(R.string.graduationProject));
                break;

        }
    }

}
