package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 思路1：返回所有入度为0的节点
 * */
public class MinimumNumberVerticesReachAllNodes1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Map<Integer, List<Integer>> vertexWithConnectVertex = new HashMap<>();
        for (List<Integer> edge : edges) {
            int from = edge.get(0);
            int to = edge.get(1);
            List<Integer> connectVertex = vertexWithConnectVertex.getOrDefault(to, new ArrayList<>());
            connectVertex.add(from);
            vertexWithConnectVertex.put(to, connectVertex);
        }

        List<Integer> noConnectVertex = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!vertexWithConnectVertex.containsKey(i)) {
                noConnectVertex.add(i);
            }
        }
        return noConnectVertex;
    }
}
