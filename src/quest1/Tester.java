/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest1;

/**
 *
 * @author jeka
 */
public class Tester {

    public Integer getNumFromRimString(String s) {
        int testNumber = 0;
        
        switch (s) {
            case ("I"):
                testNumber = 1;
                break;
            case ("II"):
                testNumber = 2;
                break;
            case ("III"):
                testNumber = 3;
                break;
            case ("IV"):
                testNumber = 4;
                break;
            case ("V"):
                testNumber = 5;
                break;
            case ("VI"):
                testNumber = 6;
            case ("VII"):
                testNumber = 7;
                break;
            case ("VIII"):
                testNumber = 8;
                break;
            case ("IX"):
                testNumber = 9;
                break;
            case ("X"):
                testNumber = 10;


        }
      
        return testNumber;
    }

    public boolean isRimLimit(String num) {
        boolean tes = false;
        switch (num) {
            case ("I"):
                tes = true;
                break;
            case ("II"):
                tes = true;
                break;
            case ("III"):
                tes = true;
                break;
            case ("IV"):
                tes = true;
                break;
            case ("V"):
                tes = true;
                break;
            case ("VI"):
                tes = true;
            case ("VII"):
                tes = true;
                break;
            case ("VIII"):
                tes = true;
                break;
            case ("IX"):
                tes = true;
                break;
            case ("X"):
                tes = true;
        }
        
        return tes;
    }
    
    public boolean isIntLimit(String s){
        boolean b = false;
        switch (s){
            case "1" : 
                b = true;
                break;
            case "2" :
                b = true;
                break;
            case "3" :
                b = true;
                break;
            case "4" : 
                b = true;
                break;
            case "5" :
                b = true;
                break;
            case "6" :
                b = true;
                break;
            case "7" : 
                b = true;
                break;
            case "8" :
                b = true;
                break;
            case "9" :
                b = true;
                break; 
            case "10" :
                b = true;
                break; 
         }
           return b;
    }

    public String  rimResult(int num) {
      

        String[] rimNums = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII",
            "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "IXX", "XX", "XXI", "XXII", "XXIII",
            "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XIX", "XXX", "XXXI", "XXXII",
             "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVI", "XXXVIII", "XXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
             "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI",
             "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
            "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI",
             "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV",
            "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

          return rimNums[num];
          
    }
}
