public class Time{
	
	public static void main (String[] args) {
		
		// Declaring and assigning variables 
		int hour;
	    hour = 14;
	    int minutes;
	    minutes = 26;
	    int second;
	    second = 21;
	    
	    // Concatenate
	    System.out.println("This is the seconds since midnight: " + (hour * 3600 + minutes * 60) + ".");
	    System.out.println("It is currently 2:26 pm" + ".");
	    
	    // Percentage
	    System.out.print("This is the percentage of the day that has passed: ");
	    System.out.println(((hour*60)+minutes)*100/1440 + "%");
	}
}
