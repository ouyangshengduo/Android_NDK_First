package com.oysd.android_ndk_demo001;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button btnAdd,btnSub,btnMul,btnDiv;
	private EditText etAdd_A,etAdd_B,etSub_A,etSub_B,etAddResult,etSubResult;
	private EditText etMul_A,etMul_B,etDiv_A,etDiv_B,etMulResult,etDivResult;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //UI控件的绑定
        initView();
    }
    
    private void initView(){
    	
    	btnAdd = (Button) findViewById(R.id.btn_Add);
    	btnSub = (Button) findViewById(R.id.btn_Sub);
    	btnMul = (Button) findViewById(R.id.btn_Mul);
    	btnDiv = (Button) findViewById(R.id.btn_Div);
    	
    	etAdd_A = (EditText) findViewById(R.id.etAdd_A);
    	etAdd_B = (EditText) findViewById(R.id.etAdd_B);
    	etSub_A = (EditText) findViewById(R.id.etSub_A);
    	etSub_B = (EditText) findViewById(R.id.etSub_B);
    	
    	etMul_A = (EditText) findViewById(R.id.etMul_A);
    	etMul_B = (EditText) findViewById(R.id.etMul_B);
    	etDiv_A = (EditText) findViewById(R.id.etDiv_A);
    	etDiv_B = (EditText) findViewById(R.id.etDiv_B);
    	
    	etAddResult = (EditText) findViewById(R.id.etAddResult);
    	etSubResult = (EditText) findViewById(R.id.etSubResult);
    	
    	etMulResult = (EditText) findViewById(R.id.etMulResult);
    	etDivResult = (EditText) findViewById(R.id.etDivResult);
    	
    	btnAdd.setOnClickListener(this);
    	btnSub.setOnClickListener(this);
    	btnMul.setOnClickListener(this);
    	btnDiv.setOnClickListener(this);
    	
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btn_Add:
			if(IsRight(1)){
				int a = Integer.parseInt(etAdd_A.getText().toString().trim());
				int b = Integer.parseInt(etAdd_B.getText().toString().trim());
				
				etAddResult.setText("" + NDKInterface.Number_Add(a, b));
				
			}else{
				Toast.makeText(this, "输入非法", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.btn_Sub:
			if(IsRight(2)){
				int a = Integer.parseInt(etSub_A.getText().toString().trim());
				int b = Integer.parseInt(etSub_B.getText().toString().trim());
				
				etSubResult.setText("" + NDKInterface.Number_Sub(a, b));
			}else{
				Toast.makeText(this, "输入非法", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.btn_Mul:
			if(IsRight(3)){
				int a = Integer.parseInt(etMul_A.getText().toString().trim());
				int b = Integer.parseInt(etMul_B.getText().toString().trim());
				
				etMulResult.setText("" + NDKInterface.Number_Mul(a, b));
			}else{
				Toast.makeText(this, "输入非法", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.btn_Div:
			if(IsRight(4)){
				int a = Integer.parseInt(etDiv_A.getText().toString().trim());
				int b = Integer.parseInt(etDiv_B.getText().toString().trim());
				
				etDivResult.setText("" + NDKInterface.Number_Div(a, b));
			}else{
				Toast.makeText(this, "输入非法", Toast.LENGTH_SHORT).show();
			}
			break;
		default:
			break;
		}
	}
	
	/**
	 * 判断输入的A,B是否为空，为空
	 * @param index  控制加、减两种模式
	 * @return
	 */
	private boolean IsRight(int index){
		switch(index){
		case 1:
			String Add_A = etAdd_A.getText().toString().trim();
			String Add_B = etAdd_B.getText().toString().trim();
			if(Add_A.equals("") || Add_B.equals("")){
				return false;
			}
			break;
		case 2:
			String Sub_A = etSub_A.getText().toString().trim();
			String Sub_B = etSub_B.getText().toString().trim();
			if(Sub_A.equals("") || Sub_B.equals("")){
				return false;
			}
			break;
		case 3:
			String Mul_A = etMul_A.getText().toString().trim();
			String Mul_B = etMul_B.getText().toString().trim();
			if(Mul_A.equals("") || Mul_B.equals("")){
				return false;
			}
			break;
		case 4:
			String Div_A = etDiv_A.getText().toString().trim();
			String Div_B = etDiv_B.getText().toString().trim();
			if(Div_A.equals("") || Div_B.equals("")){
				return false;
			}
			int b = Integer.parseInt(Div_B);
			if(b == 0){
				return false;
			}
			break;
		}
		return true;
	}
	
}
