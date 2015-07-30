package graph;
/**
 * 
 * @author colonelmo
 * Stores connection info between nodes
 * For each pair of connected nodes we need to 
 * keep track of their last interaction and the
 * weight of the edge between them
 * all the data for this purpose encapsulates in
 * this class
 */
public class Connection {
	private int lastChange ;
	private Double weight ;
	
	public Connection(){
		lastChange = 0 ;
		weight = 0.0 ;
	}
	
	public Double accumulate(int currentTimestamp , Double newWeight){
		weight = Constants.Formulas.UpdateEdgeWeight(weight , lastChange, newWeight, currentTimestamp);
		lastChange = currentTimestamp ;
		return weight ;
	}
	
	public Double getWeight(){
		return weight ;
	}
	
	public int getLastChange(){
		return lastChange ;
	}
	
}
