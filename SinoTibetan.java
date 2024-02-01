class SinoTibetan extends Language {
    
    SinoTibetan(String languageName, double speakers) {

        super(languageName, speakers, "Asia", "subject-object-verb");

        if (languageName.contains("Chinese")) {            
            this.wordOrder = "subject-verb-object";
        }
    }
}
