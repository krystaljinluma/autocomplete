import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserInterface implements IUserInterface {
	
	/**
	 * Build WordTrie using the list of string (words)
	 */
	@Override
	public WordTrie buildWordTrie(List<String> list) {
		WordTrie wordTrie = new WordTrie();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String thisOne = it.next();
			wordTrie.add(thisOne);
		}
		return wordTrie;
	}

	/**
	 * Build SentenceTrie using the list of string (sentences)
	 */
	@Override
	public SentenceTrie buildSentenceTrie(List<String> list) {
		SentenceTrie sentenceTrie = new SentenceTrie();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String thisOne = it.next();
			sentenceTrie.add(thisOne);
		}
		return sentenceTrie;
	}
	
	/**
	 * Print instructions
	 */
	@Override
	public void printInstructions() {
		System.out.println("**********************************");
		System.out.println("Welcome to the autoComplete System");
		System.out.println("input a char every time");
		System.out.println("if more than one char is input");
		System.out.println("only the first one will be considered");
		System.out.println("input # when finished");
		System.out.println("**********************************");
	}
	
	/**
	 * check if a char is [a-z][A-Z][0-9] or whitespace
	 */
	public static boolean validChar(char c) {
		if(c>=48 && c<=57) return true;
		if(c>=65 && c<=90) return true;
		if(c>=97 && c<=122) return true;
		if(c == 32) return true;
		return false;
	}
	
	/**
	 * Main method for executing the program
	 * @param args
	 */
	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		List<String> list;
		FileParser FileParser = new FileParser();
		list = FileParser.readFile(args[0]);
		WordTrie wordTrie = userInterface.buildWordTrie(list);
		list = FileParser.readFile(args[1]);
		SentenceTrie sentenceTrie = userInterface.buildSentenceTrie(list);
		userInterface.printInstructions();
		String sentence = "";
		Scanner scanner = new Scanner(System.in);
		//boolean wannaPlayAgain = true;
		while(true) {
		    System.out.println("Please enter a character");
		    String inputString = scanner.nextLine();
		    //if the use inputs nothing
		    if(inputString.length()<=0) continue;
		    char inputChar = inputString.charAt(0);
		    //if the use finishes
		    if(inputChar == '#') {
		    	break;
		    }
		    //if the user input a invalid char
		    if(!validChar(inputChar)) {
		    	System.out.println("invalid input!");
		    	continue;
		    }
		    //if the input is valid
		    //change to lower case
		    if(inputChar>=65 && inputChar<=90) inputChar = (char) (inputChar + 32);
		    sentence += inputChar;
		    //if the input is whitespace, just continue;
		    if(inputChar == ' ') continue;
		    List<String> result = sentenceTrie.search(inputChar);
		    if(result.size()>=0) {
		    	System.out.println("suggestions:");
		    	for(int i = 0; i < result.size(); i++) {
		    		System.out.println(i + ": " + result.get(0));
		    	}
		    	System.out.println("choose the number of autocompletions you want to use");
		    	System.out.println("or input 9 if they are not what you want");
		    	String choice = scanner.nextLine();
		    	if(choice.charAt(0) == '0') continue;
		    	else {
		    		if(choice.charAt(0) == '0') sentence = result.get(0);
		    		else if(choice.charAt(0) == '1') sentence = result.get(1);
		    		else if(choice.charAt(0) == '2') sentence = result.get(2);
		    		else continue;
		    		break;
		    	}
		    }
		    else continue;
		}
		//spell check
//		String[] wordFromSentence = sentence.split(" ");
//		for(int i = 0; i < wordFromSentence.length; i++) {
//			
//		}
		scanner.close();
	}

}
