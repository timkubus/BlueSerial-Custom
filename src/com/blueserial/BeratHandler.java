package com.blueserial;

import android.annotation.SuppressLint;

@SuppressLint("NewApi")
public class BeratHandler extends AbstractHandler {
	private String berat;
	private String satuan;
	@Override
	public String Handle(String a) {
		// TODO Auto-generated method stub
		try{String[] p=a.split(" ");
		int index = 4;
		while(p[index].isEmpty()){
			index++;
		}
		berat = p[index];
		return berat;
		}catch(Exception ex){
		return "";}
	}

	@Override
	public String getSatuan(String a) {
		// TODO Auto-generated method stub
		String[] p=a.split(" ");
		berat = p[8];
		satuan = String.valueOf(p[8].charAt(0));
		return "g";
	}

}
