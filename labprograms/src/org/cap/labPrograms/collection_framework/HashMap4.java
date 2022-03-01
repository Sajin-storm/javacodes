package org.cap.labPrograms.collection_framework;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap4 {
//	public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
//    {
//           HashMap<String,String> medal = new HashMap<>();
//           Set<String> set = stu.keySet();
//           for(String s:set)
//           {
//                  Integer marks = stu.get(s);
//                  if(marks>=90)
//                  {
//                        medal.put(s,"Gold");
//                  }
//                  else if(marks >=80)
//                  {
//                        medal.put(s,"Silver");
//                  }
//                  else if(marks>=70)
//                  {
//                        medal.put(s,"Bronze");
//                  }
//           }
//           return medal;
//    }
    public static void main(String[] ar)
    {
//           HashMap<String,Integer> stu = new HashMap<>();
//           HashMap4 h = new HashMap4();
//           /* using hardcoded values at this point
//            * Scanner class can be used if values need
//            * to be entered  dynamically */
//           stu.put("R123",65);
//           stu.put("R125",89);
//           stu.put("R126",90);
//           stu.put("R127",93);
//           System.out.println(h.getStudent(stu));

    
    check();
    
    }

	private static void check() {
HashMap<String,Integer>a=new HashMap<>();
Scanner sc=new Scanner(System.in);
a.put("san", sc.nextInt());
a.put("sagar", sc.nextInt());
a.put("santho", sc.nextInt());
	for(Entry<String, Integer>al:a.entrySet()) {
//			if(al.getValue()>=84) {
//				System.out.println("gold");
		System.out.println(al.getKey());
		}
//			else if(al.getValue()>=40) {
//				System.out.println("bronze");
//			}
//			else {
//				System.out.println("nickle");
//			} 
//		}
 
		
	}
}
