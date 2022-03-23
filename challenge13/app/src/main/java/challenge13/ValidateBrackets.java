package challenge13;

import java.util.*;

public class ValidateBrackets {

    public boolean isValidateBrackets(String brackets){
        Stack<String>stack=new Stack<>();
         String temp;
        String[] characterArrayList= brackets.split("");
        for (String s : characterArrayList) {
            if (Objects.equals(s, "{") || Objects.equals(s, "[") || Objects.equals(s, "(")) {
                stack.push(s);
            }
            if(stack.isEmpty()){
                return false;
            }
            switch (s){
                case "}":
                    temp=stack.pop();
                    if(Objects.equals(temp, "(") || Objects.equals(temp, "[")){
                        return false;
                    }
                    break;
                case "]":
                    temp=stack.pop();
                    if(Objects.equals(temp, "(") || Objects.equals(temp, "{")){
                        return false;
                    }
                    break;
                case ")":
                    temp=stack.pop();
                    if(Objects.equals(temp, "{") || Objects.equals(temp, "[")){
                        return false;
                    }
                    break;
            }
        }


        return stack.isEmpty();
    }


}
