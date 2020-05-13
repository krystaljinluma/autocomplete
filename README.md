# Autocomplete System

Our group implemented a simple autocomplete system. The system makes 5 autocomplete suggestions based on a string that the user types in. The user may type in either a few letters, or a word, or several words separated by a white space. The 5 suggestions, which are phrases or sentences, will be selected based on the frequency that they are used in our training file. The user may continue entering up to 7 words, or end the program.

## Our design approach

The data structure we chose is a Trie, which is a tree-like data structure: we will store one letter of a word in each wordTrieNode, and one word of a sentence in each sentenceTrieNode. By structuring the nodes in a particular way, words and strings can be retrieved from the structure by traversing down a branch path of the tree. The way we implement the autocomplete system using TrieNode and Trie interfaces represents a composite design pattern due to the fact that we treat word Trie and sentence Trie in a similar way since they both implements the Trie interface, thus having similar operations. 

We will use 4 interfaces to help us maintain a clean and structured design: 
●	2 interfaces responsible for the operations of our data structure
○	Trie Node: trie nodes are the units that consist of the Trie data structure
○	Trie: a tree data structure
●	2 interface responsible for the actions that our program will perform
○	FileParser: used for parsing training files to create the initial Tries
○	IUserInterface: includes the actions to populate Trie and the main method

Besides the 3 interfaces, we will have 4 concrete classes that implement the Trie Node and Trie interfaces (word and sentence respectively), and 1 more concrete class to implement the actions of our program.

## Ensuring a smooth implementation in the future

With our design document listing out the clear steps of how the program works, reasoning for our design pattern and data structure choice, as well as a detailed class diagram, we have set up the cornerstone for us to implement the system in the future.
