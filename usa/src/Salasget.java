public class Salasget {
int Nsala,Cantidad;
String Tipodesala,Material;
public Salasget(){
    
}
public Salasget(int Nsala, int Cantidad, String Tipodesala, String Material){
    this.Nsala=Nsala;
    this.Cantidad=Cantidad;
    this.Tipodesala=Tipodesala;
    this.Material=Material;
}

    public int getNsala() {
        return Nsala;
    }

    public void setNsala(int Nsala) {
        this.Nsala = Nsala;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTipodesala() {
        return Tipodesala;
    }

    public void setTipodesala(String Tipodesala) {
        this.Tipodesala = Tipodesala;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    String[] getRow(){
        String [] row = new String[4];
        row[0] = String.valueOf(Nsala);
        row[1] = String.valueOf(Cantidad);
        row[2] = Tipodesala;
        row[3] = Material;
        return row;
    }
}

