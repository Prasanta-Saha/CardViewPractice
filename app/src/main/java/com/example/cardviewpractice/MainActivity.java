package com.example.cardviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter1=1,counter2=1,counter3=1,counter4=1,counter5=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mm(View view)
    {
        String s=view.getTag().toString();
        switch (s){
            case "NAME TAG":
                if (counter1==1){
                view.setBackgroundColor(getResources().getColor(R.color.red));
                counter1++;}
                else {
                    counter1=1;
                    view.setBackgroundColor(getResources().getColor(R.color.blue));}
                break;
            case "DOB TAG":
                if (counter2==1){
                    view.setBackgroundColor(getResources().getColor(R.color.red));
                    counter2++;}
                else {
                    counter2=1;
                    view.setBackgroundColor(getResources().getColor(R.color.blue));}
                break;
            case "LIKE BUTTON":
                if (counter3==1){
                    view.setBackgroundColor(getResources().getColor(R.color.red));
                    counter3++;}
                else {
                    counter3=1;
                    view.setBackgroundColor(getResources().getColor(R.color.blue));}
                break;
            case "COMMENT BUTTON":
                if (counter4==1){
                    view.setBackgroundColor(getResources().getColor(R.color.red));
                    counter4++;}
                else {
                    counter4=1;
                    view.setBackgroundColor(getResources().getColor(R.color.blue));}
                break;
            case "SHARE BUTTON":
                if (counter5==1){
                    view.setBackgroundColor(getResources().getColor(R.color.red));
                    counter5++;}
                else {
                    counter5=1;
                    view.setBackgroundColor(getResources().getColor(R.color.blue));}
                break;
            default:
                break;
        }
        Toast.makeText(this,"You Clicked On "+s,Toast.LENGTH_LONG).show();
    }

}
