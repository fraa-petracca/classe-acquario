public class Acquario {

    private Pesce[] pesci;
    private double capienza;

    public Acquario(Pesce[] pesci, double capienza){
        Pesce[] array = new Pesce[pesci.length];
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                this.pesci[i] = array[i].clone();
            }
        }
        this.capienza = capienza;
    }

    private Pesce[] getPesci(){
        return this.pesci;
    }

    private double getCapienza(){
        return this.capienza;
    }

    public String addPesce(Pesce nuovoPesce){

    }

    public String deletePesce(int scelta){

    }

    public String cercaPesce(String specie){

    }

    public String contaPesci(){

    }

    public Acquario clone(){

    }

    public String toString(){

    }
}
