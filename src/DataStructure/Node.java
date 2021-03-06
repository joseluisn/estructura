package DataStructure;

public interface Node {

	Node next = null; //Pointer
	boolean visited = false;
	
	/**
	 * 
	 * @return
	 */
	public String toString();
	
	
	/**
	 * 
	 * @param node
	 */
	public void setNext(Node node);
	
	
	/**
	 * 
	 * @return
	 */
	public Node getNext();
	
	
	/**
	 * 
	 * @return
	 */
	public Node clone();
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isEqual(Node node);
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLessThan(Node node);
}
