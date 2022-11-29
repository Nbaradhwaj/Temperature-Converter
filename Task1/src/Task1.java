import java.util.Scanner;
class Task1{
	static double CelFar(double val){
		double answer = (val*9/5)+32;
		return answer;
	}
	static double CelKel(double val){
		double answer = val+273.15;
		return answer;
	}
	static double FarCel(double val){
		double answer = (val-32)*5/9;
		return answer;
	}
	static double FarKel(double val){
		double answer = (val-32)*5/9+273.15;
		return answer;
	}
	static double KelCel(double val){
		double answer = val-273.15;
		return answer;
	}
	static double KelFar(double val){
		double answer = (val-273.15)*9/5+32;
		return answer;
	}
	
	
	public static void main (String[] args){
		String src = args[0];
		String tar = args[1];
		int val = Integer.parseInt(args[2]);
		if (src.equals("Cel") && tar.equals("Kel")){
			System.out.println(val+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+CelKel(val)+" "+"Kelvin");
		}
		else if (src.equals("Kel") && tar.equals("Cel")){
			System.out.println(val+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+KelCel(val)+" "+"Celcius");
		}
		else if (src.equals("Cel") && tar.equals("Far")){
			System.out.println(val+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+CelFar(val)+" "+"Fahrenheit");
		}
		else if (src.equals("Far") && tar.equals("Cel")){
			System.out.println(val+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+FarCel(val)+" "+"Celcius");
		}
		else if (src.equals("Far") && tar.equals("Kel")){
			System.out.println(val+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+FarKel(val)+" "+"Kelvin");
		}
		else if (src.equals("Kel") && tar.equals("Far")){
			System.out.println(val+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+KelFar(val)+" "+"Fahrenheit");
		}
	}
}
