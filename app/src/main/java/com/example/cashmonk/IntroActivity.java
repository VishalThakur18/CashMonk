package com.example.cashmonk;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.cashmonk.Fragments.IntroFragment1;
import com.example.cashmonk.Fragments.IntroFragment2;
import com.example.cashmonk.Fragments.IntroFragment3;
import com.google.android.material.button.MaterialButton;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Install and customize the splash screen


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        MaterialButton skipButton = findViewById(R.id.skip_button);

        viewPager.setAdapter(new IntroPagerAdapter(this));
        skipButton.setOnClickListener(v -> {
            startActivity(new Intent(IntroActivity.this, LoginActivity.class));
            finish();
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if (position == 2) {
                    skipButton.setText("Get Started");
                    skipButton.setOnClickListener(v -> {
                        startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                        finish();
                    });
                } else {
                    skipButton.setText("Skip");
                }
            }
        });
    }

    private class IntroPagerAdapter extends FragmentStateAdapter {
        public IntroPagerAdapter(IntroActivity activity) {
            super(activity);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new IntroFragment1();
                case 1:
                    return new IntroFragment2();
                case 2:
                    return new IntroFragment3();
                default:
                    return new IntroFragment1(); // Default to first slide
            }
        }

        @Override
        public int getItemCount() {
            return 3; // Three intro slides
        }
    }
}