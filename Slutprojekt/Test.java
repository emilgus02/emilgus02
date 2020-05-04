import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	 static Scanner scanner = new Scanner(System.in);
	 final static char[] hemligtord = "bajs".toCharArray();
	 static int antalgissningar = 10;
	 static char[] visatord;
	 static String anv = "";


	public static void main(String[] args) {

		 
		 visatord = new char[hemligtord.length];
		  Arrays.fill(visatord,'_');
		  System.out.println(String.copyValueOf(visatord));
		  
		  while (antalgissningar > 0)
		  {
		   if ( String.copyValueOf(visatord).contains("_") )
		   {
		    if ( testInput(getInput()) )
		     {
		      antalgissningar--;
		     }
		   }
		   else {
		    System.out.println("Du vann!");
		    System.exit(0);
		   }
		   System.out.println("Återstående gisningar: " + antalgissningar);
		  }
		  System.out.println("Antal gissningar är slut! Du förlorade!");
		 }
		 
		 public static boolean testInput(Character bokstav)
		 {
		  boolean ok=true;
		  for(int i=0; i<hemligtord.length; i++)
		  {
		   if ( hemligtord[i] == bokstav.charValue() )
		   {
		    System.out.println("Bokstaven " + bokstav + " fanns i det hemliga ordet.");
		    visatord[i] = hemligtord[i];
		    ok=false;
		   }
		  }
		  System.out.println(String.copyValueOf(visatord).toUpperCase());
		  return ok;
		 }
		 
		 public static Character getInput()
		 {
		  String inp="";
		  Character bokstav=' ';
		  boolean ok = false;
		  System.out.println("Använda bokstäver: " + anv.toUpperCase());
		  while (!ok)
		  {
		   while (inp.isEmpty()){
		    System.out.print("> ");
		    inp=scanner.nextLine();
		   }
		   inp=inp.toLowerCase();
		   ok=true;
		   bokstav=inp.charAt(0);
		   if ( !Character.isLetter(bokstav) ) {
		    System.out.println("Ej en bokstav!");
		    inp=""; ok=false;
		   }
		   if (inp.length()>1) {
		    System.out.println("Endast en bokstav tack!");
		    inp=""; ok=false;
		   }
		   if (anv.contains(bokstav.toString())) {
		    System.out.println("Bokstaven har redan använts.");
		    inp=""; ok=false;
		   }
		   if (inp.equals("q")) System.exit(0);
		  }
		  if (!anv.contains(bokstav.toString())) anv += bokstav.toString().toLowerCase();
		  return bokstav;
		 }}