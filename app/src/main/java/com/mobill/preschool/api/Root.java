package com.mobill.preschool.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Root {

    @SerializedName("definitions")
    public List<Definition> definitions;

    @SerializedName("word")
    public String word;

    @SerializedName("pronunciation")
    public String pronunciation;

    public List<Definition> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }
}
