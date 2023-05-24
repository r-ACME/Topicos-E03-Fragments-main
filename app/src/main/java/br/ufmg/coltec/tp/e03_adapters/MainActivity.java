package br.ufmg.coltec.tp.e03_adapters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        FragmentManager fm = this.getSupportFragmentManager();
//        Fragment expand = fm.findFragmentById(R.id.frag_places_expand);
//        Fragment list = fm.findFragmentById(R.id.frag_places_list);

    }
}
