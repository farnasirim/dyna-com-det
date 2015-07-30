package graph;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author colonelmo
 * The node stores and handles the alteration of the info 
 * related to edges between other nodes and itself
 */
public class Node  {
	private int id ;
	private ArrayList<Edge> alterations ;

	private topKCandidateList candidates ;
	private TopKNeighborList neighbors ;
	
	public Node(int id){
		this.id = id ;
		candidates = new topKCandidateList();
		neighbors = new TopKNeighborList();
		alterations = new ArrayList<>();
	}
	
	public int getId(){
		return id ;
	}

	public void addAlteration(Edge e){
		alterations.add(e.getRespectiveClone(getId()));
	}
	
	public void alter(){
		for(Edge e : alterations){
			if(neighbors.contains(e.getTo())){
				
			}
			else if(candidates.contains(e.getTo())){
				
			}
			else{
				
			}
		}
		alterations.clear();
	}
	
}
