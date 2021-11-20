package union_find_set;

public class QuickUnion {
    // ids[i]表示i的父下标
    private int[] ids;
    // sz[i]表示i的子元素个数
    private int[] sz;

    public QuickUnion(int n) {
        ids = new int[n];
        sz = new int[n];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
            sz[i] = 1;
        }
    }

    // 查找给定下标的根节点
    public int find(int index) {
        while (index != ids[index]) {
            index = ids[index];
        }
        return index;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    // 合并2个节点的时候将子元素少的节点指向子元素大的节点，优化查询
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (qRoot != pRoot) {
            if (sz[pRoot] < sz[qRoot]) {
                ids[pRoot] = qRoot;
                sz[qRoot] += sz[pRoot];
            } else {
                ids[qRoot] = pRoot;
                sz[pRoot] += sz[qRoot];
            }
        }
    }
}
