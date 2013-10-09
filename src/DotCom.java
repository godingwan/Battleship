import java.util.*;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()){
				result = "kill";
				System.out.println("Ouch! You sunk " + name + " : ( ");
			} else{
				result = "hit";
			}
		}
		
		return result;

	}
	
	/*public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		DotCom theDotCom = new DotCom();
		int randomNum = (int) (Math.random() * 5);
		
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while (isAlive == true){
			String guess = helper.getUserInput("enter a number ");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}*/
}
