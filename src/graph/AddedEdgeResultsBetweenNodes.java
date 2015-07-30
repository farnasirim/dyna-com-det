package graph;

/**
 * @author colonelmo
 * A log which is returned to the caller 
 * which holds the info about how the 
 * Network was changed over the last alteration
 * This class could be unnecessary and therefore deleted
 */
public class AddedEdgeResultsBetweenNodes extends AddedEdgeResult {

	
	private int nodeA , nodeB;
	public AddedEdgeResultsBetweenNodes(AddedEdgeResult clone ,int from , int to) {
		super(clone);
		nodeA = from ; 
		nodeB = to ;
	}
	
	public int getFirstNode(){
		return nodeA ;
	}

	public int getSecondNode(){
		return nodeB ;
	}

}
