package conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    public static void inserirCarro(Carro carro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexaoBD.conectar();
            String sql = "INSERT INTO carros (marca, modelo, ano, cor, placa) VALUES (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setInt(3, carro.getAno());
            stmt.setString(4, carro.getCor());
            stmt.setString(5, carro.getPlaca());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoBD.fecharConexao(conn, stmt, null);
        }
    }

    public static List<Carro> listarCarros() {
        List<Carro> carros = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = ConexaoBD.conectar();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM carros";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Carro carro = new Carro(rs.getString("marca"), rs.getString("modelo"),
                                        rs.getInt("ano"), rs.getString("cor"),
                                        rs.getString("placa"));
                carros.add(carro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoBD.fecharConexao(conn, stmt, rs);
        }
        return carros;
    }

    
}
