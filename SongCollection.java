package student;
/**
 ***********************************************************************
 * REVISION HISTORY (newest first)
 **********************************************************************
 *
 * 
 * 8/22/2018 - Cody Snow worked on SongCollection method
 * 2018 - Cody Snow and Jacob McIntire completed this class for CSCI 290
 * 2016 - Anne Applin - formatting and JavaDoc skeletons added   
 * 2015 - Prof. Bob Boothe - Starting code and main for testing  
 ************************************************************************
 * SongCollection.java 
 * Read the specified data file and build an array of songs.
 */

import java.util.*;
import java.io.*;

/**
 * The driver for the song database application.
 *
 * @author boothe
 */
public class SongCollection {

    private Song[] songs;

    /**
     * 
     * Note: in any other language, reading input inside a class is simply not
     * done!! No I/O inside classes because you would normally provide
     * precompiled classes and I/O is OS and Machine dependent and therefore not
     * portable. Java runs on a virtual machine that IS portable. So this is
     * permissable because we are programming in Java.
     *
     * @author codyssnow
     * 
     * @param filename The path and filename to the datafile that we are using
     * must be set in the Project Properties as an argument.
     */
    public SongCollection(String filename) {

	// use a try catch block
        // read in the song file and build the songs array
        // you must use a StringBuilder to read in the lyrics!
        // you must add the line feed at the end of each lyric line.
        
        
        // sort the songs array using Array.sort (see the Java API)
        
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File(filename));
            while (inputFile.hasNext()) {
               // read stuff
              
               // add song to songs array
            }
            inputFile.close();
        } catch (InputMismatchException e) {
            System.out.println("Probably using nextInt or nextDouble"
                    + " when the file input is not of that type.");
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Probably some problem with the input"
                    + " data file or the keyboard input.");
            System.out.println(e);
            e.printStackTrace();
        }        
    }
 
    /**
     * this is used as the data source for building other data structures
     * @return the songs array
     */
    public Song[] getAllSongs() {
        
        
        return songs;
    }
 
    /**
     * unit testing method
     * @param args
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("usage: prog songfile");
            return;
        }

        SongCollection sc = new SongCollection(args[0]);

        // todo: show song count and up to the first 10 songs 
        // (name & title only, 1 per line) 
    }
}
