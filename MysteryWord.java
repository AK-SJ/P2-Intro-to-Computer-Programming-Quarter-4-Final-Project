public class MysteryWord {

	/** Should access an online dictionary and generate a word as "mystery word". Should display word in the box indicated**/
	
	// Necessary Instance Variables:
	
	private String mysteryWord;
	
	// Constructors:
	
	public MysteryWord(String wordGenerated) {
		
		String[] MysteryWords= {"capacity","cavity","initiation","mystery","starter","create","creator","visual","letter"};
		mysteryWord = wordGenerated;
		
	}
	
	// Methods:
	
	public String getWord () {
		int x = (int)Math.floor(Math.random()*(MysteryWords(0)-MysteryWords(MysteryWords-1)+1+MysteryWords(0));
		return MysteryWords(x);
	}
	
	public void assignWord () {
		
	}
	
	/** TO BE COMPLETED **/
	
}
