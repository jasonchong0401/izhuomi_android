package com.example.jasonchong.izhuomi;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jasonchong on 4/4/15.
 */
public class NoteFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.layout2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
