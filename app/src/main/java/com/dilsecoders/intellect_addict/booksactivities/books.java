package com.dilsecoders.intellect_addict.booksactivities;

public class books {
    int Image;
    String Name;

    public books(int image, String name) {
        Image = image;
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        this.Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
