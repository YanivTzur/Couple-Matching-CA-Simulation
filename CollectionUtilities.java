package ex11Q2;

import java.util.ArrayList;

/**
 * Contains static methods for manipulating collections.
 * @author Yaniv Tzur
 */
public class CollectionUtilities 
{
	/**
	 * Receives two lists and returns a new list consisting of a concatenation of the elements
	 * of each of the two lists.
	 * @param list1 The first list to which the second list is to be concatenated.
	 * @param list2 The second list to be concatenated to the first.
	 * @return a new list concatenating the elements of the two input lists.
	 */
	public static <T> ArrayList<T> concatenateLists(ArrayList<T> list1, ArrayList<T> list2)
	{
		ArrayList<T> newList = new ArrayList<T>(list1);
		newList.addAll(list2);
		return newList;
	}
	
	/**
	 * Set all of the input 2-D array's elements' references to null.
	 * @param states a 2-D array for which to set all references to null.
	 */
	public static void setNullReferences(State[][] states)
	{
		for (int i = 0; i < states.length; i++)
			for(int j = 0; j < states[0].length; j++)
				states[i][j] = null;
	}
}
