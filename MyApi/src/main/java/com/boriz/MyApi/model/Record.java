package com.boriz.MyApi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String Title;
     private String Artist;
     private String RealeaseDate;
     private String Format;
     private String Label;
     private String Gane;

    public Record() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getRealeaseDate() {
        return RealeaseDate;
    }

    public void setRealeaseDate(String realeaseDate) {
        RealeaseDate = realeaseDate;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getGane() {
        return Gane;
    }

    public void setGane(String gane) {
        Gane = gane;
    }
}
