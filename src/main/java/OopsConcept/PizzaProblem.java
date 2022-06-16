package OopsConcept;

import java.util.Scanner;

import org.apache.log4j.Logger;



public class PizzaProblem {

	public static final Logger LOG= Logger.getLogger(PizzaProblem.class);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOG.info("program starts here");
		calculatePrice();
		LOG.error("error was found");
		LOG.fatal("fatel");
		LOG.info("program ends here");
	}

	
	static void calculatePrice()
	{
		
		int softBase = 100;
		int tomatoPrice=0;
		int cornPrice=0;
		int mushroomsPrice=0;
		int finalPizzaPrice=0;
	    String tomatoCheck="Y";
	    String cornCheck="Y";
	    String mushroomCheck="Y";
	    
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter topping details: for tomato press Y if no needed press N");
		
		// for taking tomato price value
       if(tomatoCheck.equalsIgnoreCase(sc.nextLine()))
       {
    	   tomatoPrice=50;
   		System.out.println("For corn  press Y if no needed press N");
       }else 
       {
    	   System.out.println("For corn  press Y if no needed press N");
       }
       // for taking corn  price value
       if(cornCheck.equalsIgnoreCase(sc.nextLine()))
       {
    	   cornPrice=50;
    		System.out.println("For mushroom  press Y if no needed press N");
       }
       else
       {
    	   System.out.println("For mushroom  press Y if no needed press N");
       }
       
       // for taking mushroom  price value
       
       if(mushroomCheck.equalsIgnoreCase(sc.nextLine()))
       {
    	   mushroomsPrice=50;
       }
       else
       {
    	   sc.close();
       }
	
		//final price calculation
       
		finalPizzaPrice=softBase+tomatoPrice+cornPrice+mushroomsPrice;
		System.out.println("Price of pizza is: "+ finalPizzaPrice);
	}
}
