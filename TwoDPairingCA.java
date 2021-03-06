package ex11Q2;

/**
 * A cellular automaton simulating X males and Y women roaming about the area of a square board
 * and pairing with each other or separating from each other based on various rules.
 * @author Yaniv Tzur
 */
public class TwoDPairingCA 
{
	private CAView _caView; // The graphical view of the CA.
	private CAController _caController; // Controls the logic of the CA.
	private CAModel _caModel; // Contains the collective state of the CA.
	
	/**
	 * Constructs a 2-D cellular automaton object with the input view, controller and
	 * model objects.
	 * @param caView Represents the automaton's graphical view.
	 * @param caController Controls the automaton's logic (e.g. transition rules between
	 * 					   generations)
	 * @param caModel represents the the collective state of the automaton's cells 
	 * 				  (i.e. the state of each cell).
	 */
	public TwoDPairingCA(CAView caView, CAController caController, CAModel caModel)
	{
		_caView = caView;
		_caController = caController;
		_caModel = caModel;
		_caController.initializeController(_caModel, _caView);
		_caView.setController(_caController);
	}
	
	/**
	 * Creates a new pairing simulation CA with default new associated view, controller and
	 * model objects.
	 */
	public TwoDPairingCA()
	{
		this(new CAView(), new CAController(), new CAModel());
	}
}
