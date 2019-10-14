Game of Life Lab

# Introduction
# 
The goal of this lab is to apply your understanding of decision and
	loop structures to implement a complex algorithm within the
	context of an unfamiliar and significant software framework
	(GridWorld). In addition, you will implement a unit test for your
	program using the JUnit framework and create documentation for
	your program using JavaDoc.

# Requirements
# 
Write a program that plays[ Conway’s Game of
	Life](http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life).
	Conway’s Game of Life is a cellular automaton. From Wikipedia:

*The universe of the Game of Life is an infinite two-dimensional
	orthogonal grid of square cells, each of which is in one of two
	possible states, alive or dead. Every cell interacts with its
	eight neighbours, which are the cells that are horizontally,
	vertically, or diagonally adjacent. At each step in time, the
	following transitions occur:*

* *Any live cell with fewer than two live neighbours dies, as if
	caused by underpopulation.*

* *Any live cell with two or three live neighbours lives on to the
	next generation.*

* *Any live cell with more than three live neighbours dies, as if by
	overcrowding.*

* *Any dead cell with exactly three live neighbours becomes a live
	cell, as if by reproduction.*

* *The initial pattern constitutes the seed of the system. The first
	generation is created by applying the above rules simultaneously
	to every cell in the seed—births and deaths occur simultaneously,
	and the discrete moment at which this happens is sometimes called
	a tick (in other words, each generation is a pure function of the
	preceding one). The rules continue to be applied repeatedly to
	create further generations.*

# Requirements:
# 
* the program must be implemented in Java and utilize the GridWorld
	platform

* I recommend not using GridWorld’s execution engine to produce
	subsequent generations. That is, the Step, Run, and Stop buttons
	will not function. It will be easier to implement the unit test
	if you directly produce and display subsequent generations.

* follow the tasks enumerated below in the order specified; commit
	after each task as applicable

* implement the partially defined methods in the GameOfLife class

    * populateGame

    * createNextGeneration

    * main

* implement the GameOfLifeTest class

    * testInitialState

    * testFinalState

# Artifacts to Produce:
# 
* Requirements Document: I've defined some requirements. You must
	define additional requirements that are reasonable and document
	all requirements in the README file of your BlueJ project. I must
	review your requirements document before you start writing code.
	You may change the requirements document throughout development.
	The following are some of the questions that your requirements
	should address:

    * how large is the grid? is it boundless?

    * what do live cells look like?

    * what do dead cells look like?

    * what pattern is displayed? are multiple patterns available? are
    	patterns chosen in code, chosen randomly, chosen by user?

    * how long does the game run? does it run forever? does it prompt
    	the user to continue?

    * what is the time interval between generations?

    * what about edge cases? does it wrap around?

* Sample Grids: You must draw at least three generations of a grid
	(at least 6x6) with a sample pattern other than the one provided
	in the starter code. The purpose of drawing these grids is to
	manually work through the algorithm and experience all of the
	steps necessary to determine the next generation from the
	current. This will help you map these steps you performed
	manually to the algorithm for your lab. Photo or scan your grids
	and commit the image to GitHub.

* Test Plan: You must create a test plan with specific test cases (at
	least two) before starting implementation. I must review your
	test plan before you start implementing your test class. You may
	change your test plan throughout development. The provided code
	in GitHub is an example of implementing an initial test case. You
	will modify this code to test the initial case for your pattern
	which must be different than the one that I provided. Document
	your test plan as a comment in the GameOfLifeTest java file. A[
	Game of Life web
	app](http://pmav.eu/stuff/javascript-game-of-life-v3.1.1/) can
	help you determine the state of your pattern after a specified
	number of generations.

* GameOfLifeTest Test Class: JUnit-compatible test class that
	implements the test plan.

* GameOfLife class: You must produce a working class that meets the
	requirements and is verified and validated by your test plan.

# Tasks:
# 
1. play with the Game of Life web app and learn rules and patterns

2. define your requirements and capture in README file

3. create grids (at least 6 x 6) of at least three generations
	starting with your seed pattern; scan/photo and commit to GitHub

4. document test plan for each unit test in comments in
	GameOfLifeTest.java

5. implement unit tests in GameOfLifeTest.java

6. run unit tests (both should fail!)

7. implement populateGame method in GameOfLife.java

8. run unit test (initial test should pass!)

9. read documentation for key GridWorld classes

10. on paper, create algorithm to apply the rules of the Game of Life
	to Actors in a Grid

11. implement createNextGeneration method in GameOfLife.java

12. run unit test (both tests should pass!)

13. implement static main method in GameOfLife.java to create
	multiple generations with a time delay between each

# Extensions:
# 
* Add custom icons for alive or dead cells.

* Implement more sophisticated seed patterns. If you do, create
	another method similar to the populateGame method such that your
	unit test continues to pass.

* Add more awesome.

# Submission:
# 
* Ensure the following artifacts have been committed to GitHub in
	addition to your code:

    * requirements captured in README file

    * test plan (with specific test cases) documented in
    	GameOfLifeTest.java

    * HTML documentation generated by JavaDoc

* Submit a link to your GitHub repository.

* If you would like your Game of Life Lab featured on the school TVs,
	take a short screencast of your lab running and add it to the
	[shared Google slide
	deck](https://docs.google.com/presentation/d/
	1Yn_Rl_cuk382Eu6guMngQkFZXHYyLfbxueIUZwhKhBo/edit?usp=sharing)
	based on the provided template slide.

https://docs.google.com/document/d/1o5yzt6hP7zM6YMQZ6_gKUVBBCN_tIokj4a1HyyOEAyU/edit#
