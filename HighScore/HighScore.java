/* Write a method that takes:

an array of unsortedScores
the highestPossibleScore in the game
and returns a sorted array of scores in less than O(n\lg{n})O(nlgn) time.

For example:

int[] unsortedScores = {37, 89, 41, 65, 91, 53};
final int HIGHEST_POSSIBLE_SCORE = 100;

int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
// sortedScores: [91, 89, 65, 53, 41, 37]
*/

// We can use counting. we can make another array or a hash map, and
// store the values we come across in there. We sacrifice space for time

public static int[] sortHighScores(int[] unorderedScores, int highestPossibleScore) {

    // array of indices from 0 to the high score
    int[] numScores = new int[highestPossibleScore + 1];

    // store how many times a number appeared in numScores
    for (int score : unorderedScores) {
        numScores[score]++;
    }

    // populate the final sorted array
    int[] sortedScores = new int[unorderedScores.length];
    int currentSortedIndex = 0;

    // for each item in numScores
    for (int score = highestPossibleScore; score >= 0; score--) {
        int count = numScores[score];

        // for the number of times the item occurs
        for (int occurrence = 0; occurrence < count; occurrence++) {

            // add it to the sorted array
            sortedScores[currentSortedIndex] = score;
            currentSortedIndex++;
        }
    }

    return sortedScores;
}

/* The complexity is O(n + k) and the space is O(n + k). essentially an 
   O(n) solution
 */ 