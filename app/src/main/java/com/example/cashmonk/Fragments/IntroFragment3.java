package com.example.cashmonk.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.cashmonk.LoginActivity;
import com.example.cashmonk.R;
import com.google.android.material.button.MaterialButton;

public class IntroFragment3 extends Fragment {

    public IntroFragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro3, container, false);

        ImageButton getStartedButton = view.findViewById(R.id.get_started_button);
        getStartedButton.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), LoginActivity.class));
            if (getActivity() != null) {
                getActivity().finish();
            }
        });

        return view;
    }
}