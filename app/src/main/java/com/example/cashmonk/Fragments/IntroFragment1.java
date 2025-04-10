package com.example.cashmonk.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.cashmonk.IntroActivity;
import com.example.cashmonk.R;

public class IntroFragment1 extends Fragment {

    public IntroFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro1, container, false);

        ImageButton nextButton = view.findViewById(R.id.next_button_1);
        nextButton.setOnClickListener(v -> {
            if (getActivity() instanceof IntroActivity) {
                ViewPager2 viewPager = ((IntroActivity) getActivity()).findViewById(R.id.viewPager);
                viewPager.setCurrentItem(1, true); // Move to next slide
            }
        });

        return view;
    }
}