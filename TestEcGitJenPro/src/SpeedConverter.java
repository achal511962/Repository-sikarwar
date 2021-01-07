
public class SpeedConverter {
	
    public static long toMilePerhour(long kiloMeterPerHour ) {
    	
    	if(kiloMeterPerHour < 0 ) {
    		return -1;
    	}    	
    	return  Math.round(kiloMeterPerHour/1.609);	
    // return MilesPerHour;
    }
    
    public static void printConversion(double kiloMeterPerHour) {
    	if(kiloMeterPerHour < 0 ) {
    		System.out.println("Invalid value.");
    	}    	
        else {
    	     long milesPerHour = toMilePerhour(kiloMeterPerHour);
    	     System.out.println(kiloMeterPerHour + " Km/H" 
    	    		 			  + milesPerHour + " Miles/H");
        	}
  }
}