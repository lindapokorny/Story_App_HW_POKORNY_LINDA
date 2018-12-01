package com.example.lindapokorny.madlibshomeworkattempt1;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

import static com.example.lindapokorny.madlibshomeworkattempt1.ColorHelper.BACKGROUND_COLOR_ARRAY;

public class FourthActivity extends AppCompatActivity {
    private ConstraintLayout constraintLayout;
    public static final String ANIMAL = "";
    private EditText editAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        constraintLayout = findViewById(R.id.activity_fourth);

        editAnimal = findViewById(R.id.editAnimal);
        Random random = new Random();

        int colorIndex = random.nextInt(BACKGROUND_COLOR_ARRAY.length - 1);

        String color = BACKGROUND_COLOR_ARRAY[colorIndex];

        int colorRes = ColorHelper.getColorId(this, color);
        constraintLayout.setBackgroundColor(colorRes);
    }
    public void launchFifthActivity(View view){
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);

    }
}
