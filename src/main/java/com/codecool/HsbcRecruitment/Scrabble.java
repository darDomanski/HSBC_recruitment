package com.codecool.HsbcRecruitment;

import java.util.*;

public class Scrabble {
    private String aWord;
    private Map<Set<Character>, Integer> scores;

    public Scrabble(String aWord) {
        this.aWord = aWord.toUpperCase();
        this.scores = new HashMap<Set<Character>, Integer>();

        initializeScores();

    }

    private void initializeScores() {
        Set<Character> charactersScoredOne = new HashSet<Character>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'));
        Set<Character> charactersScoredTwo = new HashSet<Character>(Arrays.asList('D', 'G'));
        Set<Character> charactersScoredThree = new HashSet<Character>(Arrays.asList('B', 'C', 'M', 'P'));
        Set<Character> charactersScoredFour = new HashSet<Character>(Arrays.asList('F', 'H', 'V', 'W', 'Y'));
        Set<Character> charactersScoredFive = new HashSet<Character>(Arrays.asList('K'));
        Set<Character> charactersScoredEight = new HashSet<Character>(Arrays.asList('J', 'X'));
        Set<Character> charactersScoredTen = new HashSet<Character>(Arrays.asList('Q', 'Z'));

        scores.put(charactersScoredOne, 1);
        scores.put(charactersScoredTwo, 2);
        scores.put(charactersScoredThree, 3);
        scores.put(charactersScoredFour, 4);
        scores.put(charactersScoredFive, 5);
        scores.put(charactersScoredEight, 8);
        scores.put(charactersScoredTen, 10);
    }


    public int getScore() {
        int score = 0;

        for (int i = 0; i < aWord.length(); i++) {

            for (Set<Character> characters : scores.keySet()) {
                if (characters.contains(aWord.charAt(i))) {
                    score = score + (scores.get(characters));
                    break;
                }
            }
        }

        return score;
    }
}
