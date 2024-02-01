/*
 * Build an array or ArrayList of several languages objects and loop through them to call getInfo().
 
 * Create several more language family classes that pertain to languages you’re interested in.
 * Map out the sign language families.
 * Add in further linguistic features (e.g., which genders are used, whether the language is tonal, etc.).
 */

import java.util.ArrayList;

public class Language {

    protected String name;
    protected double numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
 
    Language (String languageName, double speakers, String regions, String order) {
        this.name = languageName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = order;
    }

    public String getInfo() {
       return this.name + " is spoken by " + this.numSpeakers + " billion people mainly in " + this.regionsSpoken + ". " +   
       "\nThe lenguage follows the word order: " + this.wordOrder + "\n";
    }

    //  Add new methods that allow users to set a specific region, change the number of speakers, or modify the word order.
    public void setRegion (String newRegion) {
        this.regionsSpoken = newRegion;
    }

    public void setNumSpeakers (double newSpeakers) {
        this.numSpeakers = newSpeakers;
    }

    public void setWordOrder (String newWordOrder) {
        this.wordOrder = newWordOrder;
    }

    public static void displayLanguageInfo () {
        ArrayList<Language> languages = new ArrayList<Language>();
                
        Mayan tzotzil = new Mayan("Tzotzil", 550.270);
        languages.add(tzotzil);
        SinoTibetan chinese = new SinoTibetan("Chinese", 1.35);
        languages.add(chinese);
        SinoTibetan nonChinese = new SinoTibetan("Tibetic", 1.3);
        languages.add(nonChinese);
        IndoEuropean spanish = new IndoEuropean("Spanish", 4.5);
        languages.add(spanish);
        
        for (Language language : languages) {
            System.out.println(language.getInfo());
        }
    }

    public static void main (String[] args) {
        displayLanguageInfo();
    }
}
