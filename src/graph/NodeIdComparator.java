package graph;

import java.util.Comparator;

/**
 * 
 * @author colonelmo
 * For sorting node objects in respect to their ID
 */
public class NodeIdComparator implements Comparator<Node>{
	public int compare(Node fir , Node sec) {
		return Integer.compare(fir.getId(), sec.getId());
	}
}
