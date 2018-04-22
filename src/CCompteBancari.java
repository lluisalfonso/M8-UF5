public class CCompteBancari {
        private int numCompte;
        CPersona propietari;
        private int saldo;
        
        private static int seguentCompte = 1234;
        private static int saldoInicial = 100;

    public CCompteBancari(CPersona propietari) {
        this.numCompte = seguentCompte;
        this.propietari = propietari;
        this.saldo = saldoInicial;
        seguentCompte++;
    }
    
    public CCompteBancari(CCompteBancari compteBancari) {
        compteBancari.propietari = propietari;
    }
    
    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public CPersona getPropietari() {
        return propietari;
    }

    public void setPropietari(CPersona propietari) {
        this.propietari = propietari;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static int getSeguentCompte() {
        return seguentCompte;
    }

    public static void setSeguentCompte(int seguentCompte) {
        CCompteBancari.seguentCompte = seguentCompte;
    }

    public static int getSaldoInicial() {
        return saldoInicial;
    }

    public static void setSaldoInicial(int saldoInicial) {
        CCompteBancari.saldoInicial = saldoInicial;
    }
    
    public static void modificarSaldoInicial(int saldoModificat) {
        CCompteBancari.saldoInicial = saldoModificat;
    }
    
    public int consultarSaldo() {
        return this.saldo;
    }
    
    public boolean numeroSecret(int numSecret) {
        if(numSecret == propietari.getnumSecret()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ingressar(int saldoIngressat, int numSecret) {
        if(numSecret == propietari.getnumSecret()) {
            this.saldo = this.saldo + saldoIngressat;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean extreure(int saldoExtret, int numSecret) {
        if(numSecret == propietari.getnumSecret()) {
            this.saldo = this.saldo - saldoExtret;
            return true;
        } else {
            return false;
        }
    }
    
    public void eliminar() {
        this.numCompte = 0;
        this.saldo = 0;
        this.propietari = null;
    }
        
}