package java_jdbc_manipulation.src;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class ClienteDAOImpl implements ClienteDAO{
    @Override
    public Connection connect(String urlConexao) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(urlConexao);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    @Override
    public void createTable(String urlConexao) {
        Connection conn = connect(urlConexao);
        Statement statement = null;
        StringBuffer sql = new StringBuffer();
        sql.append("CREATE TABLE IF NOT EXISTS cliente (");
        sql.append("id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, ");
        sql.append("nome varchar(255) NOT NULL, ");
        sql.append("idade INTEGER NOT NULL, ");
        sql.append("cpf varchar(14) NOT NULL, ");
        sql.append("rg varchar(14) NOT NULL");
        sql.append(");");

        try {
            statement = conn.createStatement();
            statement.execute(sql.toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(statement != null)
                    statement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    @Override
    public void insert(String urlConexao, Cliente cliente) {
        Connection conn = connect(urlConexao);
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO cliente (nome, idade, cpf, rg) values (?, ?, ?, ?);";

        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setInt(2, cliente.getIdade());
            preparedStatement.setString(3, cliente.getCpf());
            preparedStatement.setString(4, cliente.getRg());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void selectAll(String urlConexao) {
        Connection conn = connect(urlConexao);
        String sql = "SELECT * FROM cliente;";
        Statement statement = null;

        try {
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                System.out.println("ID = " + resultSet.getInt("id") +
                        ", NOME = " + resultSet.getString("nome") +
                        ", IDADE = " + resultSet.getInt("idade") +
                        ", CPF = " + resultSet.getString("cpf") +
                        ", RG = " + resultSet.getString("rg")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(statement != null)
                    statement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void update(String urlConexao, int id, String name, Integer idade) {
        Connection conn = connect(urlConexao);
        String sql = "UPDATE cliente SET nome = ?, " + "idade = ? " + "WHERE id = ?;";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, idade);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public void delete(String urlConexao, int id) {
        Connection conn = connect(urlConexao);
        String sql = "DELETE FROM cliente WHERE " + "id = ?;";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(conn != null)
                    conn.close();
                if(preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
