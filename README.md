# Scrabble-Word-Suggestor

Objective: Construct a basic SCRABBLE simulation for the first move that a player makes

Problem Statement: Given a rack of 7 tiles, generate the valid words that can be formed from them and arrange them in decreasing order of their scores.

Assumptions:
Each letter of the English Alphabet is assigned a numeric score

Algorithm:

Step 1: Generate the valid anagrams of all the words in the sowpods word list

Step 2: Write a function that calculates the score of a given word (Score= Sum of the score of each letter of the word)

Step 3: Accept a rack of letters from the user

Step 4: Generate all possible combinations of the rack recursively

Step 5: Access the anagrams of the combinations generated

Step 6: Compute the score of the set of anagrams 

Step 7: Put the word with the score in a data structure

Step 8: Sort the data structure based on the value of the score of each word

Step 9: Print the contents of the data structure

