package Constructs;

public class AllTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//task 1  caughtSpeeding
	
	/*{
		public int caughtSpeeding(int speed, boolean isBirthday) {
			  
			  //Tested my madhawesh rai
			  
			  int birthdayCounter=0;
			  if(isBirthday==true)
			  {
			    birthdayCounter =5;
			    
			  }
			  
			  if (speed < 61+ birthdayCounter){
			  return 0;
			    
			  }
			  if(speed<81 + birthdayCounter){
			  return 1;
			    
			  }
			  
			  
			  return 2;
			  

			}*/
	
	//task 2-  love6 problem

	/*
	 * public boolean love6(int a, int b) {
	 * 
	 * int sum= a+b; int diff= Math.abs(a-b);
	 * 
	 * if(a==6 || b==6) { return true; } else if(sum==6 || diff==6) { return true; }
	 * else return false;
	 * 
	 * }
	 */
	
	//task3- tea party
	
	/*
	 * public int teaParty(int tea, int candy) { if(tea<5 || candy<5) { return 0; }
	 * else if(tea >= candy*2 || candy >= tea*2) { return 2; } else if(tea >=5 ||
	 * candy>=5) { return 1; } else { return tea; } }
	 */

	
	
	//task 4- Blue ticket
	
	/*
	 * public int blueTicket(int a, int b, int c) { if((a+b)==10 || (b+c)==10 ||
	 * (a+c)==10 ) { return 10;
	 * 
	 * } else if((a+b)==(b+c)+10 || (a+b)==(a+c)+10 ) {
	 * 
	 * return 5; } else { return 0; } }
	 */
	
	
//task 5- inorder
	
	/*
	 * public boolean inOrder(int a, int b, int c, boolean bOk) {
	 * 
	 * if(bOk==false) { if(b>a && c>b) { return true; } else{ return false;} } else
	 * { if(c>b) { return true; } else{ return false;}
	 * 
	 * } }
	 */
	
	
	// task 6- share digit
	
	/*
	 * public boolean shareDigit(int a, int b) { int div= a/b; int mod= a%b;
	 * 
	 * if((a/10==b/10) || (a%10==b%10) ||(a/10==b%10) || (a%10==b/10)) { return
	 * true; } else { return false; } }
	 */
	
	
	//task 7- sumlimit
	
	/*
	 * public int sumLimit(int a, int b) {
	 * 
	 * String sumLength= String.valueOf(a+b); String aLength= String.valueOf(a);
	 * 
	 * if(sumLength.length()== aLength.length()) { return a+b;
	 * 
	 * } else { return a;
	 * 
	 * } }
	 */

	
	//task 8- without string
	
	/*
	 * public String withoutString(String base, String remove) {
	 * 
	 * String basen= base.toLowerCase(); String removen=remove.toLowerCase();
	 * if(basen.contains(remove)) {
	 * 
	 * return base.replace(removen,""); }
	 * 
	 * else { return base; }
	 * 
	 * 
	 * }
	 */
	
	//task 9- maxblock
	
	/*
	 * public int maxBlock(String str) {
	 * 
	 * int count=0; int currentCount=1;
	 * 
	 * if(str.length()==0) {
	 * 
	 * return 0; }
	 * 
	 * 
	 * for(int i=0;i<=str.length();i++)
	 * 
	 * {
	 * 
	 * if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
	 * 
	 * currentCount++; else currentCount=1; if(currentCount>count)
	 * count=currentCount;
	 * 
	 * }
	 * 
	 * return count;
	 * 
	 * }
	 */
	

	//task 10-sumNumbers
	
	/*
	 * public int sumNumbers(String str) {
	 * 
	 * int sum=0; String temp="";
	 * 
	 * for(int i=0;i<str.length()-1;i++) {
	 * 
	 * if(Character.isDigit(str.charAt(i))) { if(Character.isDigit(str.charAt(i+1)))
	 * { temp += str.charAt(i);
	 * 
	 * } else { temp += str.charAt(i); sum +=Integer.parseInt(temp); temp=""; } } }
	 * return sum;
	 * 
	 * }
	 */

	
	

}
