/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DARCKYACKGTZ
 */
public class mueble{

    private int cantidad;
    private Object tpsala;
    private Object material;
    private int mano;

    // Contructor clase
     mueble(int cantidad, Object tpsala,
           Object material, int mano) {
        this.cantidad = cantidad;
        this.tpsala = tpsala;
        this.material = material;
        this.mano = mano;
    }

 

// Métodos SET

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Object getTpsala() {
        return tpsala;
    }

    public void setTpsala(Object tpsala) {
        this.tpsala = tpsala;
    }

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

    public int getMano() {
        return mano;
    }

    public void setMano(int mano) {
        this.mano = mano;
    }
    
}
