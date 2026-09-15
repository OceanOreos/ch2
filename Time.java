public class Time{
	
	public static void main (String[] args) {
		
		// Declaring and assigning variables 
		int hour = 14;
	    int minutes = 41;
	    int second = 12;
	    
	    // Concatenate
	    System.out.println("It is currently 2:22 pm" + ".");
	    System.out.println("This is the seconds since midnight: " + (hour * 3600 + minutes * 60) + ".");
	    
	    // Percentage
	    System.out.print("This is the percentage of the day that has passed: ");
	    System.out.println(((hour*60)+minutes)*100/1440 + "%");
	    
	    // New 
	    minutes = 28;
	    second = 60;
	    
	    // Q6
	    System.out.println("It is currently 2:50 pm" + ".");
	    System.out.print("Elapsed Time: " + (minutes*second) + " " + "seconds");
	    
	}
}
