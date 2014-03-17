package ch.theowinter.An1I.series1;

import ch.theowinter.An1I.utilities.LogicEngine;

public class Problem1 {
	static LogicEngine logic = new LogicEngine();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(gA(3));
		logic.print(gC(5)+"");
		logic.print(gC(-2)+"");
		
		logic.findDomain();

	}
	
	//Ex C
	public static int gC(int x){
		int returnValue = 0;
		if(x<0){
			returnValue=1-x;		
		}
		else{
			returnValue=x-1;
		}
		return returnValue;
	}
	
	//Ex A
	public static int gA(int i) {
		return i%2;
	}
}
