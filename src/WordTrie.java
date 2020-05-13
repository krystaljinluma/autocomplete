import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Trie data structure to store words, each node is a WordTrieNode.
 *
 */
public class WordTrie implements Trie {

	class Pair {
        private String s;
        private int c;
        public Pair(String s, int c) {
            this.s = s; 
            this.c = c;
        }
    }
	
	private WordTrieNode root;	
	private WordTrieNode curr;
	private String currentRoot;
	private String prefix = "";	
	private HashMap<String, Integer> counts = new HashMap<String, Integer>();


	public WordTrie() {
		root = null;		
	}
	
	/**
	 * Add a string read from the training file into the WordTrie
	 * @param string to add
	 * @return 
	 */
	@Override
	public void add(String s) {
		WordTrieNode curr = root;
        for (char c : s.toCharArray()) {
        	WordTrieNode next = curr.getChildren()[c - 'a'];
            if (next == null) {
            	next = new WordTrieNode(c);
                curr.getChildren()[c - 'a'] = next;
            }
            curr = next;
            counts.put(s, counts.getOrDefault(s, 0) + 1);
        }
        curr.addFreq();
	}

	/**
	 * Find the top words that start with c
	 * @param character to search for
	 * @return top 5 strings that start with c
	 */
	@Override
	public ArrayList<String> search(char c) {
		
        this.prefix = this.prefix + c;
        WordTrieNode curr = root;
        for (char cc : prefix.toCharArray()) {
        	
        	WordTrieNode next = curr.getChildren()[cc -'a'];
            if (next == null) {
                return new ArrayList<String>();
            }
            
            curr = next;
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (a.c == b.c ? a.s.compareTo(b.s) : b.c - a.c));
        for (String s : counts.keySet()) {
            pq.add(new Pair(s, counts.get(s)));
        }
        //System.out.println(prefix);
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < 5 && !pq.isEmpty(); i++) {
        	String ss = pq.poll().s;
        	System.out.println(ss);
            res.add(ss);
            
        }
        return res;

	}

	/**
	 * Get the root of the WordTrie
	 * @return root
	 */
	public WordTrieNode getRoot() {
		return root;
	}

}
