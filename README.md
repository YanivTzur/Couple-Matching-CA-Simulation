# Couple-Matching-CA-Simulation
## Description:
Simulation of a cellular automaton where single men and women roam about a 2-D board of a fixed size and where couples form and separate based on a configurable set of rules.

## Installation:
Put all source files in a single folder.
Afterwards, make sure all image files are in a folder called Images in the same folder as the source files.
Then, compile all source files using a Java compiler.

## Usage
* How To Run the Automaton:
  * Double click ex11Q2.jar.

### Additional Information:

* Neighbors:
  * The neighborhood of a cell is all 8 cells around him.

* Rules:
  * "Always Pair" - When two single persons of opposite sexes are neighbors, they
		   always form a pair if one of them is the most suitable
		   partner in terms of compatibility of the other's neighbors.
  * "Stationary Pairs" - Couples don't move.
  * "Loyal Pairs" - Couples can't separate with their members creating new
		    pairs.
		    If disabled, each member of a couple can create a new couple
		    only with a single person of the opposite sex (i.e. not
		    with another couple).
  * "Memory Enabled" - Single men and women remain former partners and don't form
		       new couples with partners with whom they have a lower
		       combined relationship index/"happiness index" than former 
		       partners, knowing a better partner exists.
		       When this rule is enabled, the user needs to enter the
		       the maximum number of former partners to remember.

* Statistics:
  * Generation No. - The number of the current generation.
  * Overall Happiness - The level of happiness calculated based on the state of
		        each cell of the automaton.
		        The formula is :
		        (sum of happiness indices of all couples)
		        / 
		        (number of non empty states: man/woman/couple)

* Lower Side of Right Hand Side Panel:
  * Limit Generations - When selected, limits the run time of the automaton in
		       generations to the number entered in the text field
		       to the right of the "Limit Generations" checkbox.
  * Start - Starts a new session of the automaton from generation 0.
  * Continue - Resumes a stopped session from the current generation.
  * Stop - Stops the current session of the automaton.
  * Run Tests: Runs a series of pre-defined tests. The results of the tests
	       appear in the file "testResults.txt.".

The time between generations in milliseconds can be configured by changing
the UPDATE_INTERVAL constant in the CAController class and recompiling.

## License

This project is licensed under the GNU General Public License v3.0 - see the LICENSE.md file for details.
