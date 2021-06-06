package tree.trie;

/**
 * @autor zyj
 * @date 2021/5/24 00:51
 */
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("中国共产党");
        trie.insert("中华人民共和国");
        trie.insert("中央人民政府");
        trie.insert("中国人民银行");
        trie.insert("中国人");
        trie.insert("中国国家主席");
        trie.insert("北京天安门广场");
        trie.insert("北京银行");
        trie.insert("helloWord");
        trie.insert("hi");

        System.out.println(trie.search("中国人")); // true
        trie.remove("中国");
        System.out.println(trie.search("中国人")); // true
        trie.remove("中国人们");
        System.out.println(trie.search("中国人")); // true
        trie.remove("中国人");
        System.out.println(trie.search("中国人")); // false
    }
}
