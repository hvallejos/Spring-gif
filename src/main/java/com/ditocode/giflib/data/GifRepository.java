package com.ditocode.giflib.data;

import com.ditocode.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hector on 15/10/16.
 */

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", 1,LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
            new Gif("ben-and-mike", 3,LocalDate.of(2015,10,30), "Ben Jakuben", true),
            new Gif("book-dominos", 2,LocalDate.of(2015,9,15), "Craig Dennis", false),
            new Gif("compiler-bot", 2,LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new Gif("cowboy-coder", 2,LocalDate.of(2015,2,13), "Grace Hopper", false),
            new Gif("infinite-andrew", 3,LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    public Gif findByName(String name){
        for(Gif gif: ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return null;
    }
    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif: ALL_GIFS){
            if(gif.getCategoryId() == id){
                gifs.add(gif);
            }
        }
        return gifs;
    }
    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
