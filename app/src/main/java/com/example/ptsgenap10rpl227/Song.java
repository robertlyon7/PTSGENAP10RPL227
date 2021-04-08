package com.example.ptsgenap10rpl227;

public class Song {
    private String songName;
    private String artistName;
    private Integer songImage;

    public Song(String songName, String artistName, Integer songImage) {
        this.songName = songName;
        this.artistName = artistName;
        this.songImage = songImage;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Integer getSongImage() {
        return songImage;
    }

    public void setSongImage(Integer songImage) {
        this.songImage = songImage;
    }
}
