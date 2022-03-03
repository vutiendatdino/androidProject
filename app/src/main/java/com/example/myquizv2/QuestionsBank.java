package com.example.myquizv2;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question2 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question3 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question4 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question5 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> pythonQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question2 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question3 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question4 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question5 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question2 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question3 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question4 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question5 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    private static List<QuestionsList> javaScriptQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question2 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question3 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question4 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");
        final QuestionsList question5 = new QuestionsList("what is the duck","Minh","Tuan","Hoang","Long","Minh","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "python":
                return  pythonQuestions();
            case "html":
                return  htmlQuestions();
            default:
                return  javaScriptQuestions();
        }
    }
}
