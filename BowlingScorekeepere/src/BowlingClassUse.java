import java.util.Scanner;
public class BowlingClassUse {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		int totalScore =0;
		
		BowlingClass b1 = new BowlingClass();
		while(b1.round<=11) {
			int currRound = b1.round;
			int prevRound = currRound - 1;
			
			
//			FINAL ROUND CONDITIONS
			
			if((prevRound==10) && b1.doubleStrike==true) {
				System.out.println("Enter the second roll");
				int sr=s.nextInt();
				totalScore+= 20 + sr;
				System.out.println("Total score at the end of Frame " + (prevRound-1) + " :" + totalScore);
				System.out.println("Enter the third roll");
				int tr=s.nextInt();
				totalScore+=10+sr+tr;
				System.out.println("Total score at the end of Frame " + prevRound + " :" + totalScore);
				break;
				
			}
			else if((prevRound==10) && b1.strike==true) {
				System.out.println("Enter the second roll");
				int sr=s.nextInt();
				System.out.println("Enter the third roll");
				int tr=s.nextInt();
				totalScore+=10+sr+tr;
				System.out.println("Total score at the end of Frame " + prevRound + " :" + totalScore);
				break;
			}
			
			else if ((prevRound==10) && b1.spare==true) {
				System.out.println("Enter the third roll");
				int tr=s.nextInt();
				totalScore+=10+tr;
				System.out.println("Total score at the end of Frame " + prevRound + " :" + totalScore);
				break;
			}
			else if ((prevRound==10)) {
				break;
			}
			
			System.out.println("Frame " + b1.round + " :");

		//			DOUBLE STRIKE
			
			if(b1.doubleStrike == true) {
				b1.strike=false;
				b1.setFirstRoll();
				totalScore+= 20 + b1.getFirstRoll();
				System.out.println("Total score at the end of Frame " + (prevRound-1) + " :" + totalScore);
				if(b1.getFirstRoll() == 10) {
					System.out.println("HOLY SHIT !! Its AGAIN a Double Strike  !!");
					b1.round++;
					continue;
				}
				if(b1.getFirstRoll() < 10) {
					b1.doubleStrike=false;
					b1.strike=false;
					b1.setSecondRoll();
					totalScore+=10+b1.getFirstRoll()+b1.getSecondRoll();
					System.out.println("Total score at the end of Frame " + prevRound + " :" + totalScore);
					
					if((b1.getFirstRoll()+b1.getSecondRoll())<10) {
						totalScore+=b1.getFirstRoll()+b1.getSecondRoll();
						System.out.println("Total score at the end of Frame " + currRound + " :" + totalScore);
						b1.round++;
						continue;

					}
					else if((b1.getFirstRoll()+b1.getSecondRoll())==10) {
						System.out.println("Super !! It's a Spare.");
						b1.spare = true;
						b1.round++;
						continue;
						
					}
			}
		}
			
	//			STRIKE
			
			if(b1.strike == true) {
				b1.setFirstRoll();
				if(b1.getFirstRoll() == 10) {
					System.out.println("Magnificent !! Its a Double Strike  !!");
					b1.doubleStrike = true;
					b1.round++;
					continue;
				}
				else if(b1.getFirstRoll()<10) {
					b1.strike = false;
					b1.setSecondRoll();
					totalScore+= 10 + b1.getFirstRoll() + b1.getSecondRoll();
					System.out.println("Total score at the end of Frame " + prevRound + " :" + totalScore);
					
					if((b1.getFirstRoll()+b1.getSecondRoll())==10) {
						System.out.println("Super !! It's a Spare.");
						b1.spare = true;
						b1.round++;
						continue;
						
					}
					
					else if((b1.getFirstRoll()+b1.getSecondRoll())<10) {
						totalScore+=b1.getFirstRoll()+ b1.getSecondRoll();
						System.out.println("Total score at the end of Frame " + currRound + " :"+ totalScore);
						b1.round++;
						continue;
					}
					
				}
			}

//			NORMAL FIRST ROLL
			
			b1.setFirstRoll();
	
			
//			SPARE
			
			if( b1.spare == true) {
				b1.spare = false;
				totalScore+= 10 + b1.getFirstRoll();
				System.out.println("Total score at the end of Frame " + prevRound + " :" + totalScore);
			}
			
			
			
//			NORMAL CONDTION CHECK FOR SECOND ROLL
			
			if(b1.getFirstRoll() < 10) {
				b1.setSecondRoll();
				
				if((b1.getSecondRoll() + b1.getFirstRoll()) < 10) {
				totalScore+=b1.getFirstRoll() + b1.getSecondRoll();
				System.out.println("Total score at the end of Frame " + currRound + " :" + totalScore);
				b1.round++;
				continue;
				}
				
//				CONDITION CHECK FOR SPARE
				
				else if((b1.getSecondRoll() + b1.getFirstRoll())==10){
					System.out.println("Super !! It's a Spare.");
					b1.spare = true;
					b1.round++;
					continue;
				}
			
			}
			
//			CONDITION CHECK FOR STRIKE
			
			else if(b1.getFirstRoll()==10) {
				System.out.println("Sensational !! It's a Strike !!.");
				b1.strike = true;
				b1.round++;
				continue;
			}
			
//			END OF WHILE
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("======================================");
		if(totalScore<300) {
		System.out.println("END OF GAME: YOUR SCORE WAS : "+ totalScore);
		}
		else if(totalScore==300) {
			System.out.println("IT WAS A PERFECT GAME. YOU SCORED : 300");
		}
		System.out.println("======================================");
	}	
}
