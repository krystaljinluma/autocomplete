import java.util.ArrayList;
import java.util.List;

/**
 * Interface for Trie data structure
 *
 */
public interface Trie {

	/**
	 * Add a string read from the training file into the trie
	 * @param string to add
	 * @return 
	 */
	public void add(String s);

	/**
	 * Find the top words that start with c
	 * @param character to search for
	 * @return top 3 strings that start with c
	 */
	public ArrayList<String> search(char c);
}
