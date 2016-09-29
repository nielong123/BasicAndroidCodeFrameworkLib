package mybasicandroidcodelib.nl.org.codelib.utils;


import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import mybasicandroidcodelib.nl.org.mybasicandroidcodelib.R;


public class ToastCommonUtil { 
	
    public static void showCommonToast(Context tx,String msg){
    	 if(tx==null||!MathUtils.isStringLegal(msg)){
    		 return;
    	 }
         View layout=LayoutInflater.from(tx).inflate(R.layout.common_toast_layout,null);
         TextView msgtv=(TextView)layout.findViewById(R.id.msg);   
         msgtv.setText(msg);       
    	 Toast toast=new Toast(tx);
         toast.setDuration(Toast.LENGTH_SHORT);
         toast.setGravity(Gravity.CENTER, 0, 0);
         toast.setView(layout);
         toast.show();
    }
}
