package controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;
import java.sql.Date;



public class ProjectController {
    
    public void save (Project project){
        
        String sql = "INSERT INTO projects (name, description, createdAt,updatedAt) VALUES (?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto", ex);
        } finally {
              try {
            if(connection != null){
                connection.close();
            }
            
            if (statement != null){
                statement.close();
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao fechar a conexão com o banco de dados", ex);
        }

        }
    }
    
    public void update(Project project){
        
         String sql = "UPDATE projects SET name = ?, description = ?, createdAt = ?, updatedAt = ? WHERE id = ? ";
         
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //preparando a query:
            statement = connection.prepareStatement(sql);
            
            //setando os vales dos statements
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            
            statement.execute();
             } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o projeto", ex);
        } finally {
              try {
            if(connection != null){
                connection.close();
            }
            
            if (statement != null){
                statement.close();
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao fechar a conexão com o banco de dados", ex);
        }
            
        }
    }
    
    public void removeById(int idProject){

        String sql = "DELETE FROM projects WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //Criaçao de conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //preparando a query:
            statement = connection.prepareStatement(sql);
            
            //setando os valores   ===> estava taskId em task
            statement.setInt(1, idProject);
            
            //executando a query
            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar o projeto" + ex.getMessage(), ex);
        } finally {
              try {
            if(connection != null){
                connection.close();
            }
            
            if (statement != null){
                statement.close();
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao fechar a conexão com o banco de dados", ex);
        }

        }
        
    }
    
      public List<Project> getAll() {
        
        String sql = "SELECT * FROM projects";
        
        //Lista de tarefas que será devolvida quando a chamada do método acontecer
        List<Project> projects = new ArrayList<>();
        
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        
        ResultSet resultSet = null;
        
        
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
                        
            //valor retornado pela execução da query
            resultSet = statement.executeQuery();
            
            
            //enquanto houver valores a serem percorridos no meu resultset
            while(resultSet.next()){
            
                Project project = new Project();
                
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                //Adiciono o contato recuperado, a lista de contatos
                projects.add(project);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir o projeto", ex);
        } finally {
             try {
            if(connection != null){
                connection.close();
            }
            
            if (statement != null){
                statement.close();
            }
            if (resultSet != null){
                resultSet.close();
            }
            
            
        } catch (SQLException ex) {
            throw new RuntimeException ("Erro ao fechar a conexão com o banco de dados", ex);
        }
        }
       
        //lista de tarefas que foi criada e carregada do banco de dados
        return projects;
    }

    
}
