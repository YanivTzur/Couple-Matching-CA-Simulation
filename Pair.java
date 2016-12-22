package ex11Q2;

/**
 * Represents a pair of two arbitrary objects grouped together.
 * @author Yaniv Tzur
 * @param <T> The type of the first element of the pair. 
 * @param <S> The type of the second element of the pair.
 */
public class Pair<T,S> 
{
	private T _firstElement; // The first element in the pair.
	private S _secondElement; // The second element in the pair.
	
	/**
	 * Creates a Pair object grouping together the two input elements.
	 * @param firstElement The first element to be included in the pair.
	 * @param secondElement The second element to be included in the pair.
	 */
	public Pair(T firstElement, S secondElement)
	{
		_firstElement = firstElement;
		_secondElement = secondElement;
	}
	
	/**
	 * Returns the first element in the pair.
	 * @return the first element in the pair.
	 */
	public T getFirstElement()
	{
		return _firstElement;
	}
	
	/**
	 * Returns the second element in the pair.
	 * @return the second element in the pair.
	 */
	public S getSecondElement()
	{
		return _secondElement;
	}
	
	/**
	 * Sets the first element's field in the pair to reference the input object.
	 * @param firstElement the object to reference as the new first element in the pair.
	 */
	public void setFirstElement(T firstElement)
	{
		_firstElement = firstElement;
	}
	
	/**
	 * Sets the second element's field in the pair to reference the input object.
	 * @param secondElement the object to reference as the new second element in the pair.
	 */
	public void setSecondElement(S secondElement)
	{
		_secondElement = secondElement;
	} 
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object other)
	{
		Pair<T,S> otherPair = null;
		try
		{
			otherPair = (Pair<T,S>) other;
		}
		catch(ClassCastException e)
		{
			return false;
		}
		return (this.getFirstElement().equals(otherPair.getFirstElement())
				&&
				this.getSecondElement().equals(otherPair.getSecondElement()));
	}
}
