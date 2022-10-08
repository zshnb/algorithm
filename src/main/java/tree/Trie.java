package tree;

public class Trie {
    private Node root;

    public Trie() {
        root = new Node(' ');
    }

    public void addWord(String word) {
        addWord(root, word);
    }

    /**
     * 查看当前字符串第一个字符是否存在root的子节点中，如果不存在新建一个节点，否则把字符串去掉第一个字符后，root变成存在的子节点递归，直到空退出
     * */
    private void addWord(Node root, String word) {
        if (word.isEmpty()) {
            return;
        }
        char ch = word.charAt(0);
        int index = ch - 97;
        if (root.children[index] == null) {
            root.children[index] = new Node(ch);
        }
        addWord(root.children[index], word.substring(1));
    }

    /**
     * 遍历所有字符，判断字符在当前节点是否存在，如果存在继续找下一层
     * */
    public boolean exist(String word) {
        Node node = root;
        char[] chars = word.toCharArray();
        for (char ch : chars) {
            int index = ch - 97;
            if (node.children[index] != null) {
                node = node.children[index];
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean get(Node root, char ch) {
        if (root == null) {
            return false;
        }
        if (root.value == ch) {
            return true;
        }
        return get(root.children[ch - 97], ch);
    }

    public static class Node {
        char value;
        Node[] children;

        Node(char value) {
            this.value = value;
            children = new Node[26];
        }
    }
}
