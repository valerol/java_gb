package Lesson.Final;
import java.util.ArrayList;
import java.util.List;

public class Note {

    public String ram;
    public String display;
    public String color;
    public String os;

    public Note(String ram, String display, String color, String os) {
        this.ram = ram;
        this.display = display;
        this.color = color;
        this.os = os;
    }

    public String getProp(String key)
    {
        switch(key) {
            case "ram":
                return this.ram;
            case "display":
                return this.display;
            case "color":
                return this.color;
            case "os":
                return this.os;
            default:
                return "";
        }
    }
}