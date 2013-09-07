package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	  
	  EditText etNum1;

	  Button btnAdd;
	  Button btnSubtract;
	  Button btnMultiply;
	  Button btnDivide;
	  Button btnOne;
	  Button btnTwo;
	  Button btnThree;
	  Button btnFour;
	  Button btnFive;
	  Button btnSix;
	  Button btnSeven;
	  Button btnEight;
	  Button btnNine;
	  Button btnPeriod;
	  Button btnEquals;

	  TextView tvResult;

	  String oper = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// find the elements
	    etNum1 = (EditText) findViewById(R.id.etNum1);

	    btnAdd = (Button) findViewById(R.id.btnAdd);
	    btnSubtract = (Button) findViewById(R.id.btnSubtract);
	    btnMultiply = (Button) findViewById(R.id.btnMultiply);
	    btnDivide = (Button) findViewById(R.id.btnDivide);
	    btnOne = (Button) findViewById(R.id.btnOne);
	    btnTwo = (Button) findViewById(R.id.btnTwo);
	    btnThree = (Button) findViewById(R.id.btnThree);
	    btnFour = (Button) findViewById(R.id.btnFour);
	    btnFive = (Button) findViewById(R.id.btnFive);
	    btnSix = (Button) findViewById(R.id.btnSix);
	    btnSeven = (Button) findViewById(R.id.btnSeven);
	    btnEight = (Button) findViewById(R.id.btnEight);
	    btnNine = (Button) findViewById(R.id.btnNine);
	    btnPeriod = (Button) findViewById(R.id.btnPeriod);
	    btnEquals = (Button) findViewById(R.id.btnEquals);
	    

	    tvResult = (TextView) findViewById(R.id.tvResult);

	    // set a listener
	    btnAdd.setOnClickListener(this);
	    btnSubtract.setOnClickListener(this);
	    btnMultiply.setOnClickListener(this);
	    btnDivide.setOnClickListener(this);
	    btnOne.setOnClickListener(this);
	    btnTwo.setOnClickListener(this);
	    btnThree.setOnClickListener(this);
	    btnFour.setOnClickListener(this);
	    btnFive.setOnClickListener(this);
	    btnSix.setOnClickListener(this);
	    btnSeven.setOnClickListener(this);
	    btnEight.setOnClickListener(this);
	    btnNine.setOnClickListener(this);
	    btnPeriod.setOnClickListener(this);
	    btnEquals.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	    float num1 = 0;
	    float num2 = 0;
	    float result = 0;

	    // check if the fields are empty
	    if (TextUtils.isEmpty(etNum1.getText().toString())) {
	      return;
	    }

	    // read EditText and fill variables with numbers
	    num1 = Float.parseFloat(etNum1.getText().toString());
	    num2 = 10;

	    // defines the button that has been clicked and performs the corresponding operation
	    // write operation into oper, we will use it later for output
	    switch (v.getId()) {
	    case R.id.btnAdd:
	      oper = "+";
	      result = num1 + num2;
	      break;
	    case R.id.btnSubtract:
	      oper = "-";
	      result = num1 - num2;
	      break;
	    case R.id.btnMultiply:
	      oper = "*";
	      result = num1 * num2;
	      break;
	    case R.id.btnDivide:
	      oper = "/";
	      result = num1 / num2;
	      break;
	    default:
	      break;
	    }

	    // form the output line
	    tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
		
	}

}
