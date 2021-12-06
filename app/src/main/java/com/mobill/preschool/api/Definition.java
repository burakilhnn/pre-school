package com.mobill.preschool.api;

import com.google.gson.annotations.SerializedName;

public class Definition {

    @SerializedName("type")
    public String type;

    @SerializedName("definition")
    public String definition;

    @SerializedName("example")
    public String example;

    @SerializedName("image_url")
    public String image_url;

    @SerializedName("emoji")
    public String emoji;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
}
