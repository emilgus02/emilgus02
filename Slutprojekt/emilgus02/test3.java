package emilgus02;
		import java.util.Scanner;

		public class test3 {
			
			public static void main(String[] args) {

				Scanner scan = new Scanner(System.in );
				String secretword = "Nackademin".toUpperCase();
				String triedChar = "Gissat p�: ";
				String secretword_changed = secretword.toLowerCase().replaceAll(".", "_");

				welcomeWords();
		    System.out.print("Secret word: ");
				System.out.println(secretword_changed.replaceAll(".(?!$)", "$0 "));
				int guess = 0;
				int gessCount = 5;
				String guessedChar = "";

				while (guess < gessCount) {

					//kontrollera om man van, Sedan stanna spel
					if (!secretword_changed.contains("_")) {
						winnerWords();
						break;
					}

		      System.out.println(" ");
					System.out.println("Gissa en bokstav !");
		      //Bara ett bokstav och f�r inte vara ett tal.
					guessedChar = scan.next().trim().toUpperCase();

		      if(checkingChar(guessedChar)){
						if (secretword.contains(guessedChar)) {
							//Iterera �ver secretword och markera d�r bokstaven finns
							for (int i = 0; i < secretword.length(); i++) {
								String secretword_char = Character.toString(secretword.charAt(i));
								if (secretword_char.equals(guessedChar)) {
									// convert to chararray
									char c = guessedChar.charAt(0);
									char[] secretword_blank_chars = secretword_changed.toCharArray();
									secretword_blank_chars[i] = c;
									secretword_changed = String.valueOf(secretword_blank_chars) + " ";
								}
							}
						} else {
							//l�gg till i guessedChars om det �r fel bokstav och r�kna upp (+1) antal gissningar
							System.out.println("Sorry! Du gissade FEL BOKSTAV, f�rs�k igen..");
							System.out.println(" ");
							triedChar = triedChar + guessedChar + " ";
							guess = guess + 1;
						}
		      }
						int guessesleft = (gessCount - guess);
		        System.out.println("************************************");
						System.out.println(" ");
						System.out.print("Secret word: ");
						System.out.println(secretword_changed.replaceAll(".(?!$)", "$0 "));
		        System.out.println(" ");
						System.out.println("Gissningar kvar:" + guessesleft);
		        System.out.println(" ");
						System.out.println(triedChar);

		        //kontrollera om du har f�rlorat
		    		if (guess >= gessCount) {
		    			hangdGubbeGrafik();
		    		}
					}
				}


		    public static boolean checkingChar(String letter){
		      if (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
		        System.out.println("** ERROR: Endast en bokstav och Inga siffror! **");
						System.out.println(" ");
		        return false;
		      }
		        return true;
		    }


		    public static void welcomeWords(){
		      System.out.println(" ");
		      System.out.println("************************************");
		      System.out.println("************************************");
		      System.out.println("********* H�NGA GUBBE SPEL *********");
		      System.out.println("************************************");
		      System.out.println("************************************");
		      System.out.println(" ");
		    }


		    public static void hangdGubbeGrafik(){
		      System.out.println(" ");
		      System.out.println("************************************");
		      System.out.println("************************************");
		      System.out.println("***** GAME OVER - YOU LOOSE!!! *****");
		      System.out.println("*********** H�NGDE GUBBE ***********");
		      System.out.println("************************************");
		      System.out.println("************************************");
		      System.out.println(" ");
		      System.out.println("   ----------");
		      System.out.println("   |        |");
		      System.out.println("   |        0");
		      System.out.println("   |      --x--");
		      System.out.println(" __|_      / |");
		      System.out.println(" |   |");
		    }

		    public static void winnerWords(){
		        System.out.println(" ");
		        System.out.println("************************************");
		        System.out.println("****** GRATTIS! DU LYCKADES ********");
		        System.out.println("************************************");
		        System.out.println("************************************");
		        System.out.println(" ");
		      }

			}