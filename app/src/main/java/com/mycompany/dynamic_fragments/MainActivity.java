package com.mycompany.dynamic_fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    Fragment1 frag1;
    Fragment2 frag2;
    FragmentTransaction fTrans;
    FragmentManager fManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        frag1 = new Fragment1();
        frag2 = new Fragment2();
    }

    public void onClick(View v) {
        fTrans = getFragmentManager().beginTransaction();
        fManager =getFragmentManager();
        switch (v.getId()) {
            case R.id.btnAdd:
                fTrans.add(R.id.frgmCont1, frag1);
                fTrans.add(R.id.frgmCont2, frag2);

                break;
            case R.id.btnRemove:
                fTrans.remove(frag1);
                break;
            case R.id.btnReplace:
                fTrans.replace(R.id.frgmCont1, frag2);
            default:
                break;
        }
        fTrans.commit();
        fManager.executePendingTransactions();
    }
}