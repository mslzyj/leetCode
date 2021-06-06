package tree.trie;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @autor zyj
 * @date 2021/5/23 23:50
 */
public class TrieNode {

    /** The number of words ending with the current node. */
    public int endCount;

    /** Current node child node. */
    public Map<Character, TrieNode> children;

    public TrieNode() {
        endCount = 0;
        children = new ConcurrentHashMap<>();
    }
}
