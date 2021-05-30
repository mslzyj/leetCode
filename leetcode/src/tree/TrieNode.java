package tree;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @autor zyj
 * @date 2021/5/24 22:50
 */
public class TrieNode {

        public int path;
        public int end;
        public ConcurrentHashMap<Character, TrieNode> next;

    /** Initialize your data structure here. */
    public TrieNode() {
        path = 0;
        end = 0;
        next = new ConcurrentHashMap<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
      return true;
    }

    public static void main(String[] args) {

    }
}
