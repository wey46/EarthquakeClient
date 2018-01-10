
public class PhraseFilter implements Filter
{
    private String where;
    private String phrase;
    
    public PhraseFilter(String inputwhere, String inputphrase){
        where = inputwhere;
        phrase = inputphrase;
    }
    
    public boolean satisfies(QuakeEntry qe){
        String info = qe.getInfo();
        if (where.equals("start")){
            if (info.indexOf(phrase)==0) return true;
        } else if (where.equals("end")) {
            if (info.indexOf(phrase)==(info.length()-phrase.length())) return true;
        } else if (where.equals("any")){
            if (info.contains(phrase)) return true;
        }
        return false;
    }
    
    public String getName(){
        return "PhraseFilter";
    }
}
