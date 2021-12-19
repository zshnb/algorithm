import java.util.ArrayList;
import java.util.List;

public class SkipList {
	private List<Node> levels;
	private int level;
	private List<Integer> levelElementSize;
	private int size;

	public SkipList() {
		levels = new ArrayList<>();
		levelElementSize = new ArrayList<>();
		level = 0;
	}

	public int find(int target) {
		Node node = levels.get(level);
		while (node != null) {
			if (node.val == target) return target;
			if (node.val < target) {
				node = node.next;
			} else {
				node = node.down;
			}
		}
		return -1;
	}

	public void add(int val) {
		int levelSize = size == 0 ? 1 : size / 1000;
		if (levelSize == 0) {
			levelSize = 1;
		}
		while (levels.size() < levelSize) {
			levels.add(new Node(-1, null));
		}
		Node levelHead;
		Node above = null;
		boolean top = true;
		while (levelSize != 0) {
			levelHead = levels.get(levelSize - 1);
			if (levelSize < levels.size()) {
				top = false;
			}
			Node node = levelHead;
			Node prev = node;
			while (node != null && node.val < val) {
				prev = node;
				node = node.next;
			}
			prev.next = new Node(val, node);
			if (!top) {
				above.down = prev.next;
			}
			above = prev.next;
			levelSize -= 1;
		}
		size += 1;
	}

	public void print() {
		int levelNum = levels.size() - 1;
		while (levelNum >= 0) {
			Node head = levels.get(levelNum);
			while (head != null) {
				if (head.val != -1) {
					System.out.printf("%d->", head.val);
				}
				head = head.next;
			}
			System.out.println();
			levelNum -= 1;
		}
	}

	public void remove(int target) {
		int levelNum = levels.size() - 1;
		Node pendingRemove = null;
		Node head = levels.get(levelNum);
		while (pendingRemove == null) {
			if (head == null) {
				levelNum -= 1;
				head = levels.get(levelNum);
			}
			if (head.val == target) {
				pendingRemove = head;
			}
			head = head.next;
		}
		Node down = pendingRemove.down;
		if (pendingRemove.next == null) {
			pendingRemove = null;
			while (down != null) {
				down = down.down;
				pendingRemove = down;
				pendingRemove = null;
			}
		} else {
			pendingRemove.val = pendingRemove.next.val;
			pendingRemove.next = pendingRemove.next.next;
			while (down != null) {
				pendingRemove = down;
				down = down.down;
				pendingRemove.val = pendingRemove.next.val;
				pendingRemove.next = pendingRemove.next.next;
			}
		}
	}

	private static class Node {
		int val;
		Node next;
		Node down;

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

		public void setDown(Node down) {
			this.down = down;
		}
	}
}
