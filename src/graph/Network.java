package graph;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * @author colonelmo
 * Network class stores the nodes and the relationships
 * among them in the graph.
 * 
 */
public class Network {
	private int currentTimestamp ;
	private TreeMap<Integer , Node> nodes ;
	

	private void addNode(int id){
		nodes.put(id , new Node(id));
	}
	
	private boolean nodeExists(int id){
		return nodes.containsKey(id);
	}
	
	private Node getNode(int id){
		return nodes.get(id);
	}
	
	public Network(){
		nodes = new TreeMap<>() ;
		currentTimestamp = 0 ;
	}
	
	public AddedEdgeResultsBetweenNodes addEdge(Edge edge , TreeSet<Integer> altered){
		Integer nodeA = edge.getFrom() ;
		Integer nodeB = edge.getTo() ;
		
		Node from = getNode(nodeA);
		Node to = getNode(nodeB);
		
		from.addAlteration(edge);
		to.addAlteration(edge);

		altered.add(nodeA);
		altered.add(nodeB);
		
		return null ;
	}

	
	public ArrayList<AddedEdgeResultsBetweenNodes> incrementNetwork (IncrementalGraph gr){
		ArrayList<AddedEdgeResultsBetweenNodes> ret = new ArrayList<>() ;

		for(Integer id : gr.getAddedNodes()){
			if(!nodeExists(id)){
				addNode(id);
			}
		}
		
		TreeSet<Integer> altered = new TreeSet<>();
		
		for(Edge con : gr.getNewConnections()){
			addEdge(con , altered);
		}
		
		for(Integer nodeId : altered){
			getNode(nodeId).alter();
		}
		
//		TreeSet<Integer> newNodes = new TreeSet<>() ;
//		for(Integer nodeId : gr.getAddedNodes()){
//			if(!nodes.containsKey(nodeId)){
//				nodes.put(nodeId, new Node(nodeId));
//				newNodes.add(nodeId);
//			}
//		}
//		for(Edge edge : gr.getNewConnections()){
//			ret.add(addEdge(edge));
//		}
		return ret;
	}
	
}
