package org.example;

import java.util.Stack;

public class StackLearning {
    public static void main(String[] args) {
        String input1 = "({[]})";
        String input2 = "([{}])";
        String input3 = "({[})";
        String input4 = "(";

        Stack<Character> stack = new Stack<>();
        for (char c : input1.toCharArray()){
            if (c=='('||c=='{'||c=='['){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    System.out.println("invalid");
                }else {
                    char top = stack.pop();
                    if ((c==')'&&top!='(') || (c=='}'&&top!='{') ||(c==']'&&top!='[')){
                        System.out.println("invalid2");
                    }
                }
            }
        }
        System.out.println(input1);
    }
}
