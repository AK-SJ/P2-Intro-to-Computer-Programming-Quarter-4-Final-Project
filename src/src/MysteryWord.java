
public class MysteryWord {

	/** Should utilize the imported online dictionary and generate a word as "mystery word". Should display word in the box indicated
	 * Maybe use spell checker. If the word is spelled as it should be and correctly, then that is a word and one point is awarded.
	 * However, if a word is not able to be matched, even at a stretch, then it is assumed to be a fake word. **/
	
	private String mysteryWord;
	private String guess;
	
	
	public MysteryWord() {
		
		mysteryWord = "hello";
		
	}
	
	public String getWord () {
		return "";
	}
	
	public void assignWord () {
		
	}
	
	public boolean compareWord () {
		
		if(guess == mysteryWord) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/** TO BE COMPLETED **/
	
}
