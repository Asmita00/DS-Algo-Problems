package com.java.top30codingtasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number is armstrong");
		
		List<String> list = new ArrayList<>();
		
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Asmita");
		map.put(7, "Avijit");
		map.put(13, "Rikta");
		map.put(18, "Utsav");
		map.put(24, "jogoddol");
		map.put(35, "Nizam");
		map.put(40, "Sanchita");

	}
	
	
		  private StringBuilder record = new StringBuilder();

		  public void append(int len, String value){
		    if (len < value.length()){
		      value = value.substring(0, len);
		    } else if (len > value.length()){
		      StringBuilder sb = new StringBuilder(value);
		      for (int i = value.length(); i < len; i++){
		        sb.append(' ');
		      }
		      value = sb.toString();
		    }
		    record.append(value);
		  }

		  @Override
		  public String toString(){
		    return record.toString();
		  }
		

}
