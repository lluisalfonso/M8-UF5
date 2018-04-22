public class CPersona {
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private int numSecret;

    public CPersona(String nom, String primerCognom, String segonCognom, int numSecret) {
        this.nom = nom;
        this.primerCognom = primerCognom;
        this.segonCognom = segonCognom;
        this.numSecret = numSecret;  
    }
    
    public CPersona(){
        this.nom = "";
        this.primerCognom = "";
        this.segonCognom = "";
        this.numSecret = 0;
    }
    
    public CPersona(CPersona persona){
        persona.nom = this.nom;
        persona.primerCognom = this.primerCognom;
        persona.segonCognom = this.segonCognom;
        persona.numSecret = this.numSecret;
    }
     
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getprimerCognom() {
        return primerCognom;
    }

    public void setprimerCognom(String primerCognom) {
        this.primerCognom = primerCognom;
    }

    public String getsegonCognom() {
        return segonCognom;
    }

    public void setsegonCognom(String segonCognom) {
        this.segonCognom = segonCognom;
    }

    public int getnumSecret() {
        return numSecret;
    }

    public void setnumSecret(int numSecret) {
        this.numSecret = numSecret;
    }  
}