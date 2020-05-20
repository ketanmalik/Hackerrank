/*
 Hackerrank Problem Link - https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 
 @author ketanmalik
 May 19 2020
 * */


public class DayOfTheProgrammer {
    public static void main(String[] args) {
    	System.out.println(dayOfProgrammer(1970));
    }
	
	static String dayOfProgrammer(int year) {
        String date = "";
        if(year <= 1917){
            if(year % 4 == 0){
                date = "12.09."+(year);
            }else{
                date = "13.09."+(year);
            }
        }
        else if(year >= 1919){
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                date = "12.09."+(year);
            }else{
                date = "13.09."+(year);
            }
        }
        else if(year == 1918){
                date = "26.09."+(year);
        }else{
            return date;
        }
        return date;
    }
}
