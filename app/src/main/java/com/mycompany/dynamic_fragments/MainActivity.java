package com.mycompany.dynamic_fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    Fragment1 frag1;
    Fragment2 frag2;
    FragmentTransaction fTrans;
    FragmentManager fManager;
    Fragment first, second;
    final String LOG_TAG = "myLogs";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        frag1 = new Fragment1();
        frag2 = new Fragment2();
        Log.d(LOG_TAG, "MainActivity onCreate");
    }

        protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "MainActivity onStart");
    }

    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "MainActivity onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "MainActivity onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "MainActivity onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "MainActivity onDestroy");
    }

    public void onClick(View v) {
        fTrans = getFragmentManager().beginTransaction();
        fManager =getFragmentManager();
        switch (v.getId()) {
            case R.id.btnAdd:
                if (!IsNotEmpty(fManager)){
                   fTrans.add(R.id.frgmCont1, frag1, "first");
                   fTrans.add(R.id.frgmCont2, frag2, "second");
            }
                break;
            case R.id.btnRemove:
                if (IsNotEmpty(fManager)){
                   fTrans.remove(frag1);
                   fTrans.remove(frag2);
                }
                break;
            default:
                break;
        }
        fTrans.commit();
        fManager.executePendingTransactions();
    }
    boolean IsNotEmpty(FragmentManager fManager){
        first  = fManager.findFragmentByTag("first");
        second = fManager.findFragmentByTag("second");
        return (first!=null && second!=null);
    }
}