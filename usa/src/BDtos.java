import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDtos {

    public void agregarUsuario(Salasget user) {
        CBDPro conn = new CBDPro();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO tablasalas VALUES('" + user.Nsala + "', '" + user.Cantidad+ "', '" + user.Tipodesala+ "','"+ user.Material+"')";
            consulta.executeUpdate(sql);
            System.out.println("Usuario registrado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }

    public ArrayList<Salasget> obtenSget() {
        ArrayList<Salasget> Sget = new ArrayList<>();
        CBDPro conn = new CBDPro();
        String sql = "SELECT * FROM tablasalas";
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Salasget saget = new Salasget(rs.getInt("Nsala"),rs.getInt("Cantidad"), rs.getString("Tipo de sala"), rs.getString("Material") );
                Sget.add(saget);
            }
            rs.close();
            st.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return Sget;
    }
}
