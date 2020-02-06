package com.db;

import com.model.Application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB {
    private final static String url = "jdbc:postgresql://localhost:5432/";
    private final static String user = "postgres";
    private final static String password = "123";

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }

    public boolean addApplication(Application application) {
        String SQL = "insert into applications (full_name, email, course, is_online) values (?,?,?,?)";
        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setString(1, application.getFullName());
            statement.setString(2, application.getEmail());
            statement.setString(3, application.getCourse());
            statement.setBoolean(4, application.getIsOnline());
            statement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Application> getAll() {
        String SQL = "select * from applications";
        List<Application> result = new ArrayList<>();
        try(Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL)){

            while(rs.next()) {
                Application application = new Application();
                application.setId(rs.getInt("id"));
                application.setFullName(rs.getString("full_name"));
                application.setCourse(rs.getString("course"));
                application.setIsOnline(rs.getBoolean("is_online"));
                application.setEmail(rs.getString("email"));
                result.add(application);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }



}
