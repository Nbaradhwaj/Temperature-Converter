public class TempConv1{
    public  static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
        {
	        String Temp  = args[0];
	        int conv  = Integer.parseInt(args[1]);
	        
	        if (args[0].equals ("Cel-Kel"))
	        {
	            double answer1 =  (conv+273.15);
	            System.out.println(conv+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+answer1+" "+"Kelvin");
	            break;
	        }        
	        else if (args[0].equals ("Kel-Cel"))
	        {
	            double answer2 = conv-273.15;
	            System.out.println(conv+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+answer2+" "+"Celcius");
	            break;
	        }
	        else if (args[0].equals ("Far-Kel"))
	        {
	        	double answer3 = (conv-32)*5/9+273.15;
	        	System.out.println(conv+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+answer3+" "+"Kelvin");
	            break;
	        }
	        else if (args[0].equals ("Kel-Far"))
	        {
	        	double answer4 = (conv-273.15)*9/5+32;
	        	System.out.println(conv+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+answer4+" "+"Fahrenheit");
	            break;
	        }
	        else if (args[0].equals ("Cel-Far"))
	        {
	        	double answer5 = (conv*9/5)+32;
	        	System.out.println(conv+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+answer5+" "+"Fahrenheit");
	            break;
	        }
	        else if (args[0].equals ("Far-Cel"))
	        {
	        	double answer6 = (conv-32)*5/9;
	        	System.out.println(conv+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+answer6+" "+"Celcius");
	            break;
	        }
        }
    }
 }
