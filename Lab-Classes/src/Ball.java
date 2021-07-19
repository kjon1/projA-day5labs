
public class Ball {
	String color;
	String sport;
	
	public void bounce(){
	    System.out.println("The " + color + " " + sport + " is bouncing.");
	}
	
	public void roll() {
		System.out.println("The " + color + " " + sport + " ball is rolling.");
	}
	
	
	public static void main(String[]args) {
		Ball b1 = new Ball();
		Ball b2 = new Ball();
		
		//declare initial state
		b1.color = "orange";
		b1.sport = "basketball";
		b2.color = "white";
		b2.sport = "soccer";
		
		//invoke bounce method
		b1.bounce();
		b2.roll();
		
	}

}
