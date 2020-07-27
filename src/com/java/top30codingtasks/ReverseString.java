package com.java.top30codingtasks;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class ReverseString {

	public static void main(String[] args) {

        

        String ss = "po_returnInfo=NON_CONSOLIDATE_CONTROL_SP: SUCCESS TOTAL=10000 GRP=100000 IND=0 SKIP=09000, po_returnCode=00000";

        String[] sarr = ss.split(":");

        Map<String,String> map = new HashMap<String,String>();

        for(String s:sarr) {

               if(s.contains("SUCCESS")) {

                     for(String sm:s.split(",")) {

                            if(sm.contains("SUCCESS")) {

                                  for(String sp:sm.replaceAll(" SUCCESS ", "").split(" ")) {

                                         String eq[] = sp.split("=");

                                         map.put(eq[0], eq[1]);

                                  }

                            }

                     }

               }

        }

        System.out.println(map);



  }



}
