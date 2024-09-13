package com.example.myfirstapplication_ana;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textView, WorkExperience, Achievements, Education;
//    EditText editText;
    CheckBox checkBox, achievementsCB, educBackgroundCB, skillsCB;
    LinearLayout skillsLinear;
    SeekBar seekbar1, seekbar2, seekbar3, seekbar4, seekbar5, seekbar6, seekbar7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView = findViewById(R.id.textView1);
        WorkExperience = findViewById(R.id.WEtext);
        Achievements = findViewById(R.id.AchievementText);

        checkBox = findViewById(R.id.checkBoxWE);
        achievementsCB = findViewById(R.id.checkBoxAchievements);
        educBackgroundCB = findViewById(R.id.checkBoxEB);
        skillsCB = findViewById(R.id.checkBoxSkills);
        skillsLinear = findViewById(R.id.skillsContent);
        seekbar1 = findViewById(R.id.seekBar1);
        seekbar2 = findViewById(R.id.seekBar2);
        seekbar3 = findViewById(R.id.seekBar3);
        seekbar4 = findViewById(R.id.seekBar4);
        seekbar5 = findViewById(R.id.seekBar5);
        seekbar6 = findViewById(R.id.seekBar6);
        seekbar7 = findViewById(R.id.seekBar7);





        checkBox.setOnCheckedChangeListener((checkBox, isCheck) -> {
            if(isCheck){
                WorkExperience.setVisibility(View.VISIBLE);
            }else{
                WorkExperience.setVisibility(View.GONE);
            }
        });

        achievementsCB.setOnCheckedChangeListener((checkBox, isCheck) -> {
            if(isCheck){
                Achievements.setVisibility(View.VISIBLE);
            }else{
                Achievements.setVisibility(View.GONE);
            }
        });

        educBackgroundCB.setOnCheckedChangeListener((checkBox, isCheck) -> {
            if(isCheck){
                Education.setVisibility(View.VISIBLE);
            }else{
                Education.setVisibility(View.GONE);
            }
        });


        skillsCB.setOnCheckedChangeListener((checkBox, isCheck) -> {
            if(isCheck){
                skillsLinear.setVisibility(View.VISIBLE);
            }else{
                skillsLinear.setVisibility(View.GONE);
            }
        });

        seekbar1.setOnTouchListener((v, event) -> true);
        seekbar2.setOnTouchListener((v, event) -> true);
        seekbar3.setOnTouchListener((v, event) -> true);
        seekbar4.setOnTouchListener((v, event) -> true);
        seekbar5.setOnTouchListener((v, event) -> true);
        seekbar6.setOnTouchListener((v, event) -> true);
        seekbar7.setOnTouchListener((v, event) -> true);

//        textView2 = findViewById(R.id.textView2);
//        textView2.setText("Hello, My awesome resume");
//        textView2.setBackgroundColor(Color.parseColor("#ff0000"));
//        textView2.setTextColor(Color.parseColor("#ffff00"));

//        editText = findViewById(R.id.editText);



    }

    public void onHideClick(View view) {
//        textView2.setVisibility(View.GONE);

      // boolean isVisible = textView2.getVisibility() == View.VISIBLE;
       // textView2.setVisibility(isVisible ? View.GONE : View.VISIBLE);
//        ColorStateList x = ColorStateList.valueOf(Color.parseColor("#ffff00"));
     //   ColorStateList x = ColorStateList.valueOf(getColor(R.color.black));
     //   editText.setBackgroundTintList(x);

    //    textView.setText("Analyn G. Potestad");
     //   textView.setBackgroundColor(Color.parseColor("#ff0000"));
     //   textView.setTextColor(Color.parseColor("#ffff00"));

    }
}