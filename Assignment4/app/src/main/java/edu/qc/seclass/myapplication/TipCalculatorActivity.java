package edu.qc.seclass.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class TipCalculatorActivity extends Activity {

    public void computeTip(View view){
        TextInputEditText checkAmount = findViewById(R.id.checkAmountValue);
        TextInputEditText partySize = findViewById(R.id.partySizeValue);

        String partySizeString = String.valueOf(partySize.getText());
        String checkAmountString = String.valueOf(checkAmount.getText());

        for(int i = 0; i<checkAmountString.length();i++){
            if (Character.isLetter(checkAmountString.charAt(i)) ){
                Toast.makeText(this, "Input must be positive numbers only, Please Try Again", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if(checkAmountString.isEmpty()){
            Toast.makeText(this, "Input must be positive numbers only, Please Try Again", Toast.LENGTH_SHORT).show();
            return;
        }

        else if ( Double.parseDouble(checkAmountString) <=0 ){
            Toast.makeText(this, "Input must be positive numbers only, Please Try Again", Toast.LENGTH_SHORT).show();
            return;
        }




        for(int i = 0; i<partySizeString.length();i++){
            if (Character.isLetter(partySizeString.charAt(i)) ){
                Toast.makeText(this, "Input must be positive numbers only, Please Try Again", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if(partySizeString.isEmpty()){
            Toast.makeText(this, "Input must be positive numbers only, Please Try Again", Toast.LENGTH_SHORT).show();
            return;
        }

        else if ( Double.parseDouble(partySizeString) <=0 ){
            Toast.makeText(this, "Input must be positive numbers only, Please Try Again", Toast.LENGTH_SHORT).show();
            return;
        }


        double checkAmountDouble = Double.parseDouble(checkAmountString);
        double partySizeDouble = Double.parseDouble(partySizeString);



        int fifteenTipInt = (int) Math.round( (checkAmountDouble * (0.15)) / partySizeDouble );
        int twentyTipInt = (int) Math.round( (checkAmountDouble * (0.20)) / partySizeDouble );
        int twentyFiveTipInt = (int) Math.round( (checkAmountDouble * (0.25)) / partySizeDouble);

        int fifteenTotalInt = (int) ((checkAmountDouble + (fifteenTipInt*partySizeDouble))/partySizeDouble);
        int twentyTotalInt = (int) ((checkAmountDouble + (twentyTipInt*partySizeDouble))/partySizeDouble);
        int twentyFiveTotalInt = (int) ((checkAmountDouble + (twentyFiveTipInt*partySizeDouble))/partySizeDouble);



        TextInputEditText fifteenTipInput = findViewById(R.id.fifteenPercentTipValue);
        TextInputEditText twentyTipInput = findViewById(R.id.twentyPercentTipValue);
        TextInputEditText twentyfiveTipInput = findViewById(R.id.twentyfivePercentTipValue);

        TextInputEditText fifteenTotalInput = findViewById(R.id.fifteenPercentTotalValue);
        TextInputEditText twentyTotalInput = findViewById(R.id.twentyPercentTotalValue);
        TextInputEditText twentyfiveTotalInput = findViewById(R.id.twentyfivePercentTotalValue);

        fifteenTipInput.setText(String.valueOf(fifteenTipInt));
        twentyTipInput.setText(String.valueOf(twentyTipInt));
        twentyfiveTipInput.setText(String.valueOf(twentyFiveTipInt));

        fifteenTotalInput.setText(String.valueOf(fifteenTotalInt));
        twentyTotalInput.setText(String.valueOf(twentyTotalInt));
        twentyfiveTotalInput.setText(String.valueOf(twentyFiveTotalInt));



    }



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
