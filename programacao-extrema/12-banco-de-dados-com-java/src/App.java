import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        final String user = "postgres";
        final String password = "docker";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String dbDriver = "org.postgresql.Driver";
        final String insertQuery = "INSERT INTO person (name) VALUES(?)";

        try {
            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "Ai jesus");
            preparedStatement.executeUpdate();

            System.out.println("Conexão realizada com sucesso");
            System.out.println("insert feio com sucesso");
            System.out.println("Fechan a conexão");

            connection.close();
        } catch (Exception e) {
            System.out.println("Deu Ruim!");
            System.out.println(e);
        }
    }
}
