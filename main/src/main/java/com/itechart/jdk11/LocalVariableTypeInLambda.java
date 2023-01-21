package com.itechart.jdk11;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableTypeInLambda {

    public void localVariableTypeInLambda(List<VeryLongClassNameWhereVarWillBeUseful> sentenceWords) {
        String sentence = sentenceWords.stream()
                .map((@Nonnull var word) -> word.getText())
                .collect(Collectors.joining(" "));
    }

    private static class VeryLongClassNameWhereVarWillBeUseful {
        private final String text;

        public VeryLongClassNameWhereVarWillBeUseful(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
