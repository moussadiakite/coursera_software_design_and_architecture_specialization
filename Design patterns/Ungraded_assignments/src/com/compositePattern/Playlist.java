package com.compositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }

    @Override
    public void play() {
        System.out.println("------------------------------------------------");
        System.out.println("Playing playlist " + playlistName);
        System.out.println("------------------------------------------------");

        for(IComponent component: playlist)
        {
            component.play();
        }
        System.out.println("------------------------------------------------");
        System.out.println("playlist " + playlistName + " played");
        System.out.println("------------------------------------------------");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent component: playlist)
        {
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }
}