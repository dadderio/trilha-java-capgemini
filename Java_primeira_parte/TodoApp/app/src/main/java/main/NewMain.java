
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;




public class NewMain {

 
    public static void main(String[] args) {
      
//        ProjectController projectController = new ProjectController();
//        
//        Project project = new Project();
////        project.setName("Projeto teste");
////        project.setDescription("description");
////        projectController.save(project);
////        
////        
////        project.setName("Novo nome de projeto");
////        projectController.update(project);
////        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = "+ projects.size());
//        
////        project.setId(6);
////        project.setName("novo nome");
////        project.setDescription("nova descrição");
////        projectController.update(project);
////        
//        project.setId(9);
//        project.setName("novo nome2");
//        project.setDescription("nova descrição2");
//        projectController.update(project);
//        
//        projectController.removeById(9);
//        
//        project.setName("Renato");
//        project.setDescription("12 anos");
//        projectController.save(project);
        
        TaskController taskController = new TaskController();
        
        Task task = new Task();
//        task.setIdProject(2);
//        task.setName("Criar as telas da aplicação");
//        task.setDescription("Devem ser criadas as telas para os cadastros");
//        task.setNotes("sem notas");
//        task.setIsCompleted(false);
//        task.setDeadline(new Date());
//        
//        taskController.save(task);
//        
//        task.setName("Alterar telas da aplicação");
//        taskController.update(task);
        
        List<Task> tasks = taskController.getAll(2);
        System.out.println("Total de tarefas: "+ tasks.size());
        
//        taskController.removeById(1);
//        taskController.removeById(2);
//        taskController.removeById(3);
//        taskController.removeById(4);
//        taskController.removeById(5);
        
        
        task.setId(16);
        task.setName("sra. teste");
        task.setDescription("testando");
        taskController.update(task);
        
    }
    
}
