package com.example.designpatterns.practise;

public class Main {

    public static void main(String[] args) {
	    Code secretCode = new Code(224444444);
        DigitalCode digitalCode = new DigitalCode(324235435);
        CharacterCode characterCode = new CharacterCode("abcdefgh");

        checkCode(secretCode.getAccess(digitalCode.getCode()));

        //This won't work, because we have incompatible types
        //System.out.println(secretCode.getAccess(characterCode.getCode()));

        CodeAdapter codeAdapter = new CodeAdapter(characterCode);
        checkCode(secretCode.getAccess(codeAdapter.getCode()));

        //Correct codes
        digitalCode = new DigitalCode(224444444);
        characterCode = new CharacterCode("cceeeeeee");

        System.out.println();

        checkCode(secretCode.getAccess(digitalCode.getCode()));

        codeAdapter = new CodeAdapter(characterCode);
        checkCode(secretCode.getAccess(codeAdapter.getCode()));
        System.out.println(codeAdapter.getCode());

    }

    static void checkCode(boolean isCorrect){
        if(isCorrect){
            System.out.println("Code accepted :)");
        }else{
            System.out.println("Access denied...");
        }

    }
}
