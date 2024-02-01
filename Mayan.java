class Mayan extends Language {

    Mayan (String languageName, double speakers) {        
        super(languageName, speakers, "Central America", "verb-object-verb");
    }
    public String getInfo() {

        return this.name + " is spoken by " + this.numSpeakers + " billion people mainly in " + this.regionsSpoken + ". " +
       "\nThe lenguage follows the word order: " + this.wordOrder +
        "\nFun fact: " + this.name + " is an ergative language.\n";
    }
}