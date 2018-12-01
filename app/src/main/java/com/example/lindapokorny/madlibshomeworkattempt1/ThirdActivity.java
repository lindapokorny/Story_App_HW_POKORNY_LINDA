package com.example.lindapokorny.madlibshomeworkattempt1;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

import static com.example.lindapokorny.madlibshomeworkattempt1.ColorHelper.BACKGROUND_COLOR_ARRAY;

public class ThirdActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    public static final String PASTRY = "";
    private EditText editPastry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        constraintLayout = findViewById(R.id.activity_third);

        editPastry = findViewById(R.id.editPastry);
        Random random = new Random();

        int colorIndex = random.nextInt(BACKGROUND_COLOR_ARRAY.length - 1);

        String color = BACKGROUND_COLOR_ARRAY[colorIndex];

        int colorRes = ColorHelper.getColorId(this, color);
        constraintLayout.setBackgroundColor(colorRes);

    }
    public void launchFourthActivity(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}
