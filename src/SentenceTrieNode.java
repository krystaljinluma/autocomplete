import java.util.ArrayList;

/**
 * A node in SentenceTrie, consists of a word and its frequency.
 *
 */
public class SentenceTrieNode implements TrieNode{

	private ArrayList<SentenceTrieNode> children;
	private int frequency;
	private String word;


	/**
	 * Construct a sentence trie node with the word parameter
	 * @param word
	 */
	public SentenceTrieNode(String word) {
		children = new ArrayList<>();
		frequency = 1;
		this.word = word;
	}

	/**
	 * If the frequency is not 0 the sentence is valid
	 * @return true if valid
	 */
	@Override
	public boolean valid() {
		return true;
	}
	
	/**
	 * Get children nodes
	 * @return children nodes
	 */
	public ArrayList<SentenceTrieNode> getChildren() {
		return children;
	}

	/**
	 * Set children nodes
	 * @return children nodes
	 */
	public void setChildren(ArrayList<SentenceTrieNode> children) {
		this.children = children;
	}
	
	/**
	 * Get the frequency of the string formed on the path from this node to the root
	 * @return frequency
	 */
	public int getFrequency() {
		return frequency;
	}
	
	/**
	 * Set the frequency of the string formed on the path from this node to the root
	 * @return frequency
	 */
	public void setFrequency(int f) {
		frequency = f;
	}

	/**
	 * Get the word in this node
	 * @return the word as a string
	 */
	public String getWord() {
		return word;
	}
	
	/**
	 * Set the word in this node
	 * @return the word as a string
	 */
	public void setWord(String word) {
		this.word = word;
	}


}
