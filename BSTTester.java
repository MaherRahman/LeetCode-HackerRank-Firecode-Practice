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
 * Place results of experiments here:
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

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
        Random r = new Random();
        BinarySearchTree b = new BinarySearchTree();
        Stopwatch s = new Stopwatch();
        s.start();
        for(int i = 0; i < n; i++) {
            b.add( new Integer( r.nextInt() ) ); 
        }
        s.stop();
        System.out.println("Time to insert 1000 randomly generated Int Objects: " + s.time());
        
        //Experiment 2: Record the Height and Size of the tree
        double totalHeight = 0;
        double totalSize = 0;
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
        System.out.println("Average time for insertions: " + s.time() / 10);
        System.out.println("Average height of the tree: " + totalHeight / 10);
        System.out.println("Average size of the tree: " + totalSize / 10);

        
        
        
        // Test 60, stress test
        System.out.println("Stress test, comparing size to HashSet");
        BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();
        HashSet<Integer> hs = new HashSet<>();
        int numValues = 500000;
        for(int i = 0; i < numValues; i++) {
            int temp = r.nextInt();
            bst1.add(temp);
            hs.add(temp);
        }
        showTestResults(hs.size() == bst1.size(), 60);
        
        // Test 61, stress test
        System.out.println("Stress test, comparing size to HashSet");
        bst1 = new BinarySearchTree<>();
        hs = new HashSet<>();
        numValues = 1000000;
        for(int i = 0; i < numValues; i++) {
            int temp = r.nextInt();
            bst1.add(temp);
            hs.add(temp);
        }
        showTestResults(hs.size() == bst1.size(), 61);
    }

    private static void showTestResults(boolean passed, int testNum) {
        if( passed )
            System.out.println( "Test " + testNum + " passed.");
        else
            System.out.println( "TEST " + testNum + " FAILED.");
    }
}
