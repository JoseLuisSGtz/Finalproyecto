import java.util.*;
import javax.swing.*;
import java.io.*;
public class rsalas {
     public ArrayList<mueble> objmue;
    
    // Contructor
    public rsalas() {
        objmue = new ArrayList<mueble>();
        
    }
    
    // Métodos de manejo del ArrayList
    public void agregar(mueble al) {
        objmue.add(al);
    }
    
    public void borrar(mueble al) {
        objmue.remove(al);
    }
    
    public mueble obtener(int pos) {
        return objmue.get(pos);
    }
    
    public mueble buscar(String cantidad) {
        for (int i = 0; i < objmue.size(); i++) {
            if(cantidad.equals(objmue.get(i).getCantidad()))
                return objmue.get(i);
        }
        return null;
    }
    
    public int numElementos() {
        return objmue.size();
    }
    
    public void leerDatos() {
        cargar();
    }
    
    
    
    // Cargar lista de alumnos
    private void cargar() {
        try {
            
            File archivo = new File("salas.txt");
            // Si el archivo existe
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("salas.txt"));
                String linea;
                
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    int cantidad = Integer.parseInt(st.nextToken().trim());
                    String tpsala = st.nextToken().trim();
                    String material = st.nextToken().trim();
                    int mano = Integer.parseInt(st.nextToken().trim());
                    mueble al = new mueble (cantidad, tpsala, material, mano);
                    agregar(al);
                }
                       
                
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }   
    }
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("salas.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getCantidad()+","+obtener(i).getTpsala()+","+
                        obtener(i).getMaterial()+","+obtener(i).getMano());
                pw.close();
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }

    }
}
