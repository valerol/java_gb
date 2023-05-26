package Lesson.Final;
import Lesson.Final.Note;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    { 
        Main task = new Main();
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("4", "13", "blue", "Linux"));
        notes.add(new Note("8", "16", "grey", "Windows"));
        notes.add(new Note("8", "15", "white", "MacOS"));
        HashMap<String, String> searchCriteria = task.inputSearchCriteria();
        ArrayList<Note> result = task.FilterNotes(notes, searchCriteria);

        //System.out.println(result);
        System.out.println("We found: ");
        for (Note note : result) {
            System.out.println("ram: " + note.ram);
            System.out.println("color: " + note.color);
            System.out.println("os: " + note.os);
            System.out.println("display: " + note.display);
            System.out.println("======");
        }
    }
 
    public HashMap<String, String> inputSearchCriteria() 
    {
        HashMap<String, String> searchCriteria = new HashMap<String, String>();
        searchCriteria.put("ram", "");
        searchCriteria.put("display", "");
        searchCriteria.put("color", "");
        searchCriteria.put("os", "");

        Scanner in = new Scanner(System.in);
        for (String key : searchCriteria.keySet()) {
            System.out.println(key + ": ");
            searchCriteria.put(key, in.next());
        }
        in.close();

        return searchCriteria;
    }

    public ArrayList<Note> FilterNotes(ArrayList<Note> notes, HashMap<String, String> searchCriteria) 
    {
        ArrayList<Note> notesFiltered = new ArrayList<>();

        for (String key : searchCriteria.keySet()) {
            for (Note note : notes) {
                if (note.getProp(key).equals(searchCriteria.get(key))) {
                    notesFiltered.add(note);
                }
            }
        }

        return notesFiltered;
    }
}
