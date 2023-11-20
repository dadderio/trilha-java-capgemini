package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;
import java.sql.ResultSet;

public class TaskController {

    public void save(Task task) {

        String sql = "INSERT INTO tasks ("
                + "idProject,"
                + "name,"
                + "description,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt)"
                +"VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa" + ex.getMessage(), ex);
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

    public void update(Task task) {

        String sql = "UPDATE tasks SET idProject = ?, name = ?, description = ?, notes = ?, completed = ?, deadline = ?, createdAt = ?, updatedAt = ? WHERE id = ? ";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //preparando a query:
            statement = connection.prepareStatement(sql);
            
            //setando os vales dos statements
            statement.setInt(1, task.getId());
            statement.setInt(2, task.getIdProject());
            statement.setString(3, task.getName());
            statement.setString(4, task.getDescription());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setString(6, task.getNotes());
            statement.setDate(7, new Date(task.getDeadline().getTime()));
            statement.setDate(8, new Date(task.getCreatedAt().getTime()));
            statement.setDate(9, new Date(task.getUpdatedAt().getTime()));
            
                        //executando a query:
            statement.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + ex.getMessage(), ex);
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

    public void removeById(int id){

        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Criaçao de conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //preparando a query:
            statement = connection.prepareStatement(sql);
            
            //setando os valores   ===> estava taskId
            statement.setInt(1, id);
            
            //executando a query
            statement.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage(), ex);
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

    public List<Task> getAll(int idProject) {
        
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        //Lista de tarefas que será devolvida quando a chamada do método acontecer tirei <Task>
        List<Task> tasks = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            //setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);
            
            //valor retornado pela execução da query
            resultSet = statement.executeQuery();
            
            
            //enquanto houver valores a serem percorridos no meu resultset
            while(resultSet.next()){
            
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir a tarefa" + ex.getMessage(), ex);
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
        return tasks;
    }

}
