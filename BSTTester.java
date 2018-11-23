/*  Student information for assignment:
 *
 *  On my honor, Maher Rahman, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  UTEID: mmr3447
 *  email address: MaherRahman1@gmail.com
 *  Grader name: Andrew
 *  Number of slip days I am using: 0
 */


/*
 * Experiment 1: insert 1000 random ints and record the time it takes, as well as the height and size of the tree
 *  Time to insert 1000 randomly generated Int Objects: 0.0020757
	Average height of the tree: 19.0
	Average size of the tree: 1000.0
 *
 * 
 * Experiment 2: repeat experiment 1 10 times and note the average time, height and size
 *	Average time for insertions: 6.091499999999999E-4
	Average height of the tree: 21.0
	Average size of the tree: 1000.0
 * 
 * Experiment 3: repeat experiment 1 10 times but with different N values, and record all information:
 * 
 * 	 BinarySearchTree
	Average time for insertions for 2000 elements: 4.1259010000000004E-4
	Average height of the tree for 2000 elements: 24.9
	Average size of the tree for 2000 elements: 2000.0
	
	                       BinarySearchTree
	Average time for insertions for 4000 elements: 9.769099999999999E-4
	Average height of the tree for 4000 elements: 26.9
	Average size of the tree for 4000 elements: 4000.0
	
	                       BinarySearchTree
	Average time for insertions for 8000 elements: 0.0048493901
	Average height of the tree for 8000 elements: 28.3
	Average size of the tree for 8000 elements: 7999.9
	
	                       BinarySearchTree
	Average time for insertions for 16000 elements: 0.00456689
	Average height of the tree for 16000 elements: 32.7
	Average size of the tree for 16000 elements: 16000.0
	
	                       BinarySearchTree
	Average time for insertions for 32000 elements: 0.01035639
	Average height of the tree for 32000 elements: 34.2
	Average size of the tree for 32000 elements: 31999.9
	
	                       BinarySearchTree
	Average time for insertions for 64000 elements: 0.02207824
	Average height of the tree for 64000 elements: 37.3
	Average size of the tree for 64000 elements: 63999.5
	
	                       BinarySearchTree
	Average time for insertions for 128000 elements: 0.053697629999999996
	Average height of the tree for 128000 elements: 40.5
	Average size of the tree for 128000 elements: 127998.3
	
	                       BinarySearchTree
	Average time for insertions for 256000 elements: 0.11936941000000001
	Average height of the tree for 256000 elements: 43.7
	Average size of the tree for 256000 elements: 255993.7
	
	                       BinarySearchTree
	Average time for insertions for 512000 elements: 0.30222244
	Average height of the tree for 512000 elements: 46.8
	Average size of the tree for 512000 elements: 511967.5
	
	                       BinarySearchTree
	Average time for insertions for 1024000 elements: 0.7356296899
	Average height of the tree for 1024000 elements: 50.3
	Average size of the tree for 1024000 elements: 1023872.9
	
 * Question: For each value of N what is the minimum possible tree height, 
 * assuming N unique values are inserted into the tree?
 * 
 * Experiment 4: repeat experiment 3 but using TreeSet
 * 
	  					   Treeset
	Average time for insertions TreeSet for 1000 elements: 6.107299E-4
	Average size of the tree TreeSet for 1000 elements: 1000.0
	
	                       Treeset
	Average time for insertions TreeSet for 2000 elements: 7.6273E-4
	Average size of the tree TreeSet for 2000 elements: 2000.0
	
	                       Treeset
	Average time for insertions TreeSet for 4000 elements: 0.00114371
	Average size of the tree TreeSet for 4000 elements: 4000.0
	
	                       Treeset
	Average time for insertions TreeSet for 8000 elements: 0.00234686
	Average size of the tree TreeSet for 8000 elements: 8000.0
	
	                       Treeset
	Average time for insertions TreeSet for 16000 elements: 0.004180870099999999
	Average size of the tree TreeSet for 16000 elements: 15999.9
	
	                       Treeset
	Average time for insertions TreeSet for 32000 elements: 0.00821052
	Average size of the tree TreeSet for 32000 elements: 31999.7
	
	                       Treeset
	Average time for insertions TreeSet for 64000 elements: 0.01649681
	Average size of the tree TreeSet for 64000 elements: 63999.7
	
	                       Treeset
	Average time for insertions TreeSet for 128000 elements: 0.0338021601
	Average size of the tree TreeSet for 128000 elements: 127997.3
	
	                       Treeset
	Average time for insertions TreeSet for 256000 elements: 0.08855409
	Average size of the tree TreeSet for 256000 elements: 255992.9
	
	                       Treeset
	Average time for insertions TreeSet for 512000 elements: 0.22706311010000002
	Average size of the tree TreeSet for 512000 elements: 511973.1
	
	                       Treeset
	Average time for insertions TreeSet for 1024000 elements: 0.5821432801
	Average size of the tree TreeSet for 1024000 elements: 1023876.5
	
 * Question: What are the average times for TreeSet? How do they compare to your BST?
 * 
 * Experiment 5: Generate a list of 1000 ints in sorted Integer, add the values into an empty BST
 * record the height
 * 
 * height of the tree: 999.0
 * 
 * Experiment 6: repeat experiment 5 10 times, noting average time, height, and size
 *
 * 			Adding 1000 sorted values
	Average time for insertions: 0.0017744701000000002
	Average height of the tree: 999.0
	Average size of the tree: 1000.0
 * 
 * Experiment 7: repeat experiment 5 10 times using different N values for our BST
 * 
 * 						   Adding Sorted Values to Binary Search Tree
	Average time for insertions TreeSet for 2000 elements: 0.0150469801
	Average height of the tree TreeSet for 2000 elements: 999.0
	Average size of the tree TreeSet for 2000 elements: 999.0
	
	                       Adding Sorted Values to Binary Search Tree
	Average time for insertions TreeSet for 4000 elements: 0.01921561
	Average height of the tree TreeSet for 4000 elements: 1999.0
	Average size of the tree TreeSet for 4000 elements: 1999.0
	
	                       Adding Sorted Values to Binary Search Tree
	Average time for insertions TreeSet for 8000 elements: 0.0644216001
	Average height of the tree TreeSet for 8000 elements: 3999.0
	Average size of the tree TreeSet for 8000 elements: 3999.0
	
	                       Adding Sorted Values to Binary Search Tree
	Average time for insertions TreeSet for 16000 elements: 0.23513796
	Average height of the tree TreeSet for 16000 elements: 7999.0
	Average size of the tree TreeSet for 16000 elements: 7999.0
	
	                       Adding Sorted Values to Binary Search Tree
	Average time for insertions TreeSet for 32000 elements: 0.9163971399999999
	Average height of the tree TreeSet for 32000 elements: 15999.0
	Average size of the tree TreeSet for 32000 elements: 15999.0
 * 
 * Experiment 8: repeat experiment 7 using a TreeSet instead. 
 *  					   Adding Sorted Values to TreeSet
	Average time for insertions TreeSet for 2000 elements: 2.6813E-4
	
	                       Adding Sorted Values to TreeSet
	Average time for insertions TreeSet for 4000 elements: 4.443999E-4
	
	                       Adding Sorted Values to TreeSet
	Average time for insertions TreeSet for 8000 elements: 8.8269E-4
	
	                       Adding Sorted Values to TreeSet
	Average time for insertions TreeSet for 16000 elements: 0.0018169601
	
	                       Adding Sorted Values to TreeSet
	Average time for insertions TreeSet for 32000 elements: 0.003909950000000001
 * 
 * Question: How do these times compare to the times it took for you BinarySearchTree class when inserting 
 * integers in sorted order? What do you think is the cause for these differences?
 * 
 */


import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

/**
 * Some test cases for CS314 Binary Search Tree assignment.
 *
 */
public class BSTTester {

	/**
	 * The main method runs the tests.
	 * @param args Not used
	 */
	public static void main(String[] args) {
		BinarySearchTree<String> t = new BinarySearchTree<>();

		//Test 0: Empty Binary Search Tree
		System.out.println("Test 0: empty tree created.");
		showTestResults( t.size() == 0, 0 );

		//test 1: Add Method
		System.out.println("Test 1: Adding an element to the tree");
		showTestResults( t.add("Maher"), 1 );

		//test 2: Add Method
		System.out.println("Test 2: Adding an element to the tree");
		showTestResults( t.add("Andrew"), 2 );

		//test 3: Remove Method
		System.out.println("Test 3: Removing an element from the tree");
		showTestResults( t.remove("Maher"), 3 );

		//test 4: Remove Method
		System.out.println("Test 4: Removing an element from the tree");
		showTestResults( t.remove("Andrew"), 4 );
		t.printTree();
		//test 5: Max
		t.add("Mike");
		t.add("Maher");
		t.add("Andrew");
		t.add("Yeet");
		t.add("HaHa");
		t.add("Yay");
		t.add("CS314");
		t.add("CS429");
		System.out.println("Test 5: the max of the tree is Yeet");
		showTestResults( t.max() == "Yeet", 5 );

		//test 6: Max
		t.remove("Yeet");
		System.out.println("Test 6: the max of the tree is Yay");
		showTestResults( t.max() == "Yay", 6 );

		//test 7: isPresent
		System.out.println("Test 7: Tree should not contain Yeet anymore");        
		showTestResults( t.isPresent("Yeet") == false, 7);

		//test 8: isPresent
		System.out.println("Test 8: Tree should still contain CS314");        
		showTestResults( t.isPresent("CS314"), 8);

		//test 9: Size
		System.out.println("Test 9: Tree should have a size of 7");  
		showTestResults( t.size() == 7, 9);

		//test 10: Size
		t.iterativeAdd("abyss");
		System.out.println("Test 10: Tree should have a size of 8");    
		showTestResults( t.size() == 8, 10 );

		//test 11: Height
		System.out.println("Test 11: Height should equal 3"); 
		showTestResults( t.height() == 5, 11 );

		//test 12: Height
		System.out.println("Test 12: Height after removal should remain unchanged");  
		t.remove("Yay");
		showTestResults(t.height() == 5, 12 );

		//test 13: getAll
		System.out.println("Test 13: GetAll Method"); 
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Andrew");
		expected.add("CS314");
		expected.add("CS429");
		expected.add("HaHa");
		expected.add("Maher");
		expected.add("Mike");
		expected.add("abyss");
		showTestResults( t.getAll().equals(expected), 13 );

		//test 14: getAll
		System.out.println("Test 14: GetAll Method");
		t.remove("abyss");
		expected.remove("abyss");
		showTestResults( t.getAll().equals(expected), 14 );

		//test 15: Min
		System.out.println("Test 15: Getting the minimum of the tree, which is Andrew");
		showTestResults( t.min() == "Andrew", 15 );

		//test 16: Min
		t.remove("Andrew");
		System.out.println("Test 16: Getting the minimum of the tree, which is CS314");
		showTestResults( t.min() == "CS314", 16 );

		//test 17: iterativeAdd
		System.out.println("Test 17: iteratively adding to the tree");
		t.iterativeAdd("Bill Young");
		expected.clear();
		expected.add("Bill Young");
		expected.add("CS314");
		expected.add("CS429");
		expected.add("HaHa");
		expected.add("Mike");
		showTestResults( expected.equals(t.getAll()), 17 );

		//test 18: iterativeAdd
		System.out.println("Test 18: Iteratively adding to the tree");
		t.iterativeAdd("yoinks");
		showTestResults( t.isPresent("yoinks"), 18 );

		//test 19: Get
		System.out.println("Test 19: Get method for index 4 should get Mike");  
		showTestResults( t.get(4) == "Mike", 19);

		//test 20: Get
		t.add("HAhA");
		System.out.println("Test 20: Get method for index 4 should get HaHa");
		showTestResults(t.get(4) == "HaHa", 20);

		//test 21: GetAllLessThan
		System.out.println("Test 21: GetAllLessThan HaHa");
		expected.clear();
		expected.add("Bill Young");
		expected.add("CS314");
		expected.add("CS429");
		expected.add("HAhA");
		showTestResults(t.getAllLessThan("HaHa").equals(expected), 21);

		//test 22: GetAllLessThan
		System.out.println("Test 22: GetAllLessThan Mike");
		expected.add("HaHa");
		showTestResults(t.getAllLessThan("Mike").equals(expected), 22);

		//test 23: GetAllGreaterThan
		System.out.println("Test 23: GetAllGreaterThan CS429");
		expected.clear();
		expected.add("HAhA");
		expected.add("HaHa");
		expected.add("Mike");
		expected.add("yoinks");
		showTestResults(t.getAllGreaterThan("CS429").equals(expected), 23);

		//test 24: GetAllLessThan
		System.out.println("Test 24: GetAllGreaterThan Mike");
		expected.clear();
		expected.add("yoinks");
		showTestResults(t.getAllGreaterThan("Mike").equals(expected), 24);

		//test 25: NumNodesAtDepth
		System.out.println("Test 25: NumNodesAtDepth at depth 1 should be 2");
		showTestResults(t.numNodesAtDepth(1) == 2, 25);

		//test 26: NumNodesAtDepth
		System.out.println("Test 25: NumNodesAtDepth at depth 3 should be 2");
		showTestResults(t.numNodesAtDepth(4) == 1, 26);

		//Experiment Code Here
		//Experiment 1: Inserting 1000 randomly generated Integer Objects into a BST
		int n = 1000;
		double totalHeight = 0;
		double totalSize = 0;
		Random r = new Random();
		BinarySearchTree<Integer> b = new BinarySearchTree<>();
		Stopwatch s = new Stopwatch();
		s.start();
		for(int i = 0; i < n; i++) {
			b.add( new Integer( r.nextInt() ) ); 
		}
		totalHeight += b.height();
		totalSize += b.size();
		s.stop();
		System.out.println();
		System.out.println("Time to insert 1000 randomly generated Int Objects: " + s.time());
		System.out.println("Average height of the tree: " + totalHeight);
		System.out.println("Average size of the tree: " + totalSize);
		System.out.println();

		//Experiment 2: Record the Height and Size of the tree
		totalHeight = 0;
		totalSize = 0;
		s.start();
		for(int i = 0; i < 10; i++) {
			b = new BinarySearchTree();
			for(int j = 0; j < n; j++) {
				b.add( new Integer( r.nextInt() ) ); 
			}
			totalHeight += b.height();
			totalSize += b.size();
		}
		s.stop();
		System.out.println();
		System.out.println("Average time for insertions: " + s.time() / 10);
		System.out.println("Average height of the tree: " + totalHeight / 10);
		System.out.println("Average size of the tree: " + totalSize / 10);
		System.out.println();

		//Experiment 3: N of [2,000 , 4,000 , 8,000 , 16,000 , 32,000 , 64,000 , 128,000 , 256,000 , 512,000
		// 1,024,000] 
		int[] integers = new int[] {2000 , 4000 , 8000 , 16000 , 32000 , 64000 ,
				128000 , 256000 , 512000 , 1024000};
		for (int i = 0; i < integers.length; i++) {
			n = integers[i];
			totalHeight = 0;
			totalSize = 0;
			s.start();
			for(int j = 0; j < 10; j++) {
				b = new BinarySearchTree();
				for(int k = 0; k < n; k++) {
					b.add( new Integer( r.nextInt() ) ); 
				}
				totalHeight += b.height();
				totalSize += b.size();
			}
			s.stop();
			System.out.println("                       BinarySearchTree");
			System.out.println("Average time for insertions for " + n + " elements: " + s.time() / 10);
			System.out.println("Average height of the tree for " + n + " elements: " + totalHeight / 10);
			System.out.println("Average size of the tree for " + n + " elements: " + totalSize / 10);
			System.out.println();
		}

		//Experiment 4: using java TreeSet class
		integers = new int[] {1000, 2000 , 4000 , 8000 , 16000 , 32000 , 64000 ,
				128000 , 256000 , 512000 , 1024000};
		TreeSet tree = new TreeSet();
		for (int i = 0; i < integers.length; i++) {
			n = integers[i];
			totalSize = 0;
			s.start();
			for(int j = 0; j < 10; j++) {
				tree = new TreeSet();
				for(int k = 0; k < n; k++) {
					tree.add( new Integer( r.nextInt() ) ); 
				}
				totalSize += tree.size();
			}
			s.stop();
			System.out.println("                       Treeset");
			System.out.println("Average time for insertions TreeSet for " + n + " elements: " + s.time() / 10);
			System.out.println("Average size of the tree TreeSet for " + n + " elements: " + totalSize / 10);
			System.out.println();
		}

		//Experiment 5: generate a list of 1000 integers sorted in ascending order
		//create the sorted list
		ArrayList<Integer> sorted = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			sorted.add(i);
		}
		totalHeight = 0;
		totalSize = 0;
		s.start();
		for(int j = 0; j < 10; j++) {
			b = new BinarySearchTree();
			for (int i = 0; i < 1000; i++) {
				b.add(sorted.get(i));
			}
			totalHeight += b.height();
			totalSize += b.size();
		}
		s.stop();
		System.out.println("                       Adding 1000 sorted values");
		System.out.println("Average time for insertions: " + s.time() / 10);
		System.out.println("Average height of the tree: " + totalHeight / 10);
		System.out.println("Average size of the tree: " + totalSize / 10);
		System.out.println();

		//Experiment 6: adding for N values of 2000, 4000 ... 512000
		integers = new int[] {2000 , 4000 , 8000 , 16000 , 32000};
		for (int i = 0; i < integers.length; i++) {
			n = integers[i];
			for (int l = 1; l <= n; l++) {
				sorted.add(l);
			}
			totalHeight = 0;
			totalSize = 0;
			s.start();
			for(int j = 0; j < 10; j++) {
				b = new BinarySearchTree();
				for(int k = 0; k < n; k++) {
					b.iterativeAdd(sorted.get(k));
				}
				totalHeight += b.height();
				totalSize += b.size();
			}
			s.stop();
			System.out.println("                       Adding Sorted Values to Binary Search Tree");
			System.out.println("Average time for insertions TreeSet for " + n + " elements: " + s.time() / 10);
			System.out.println("Average height of the tree TreeSet for " + n + " elements: " + totalHeight / 10);
			System.out.println("Average size of the tree TreeSet for " + n + " elements: " + totalSize / 10);
			System.out.println();
		}

		//Experiment 7: adding sorted for N values of 2000, 4000 ... 32000 TreeSet
		integers = new int[] {2000 , 4000 , 8000 , 16000 , 32000};
		for (int i = 0; i < integers.length; i++) {
			n = integers[i];
			for (int l = 1; l <= n; l++) {
				sorted.add(l);
			}
			totalSize = 0;
			s.start();
			for(int j = 0; j < 10; j++) {
				tree = new TreeSet();
				for(int k = 0; k < n; k++) {
					tree.add(sorted.get(k));
				}
			}
			s.stop();
			System.out.println("                       Adding Sorted Values to TreeSet");
			System.out.println("Average time for insertions TreeSet for " + n + " elements: " + s.time() / 10);
			System.out.println();
		}
	}

	private static void showTestResults(boolean passed, int testNum) {
		if( passed )
			System.out.println( "Test " + testNum + " passed.");
		else
			System.out.println( "TEST " + testNum + " FAILED.");
	}
}
