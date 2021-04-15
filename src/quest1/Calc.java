/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jeka
 */
public class Calc {
    public void quest() throws IOException, UncorrectInputException{
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in ));
	
	Tester tester = new Tester();
        
	String tmp = reader.readLine();
	
	
	String [] del = tmp.split(" ");
	//Первичный иф
	if (tester.isRimLimit(del[0]) == true && tester.isRimLimit(del[2] ) == true ){
            int d1;
            int d2;
            int result;
          switch (del[1]){
              case "+" :
                  d1 = tester.getNumFromRimString(del[0]);
                  d2 = tester.getNumFromRimString(del[2]);
                  System.out.println(tester.rimResult(d1 + d2));
                  break;
              case "*" :
                  d1 = tester.getNumFromRimString(del[0]);
                  d2 = tester.getNumFromRimString(del[2]);
                  result = d1 * d2;
                  System.out.println(tester.rimResult(result));
                  break;
              case "/" :
                  d1 = tester.getNumFromRimString(del[0]);
                  d2 = tester.getNumFromRimString(del[2]);
                  System.out.println(tester.rimResult(d1 / d2));
                  break;
              case "-" :
                  d1 = tester.getNumFromRimString(del[0]);
                  d2 = tester.getNumFromRimString(del[2]);
                  System.out.println(tester.rimResult(d1 - d2));
                  break;
              default :
                  throw new UncorrectInputException("Неверный ввод данный : " + tmp);
              
	} 
        }
        
        else if (tester.isIntLimit(del[0]) && tester.isIntLimit(del[2])){
            int d1;
            int d2;
            
          switch (del[1]) {
              case "+" :
                  d1 = Integer.parseInt(del[0]);
                  d2 = Integer.parseInt(del[2]);
                  System.out.println(d1 + d2);
                  break;
              case "*" :
                  d1 = Integer.parseInt(del[0]);
                  d2 = Integer.parseInt(del[2]);
                  System.out.println(d1 * d2);
                  break;
              case "/" :
                  d1 = Integer.parseInt(del[0]);
                  d2 = Integer.parseInt(del[2]);
                  System.out.println(d1 / d2);
                  break;
              case "-" :
                  d1 = Integer.parseInt(del[0]);
                  d2 = Integer.parseInt(del[2]);
                  System.out.println(d1 - d2);
                  break;
              default :
                 throw new UncorrectInputException("Неверный ввод данный : " + tmp); 
              
          }  
            
        }
        
        else {
            throw new UncorrectInputException("Неверный ввод данный : " + tmp);
        }
    }
}
