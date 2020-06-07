package com.example.testgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /* Field to hold the text topic */
    TextView rollTopic;

    /* Field to hold the subtext*/
    TextView rollSubTopic;

    /* Field to hold the roll button*/
    Button rollButton;

    /* Field to hold the result*/
    int result;

    /*Field to hold random number generator*/
    Random rand;

    /* Fields to hold the value*/
    public int choice1;
    public int choice2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = 0;

        rollTopic       = findViewById(R.id.textView2);
        rollSubTopic    = findViewById(R.id.textView3);
        rollButton      = findViewById(R.id.bottom);


        Toast.makeText(getApplicationContext(), "Welcome to the test roller", Toast.LENGTH_SHORT).show();

        rand = new Random();

    }

    /* Field to hold the Topic Message */
    String topicMsg = "";

    /* Field to hold the Subtopic Message */
    String subTopicMsg = "";

    public void rollTopic(View v){
        choice1 = rand.nextInt(9);

        switch(choice1){
            case 0:
                topicMsg = "Emne: Klasser";
                choice();
                break;
            case 1:
                topicMsg = "Emne: Objekter";
                rollSubTopic.setText("Sektion 1");
                break;
            case 2:
                topicMsg = "Emne: Metode";
                rollSubTopic.setText("Sektion 1");
                break;
            case 3:
                topicMsg = "Emne: Løkker";
                choice();
                break;
            case 4:
                topicMsg = "Emne: Array";
                rollSubTopic.setText("Sektion 1");
                break;
            case 5:
                topicMsg = "Emne ArrayList";
                rollSubTopic.setText("Sektion 1");
                break;
            case 6:
                topicMsg = "Emne: Inheritance";
                choice();
                break;
            case 7:
                topicMsg = "Emne: Scanner";
                rollSubTopic.setText("Sektion 1");
                break;
            case 8:
                topicMsg = "Emne Statements";
                choice();
                break;
        }

        rollTopic.setText(topicMsg);

    }
    public void choice(){
        choice2 = rand.nextInt(3);

        switch(choice2){
            case 0:
                subTopicMsg = ("Sektion: 1");
                break;
            case 1:
                subTopicMsg = ("Sektion: 2");
                break;
            case 2:
                subTopicMsg = ("Sektion: 3");
                break;
        }

        rollSubTopic.setText(subTopicMsg);
    }
}
