package com.example.designpatterns.practise;


//Adapter that allows covert character code into digital code
public class CodeAdapter extends DigitalCode {

    private CharacterCode characterCode;
    private final int ASCII_DIGIT_0 = 48;
    private final int ASCII_SMALL_A = 97;
    private final int ASCII_SMALL_J = 106;
    private final int ASCII_DISTANCE_SMALL_A_DIGIT_0 = ASCII_SMALL_A - ASCII_DIGIT_0;

    public CodeAdapter(CharacterCode characterCode) {
        this.characterCode = characterCode;
    }

    @Override
    public long getCode() {
        String codeToConvert = characterCode.getCode();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<codeToConvert.length(); i++){
            if(codeToConvert.charAt(i) >= ASCII_SMALL_A && codeToConvert.charAt(i) <= ASCII_SMALL_J){
                result.append(codeToConvert.charAt(i) - ASCII_DISTANCE_SMALL_A_DIGIT_0);
            }else{
                throw new IllegalArgumentException("Illegal character in code. Is: " + codeToConvert.charAt(i)
                                                    + ", should be: a-j character.");
            }
        }
        return Long.parseLong(result.toString());
    }
}
