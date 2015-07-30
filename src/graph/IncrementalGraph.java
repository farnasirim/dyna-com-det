package graph;

import java.util.ArrayList;
/**
 * 
 * @author colonelmo
 * A snapshot of the network.
 * The new data which has to be processed
 * in the graph stream is presented as 
 * an object of type IncrementalGraph
 */
public class IncrementalGraph {
	private ArrayList<Integer> addedNodes;
	private ArrayList<Edge> newConnections;
	
	public IncrementalGraph(){
		addedNodes = new ArrayList<>() ;
		newConnections = new ArrayList<>();
	}
	
	public void addNode(Integer nodeId){
		addedNodes.add(nodeId);
	}
	
	public void addConnection(Edge add){
		newConnections.add(add);
	}
	
	public ArrayList<Integer> getAddedNodes(){
		return addedNodes ;
	}
	
	public ArrayList<Edge> getNewConnections(){
		return newConnections ;
	}
	
}
