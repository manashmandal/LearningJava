package com.company;


import com.sun.xml.internal.fastinfoset.stax.util.StAXParserWrapper;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Manash on 6/29/2016.
 */
public class Parentheses extends Stack {
    private String expression;

    private boolean isLeft(char in){
        return (in == '(' || in == '[' || in == '{');
    }

    private Character conjugate(char in){
        switch (in){
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
        }
        return null;
    }

    private Stack <Character> expressionStack;

    public Parentheses(String expression){
        this.expression = expression;
        expressionStack = new Stack<>();
    }

    public boolean scan(){
        for (int i = 0; i < expression.length(); i++){
            if (isLeft(expression.charAt(i))){
                StdOut.println("Pushed: " + expression.charAt(i));
                expressionStack.push(expression.charAt(i));
            } else evaluate(i);
        }
        return expressionStack.size() == 0;
    }

    private void evaluate(int index){
        if (conjugate(expression.charAt(index)) == expressionStack.peek()) expressionStack.pop();
    }

}