package tree.trie;

/**
 * @autor zyj
 * @date 2021/5/23 23:51
 */
public class Trie {

    private TrieNode root;

    /** Initialize the root node. */
    public Trie(){
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(isBlank(word)){
            return;
        }
        TrieNode node = root;
        char [] charArr = word.toCharArray();
        for (char ch : charArr) {
            if(!node.children.containsKey(ch)) {
                node.children.put(ch,new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.endCount++;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(isBlank(word)){
            return false;
        }
        TrieNode node = root;
        char [] charArr = word.toCharArray();
        for (char ch : charArr) {
            if(!node.children.containsKey(ch)){
                return false;
            }
            node = node.children.get(ch);
        }
        if(node.endCount == 0) {
            return false;
        }
        return true;
    }

    /** Delete a word from the trie tree. */
    public synchronized void remove(String word){
        if(isBlank(word)){
            return;
        }
        TrieNode node = root;
        char [] charArr = word.toCharArray();
        for (char ch : charArr) {
            if(node.children.containsKey(ch) && ch == charArr[charArr.length - 1] &&  node.children.get(ch).endCount > 0){
                node.children.get(ch).endCount--;
                break;
            }
            node = node.children.get(ch);
        }
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(isBlank(prefix)){
            return false;
        }
        TrieNode node = root;
        char [] charArr = prefix.toCharArray();
        for (char ch : charArr) {
            if(!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }

        return true;
    }

    private boolean isBlank(String word){
        if(null == word || "".equals(word)) {
            return true;
        }
        return false;
    }
}
