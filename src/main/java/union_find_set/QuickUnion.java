package union_find_set;

public class QuickUnion {
    // parent[i]表示i的父下标
    private int[] parent;
    // rank[i]表示i的层数
    private int[] rank;

    public QuickUnion(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    // 查找给定下标的根节点
    public int find(int index) {
        while (index != parent[index]) {
            index = parent[index];
        }
        return index;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并2个节点的时候将层数低的节点指向层数高的节点，优化查询
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (qRoot != pRoot) {
            if (rank[pRoot] < rank[qRoot]) {
                parent[pRoot] = qRoot;
            } else if (rank[pRoot] > rank[qRoot]){
                parent[qRoot] = pRoot;
            } else {
                parent[pRoot] = qRoot;
                rank[qRoot] += 1;
            }
        }
    }
}
