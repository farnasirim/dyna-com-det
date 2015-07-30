package graph;
/**
 * 
 * @author colonelmo
 * Classical graph theory edge
 */
public class Edge {
	private int from , to ;
	private Double weight ;
	private Edge(int nodeIdA , int nodeIdB , Double weight){
		this.weight = weight ;
		from = nodeIdA ;
		to = nodeIdB ;
	}
	
	public int getFrom(){
		return from ;
	}
	
	public int getTo(){
		return to ;
	}
	
	public Double getWeight(){
		return weight ;
	}
	/**
	 * This method clones this edge in respect to one of
	 * it's end points. The id of the end point which has to come as
	 * "from" data member in the clone is passed along.
	 */
	public Edge getRespectiveClone(int id){
		if(id == from)
			return new Edge(from , to , weight);
		return new Edge(to , from , weight);
	}
	
}
