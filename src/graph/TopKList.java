package graph;

import java.util.TreeMap;
/**
 * 
 * @author colonelmo
 * Parent class for top k neighbors list and top k candidates list,
 * implementing functionality necessary for both of them.
 */
public class TopKList {
	private TreeMap<Integer, Connection> connections;
	private TreeMap<Double , Node> sortedList ;
	private TreeMap<Integer, Node> nodeMap ;
	
	public TopKList(){
		connections = new TreeMap<>() ;
		sortedList= new TreeMap<>();
		nodeMap = new TreeMap<>();
	}
	
	boolean contains(int id){
		return connections.containsKey(id);
	}
	
}
