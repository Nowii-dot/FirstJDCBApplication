package pl.air.sebastian.nowak;

import pl.air.sebastian.nowak.db.DatabaseService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String user = "root";
        String password = "...";
        String host = "127.0.0.1";
        String database = "MYSQL";
        DatabaseService srv = new DatabaseService(user,password,host,database);

    }
}