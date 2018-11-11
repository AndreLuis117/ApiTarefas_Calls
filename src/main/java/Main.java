import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;


public class Main {

    public static void main(String[] args ){
        Metodos metodos = new Metodos();

        Tarefas tarefa = new Tarefas();
        //tarefa.setDescription("Terminar trabalho POO");
        //tarefa.setDone(false);

        metodos.getAll();

        //metodos.cadastrarTarefa(tarefa);

        //metodos.getById(1423);

        //metodos.atualizarTarefa(tarefa, 1423);

        //metodos.deleteById(1323);








    }
    }
