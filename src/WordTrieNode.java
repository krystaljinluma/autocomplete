/**
 * A node in WordTrie, consists of a character and its frequency.
 *
 */
public class WordTrieNode implements TrieNode{
	
	private WordTrieNode[] children;	
	private int frequency;
	private char c;
	
	/**
	 * Create a trie node with character c
	 * @param character c
	 */
	public WordTrieNode(char c) {
		children = new WordTrieNode[26];
		frequency = 0;
		this.c = c;
	}	
	
	/**
	 * Add 1 to frequency
	 */
	public void addFreq() {
		frequency++;
	}

	/**
	 * If frequency is not 0 it is valid
	 * @return true if valid
	 */
	@Override
	public boolean valid() {
		return frequency != 0;
	}
	
	/**
	 * Get children nodes
	 * @return children nodes
	 */
	public WordTrieNode[] getChildren() {
		return children;
	}
	
	/**
	 * Set children nodes
	 * @param childNodes
	 */
	public void setChildren(WordTrieNode[] children) {
		this.children = children;
	}
	
	/**
	 * Get frequency of this char
	 * @return frequency
	 */
	public int getFreq() {
		return frequency;
	}
	
	/**
	 * Get character
	 * @return character
	 */
	public char getC() {
		return c;
	}
	
	/**
	 * Set character
	 * @param character
	 */
	public void setC(char c) {
		this.c = c;
	}

}
