package main;

import controller.ProjectController;
import java.sql.Connection;
import model.Project;
import util.ConnectionFactory;

public class Main {

    public static void main(String[] args) {
        
        Connection c = ConnectionFactory.getConnection();
        
        ConnectionFactory.closeConnection(c);
        
      
    }
    
    
    
}
