import java.util.ArrayList;
import java.util.List;
/**
 * Trie data structure to store sentences, each node is a SentenceTrieNode.
 *
 */
public class SentenceTrie implements Trie{

	private SentenceTrieNode root;
	private SentenceTrieNode currentRoot;
	private String currentPrefix;
	
	public SentenceTrie() {
		root = null;
		currentRoot = null;
		currentPrefix = "";
	}

	/**
	 * Add a sentence read from the training file into the trie
	 * @param string to add
	 */
	@Override
	public void add(String s) {
		
	}

	/**
	 * Find the top sentences that start with the top words that start with c found in WordTrie
	 * @param character to search in WordTrie
	 * @return top 3 sentences
	 */
	@Override
	public ArrayList<String> search(char c) {
		return null;
	}
	
	/**
	 * Get root of the trie
	 * @return root
	 */
	public SentenceTrieNode getRoot() {
		return root;
	}

	/**
	 * Get current root
	 * @return node as current root in the search
	 */
	public SentenceTrieNode getCurrentRoot() {
		return currentRoot;
	}

	/**
	 * Get current prefix
	 * @return Prefix string in the search
	 */
	public String getCurrentPrefix() {
		return currentPrefix;
	}


}
