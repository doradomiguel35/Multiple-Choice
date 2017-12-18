package com.example.miguel.quiz;

/**
 * Created by Miguel on 12/18/2017.
 */

public class Question_Library {

    public String questions[]={
           "What's the fastest insect on Earth?",
            "What's the tallest skyscraper in the world?",
            "How many legs does a caterpillar had?"
    };

    public String choices[][]={
        {"Tiger Beetle","Praying Mantis","Cockroach"},
            {"Petronas Tower","Eiffel Tower","Burj Khalifa"},
                {"100","101","102"}
    };

    public String answers[]={"Tiger Beetle","Burj Khalifa","100"};

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice1 = choices[a][0];
        return choice1;
    }


    public String getChoice2(int a){
        String choice2 = choices[a][1];
        return choice2;
    }


    public String getChoice3(int a){
        String choice3 = choices[a][2];
        return choice3;
    }

    public String correctAns(int a) {
        String answer = answers[a];
        return answer;
    }

}
