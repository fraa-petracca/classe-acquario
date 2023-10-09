public class Pesce {

    private String nome;
    private String specie;

    private boolean vivo;

    public Pesce(String nome, String specie, boolean vivo){
        this.nome = nome;
        this.specie = specie;
        this.vivo = vivo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSpecie(){
        return this.specie;
    }

    public boolean getVivo(){
        return this.vivo;
    }

    public String setVivo(boolean v){
        String s;
        this.vivo = v;
        if(v == true){
            s = "Il pesce è vivo";
        } else {
            s = "Il pesce è morto, rip";
        }
        return s;
    }

    public Pesce clone(){
        return new Pesce(this.nome, this.specie, this.vivo);
    }

    public String toString(){
        String s = "";
        s = "{";
        s += "Nome del pesce: "+this.nome+"\n";
        s += "Specie del pesce: "+this.specie+"\n";
        s += "Il pesce è vivo: "+this.vivo+"}";
        return s;
    }
}
