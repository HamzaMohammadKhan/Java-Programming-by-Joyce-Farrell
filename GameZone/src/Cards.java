public class Cards {
    private char spades = 's';
    private char hearts = 'h';
    private char diamond = 'd';
    private char clubs = 'c';
    private int value;

    char getSpades(){
        return spades;
    }
    void setSpades(char sp){
        spades = sp;
    }
    char getHearts(){
        return hearts;
    }
    void setHearts(char he){
        hearts = he;
    }
    char getDiamond(){
        return diamond;
    }
    void setDiamond(char di){
        diamond  = di;
    }
    char getClubs(){
        return clubs;
    }
    void setClubs(char cu){
        clubs = cu;
    }
}
