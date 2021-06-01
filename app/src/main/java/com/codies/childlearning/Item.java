package com.codies.childlearning;

import android.graphics.drawable.Drawable;

public class Item {
    public String name;
    public Drawable image;

    public Item(String name, Drawable image) {
        this.image = image;
        this.name = name;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
