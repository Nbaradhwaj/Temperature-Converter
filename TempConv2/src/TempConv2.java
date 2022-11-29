class TempConv2{
	public static void main (String[] args){
	String string1 = args[0];
	String string2 = args[1];
	double input = Double.parseDouble(args[2]);
	if (string1.equals("Cel") && string2.equals("Kel")){
		System.out.println(input+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+(input+273.15)+" "+"Kelvin");
	}
		else if (string1.equals("Kel") && string2.equals("Cel")){
			System.out.println(input+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+(input-273.15)+" "+"Celcius");
		}
		else if (string1.equals("Cel") && string2.equals("Far")){
			System.out.println(input+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+((input*9/5)+32)+" "+"Fahrenheit");
		}
		else if (string1.equals("Far") && string2.equals("Cel")){
			System.out.println(input+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+((input-32)*5/9)+" "+"Celcius");
		}
		else if (string1.equals("Far") && string2.equals("Kel")){
			System.out.println(input+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+((input-32)*5/9+273.15)+" "+"Kelvin");
		}
		else if (string1.equals("Kel") && string2.equals("Far")){
			System.out.println(input+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+((input-273.15)*9/5+32)+" "+"Fahrenheit");
		}
}
}

