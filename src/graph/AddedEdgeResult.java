package graph;

/**
 * @author colonelmo
 * A log which is returned to the caller 
 * which holds the info about how the 
 * Network was changed over the last alteration
 * This class could be unnecessary and therefore deleted
 */

public class AddedEdgeResult {
	private boolean newEdge ;
	private Double newWeight ;

	public AddedEdgeResult(boolean isNewEdge , Double newWeight){
		this.newEdge = isNewEdge ;
		this.newWeight = newWeight ;
	}
	
	public AddedEdgeResult(AddedEdgeResult clone){
		this.newEdge = clone.newEdge ;
		this.newWeight = clone.newWeight ;
	}
	
	public boolean isNew(){
		return this.newEdge ;
	}
	
	public Double getResultedWeight(){
		return this.newWeight ;
	}
}
