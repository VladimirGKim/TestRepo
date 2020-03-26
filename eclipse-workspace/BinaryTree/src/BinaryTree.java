
public class BinaryTree {

	BinaryTreeNode top;

	public BinaryTree() {
		top = null;
	}

	/*
	 * BEGINN des zu implementierenden Bereichs
	 */

	// Aufgabe 1
	public void insert(int number) {

		if(this.top == null) top = new BinaryTreeNode(number);
		else {
				insert(top, number);
		}
	}
	public void insert(BinaryTreeNode node, int number) {
		if(node.getNumber() > number) {
			if(node.getSmaller() == null) node.setSmaller(new BinaryTreeNode(number));
			else insert(node.getSmaller(), number);
		} else if(node.getNumber() < number) {
			if(node.getLarger() == null) node.setLarger(new BinaryTreeNode(number));
			else insert(node.getLarger(), number);
		}
	}

	// Aufgabe 2
	public int maxDepth() {
		if(top == null) return 0;
		else return maxDepth(1, top);
	}
	public int maxDepth(int depth, BinaryTreeNode level) {
		int leftDepth = depth;
		int rightDepth = depth;
		
		if(level.getSmaller() != null) {
			leftDepth = maxDepth(depth+1, level.getSmaller());
		}
		if(level.getLarger() != null) {
			rightDepth = maxDepth(depth+1, level.getLarger());
		}
		if(leftDepth < rightDepth) {
			return rightDepth;
		} else {
			return leftDepth;
		}
	}

	// Aufgabe 3
	public int sumOfElements() {
		if(top == null) return 0;
		else return sumOfElements(top);
	}
	
	public int sumOfElements(BinaryTreeNode node) {
		int sum = node.getNumber();
		if(node.getSmaller() != null) {
			sum += sumOfElements(node.getSmaller());
		}
		if(node.getLarger() != null) {
			sum += sumOfElements(node.getLarger());
		}
		return sum;
	}

	// Aufgabe 4
	public void deleteNumber(int number) {
		
		BinaryTree neu = new BinaryTree();
		this.deleteNumber(number, top, neu);
		this.top = neu.top;
		
	}
	private void deleteNumber(int number, BinaryTreeNode current, BinaryTree neu) {
		
		if(current != null) {
			if(number != current.getNumber()) {
				neu.insert(current.getNumber());
			}
			deleteNumber(number, current.getSmaller(), neu);
			deleteNumber(number, current.getLarger(), neu);
		}
	}

	/*
	 * ENDE des zu implementierenden Bereichs
	 */

	public static void main(String[] args) {

	}

}
