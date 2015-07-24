# Scrabble-Word-Suggestor

Objective: Construct a basic SCRABBLE simulation for the first move that a player makes

Problem Statement: Given a rack of 7 tiles, generate the valid words that can be formed from them and arrange them in decreasing order of their scores.

Assumptions:
Each letter of the English Alphabet is assigned a numeric score

Algorithm:

Step 1: Generate the valid anagrams of all the words in the sowpods word list

Step 2: Accept a rack of letters from the user

Step 3: Generate all possible combinations of the rack recursively

Step 4: Compute the score of each combination

Step 5: For each combination, check if it exists in the anagram list. If it does, get the words that can be made using
        that combination and store them in the WordScorer object.

Step 6: WordScorer sorts the words based on the score and returns a list

Step 7: Print the list
