package union_find_set;

public class QuickFind {
    // 数组值表示所在组，相同组为联通
    private int[] ids;

    public QuickFind(int n) {
        ids = new int[n];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
    }

    public int find(int e) {
        return ids[e];
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == qId) {
                ids[i] = pId;
            }
        }
    }
}
