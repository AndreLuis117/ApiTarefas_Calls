import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Metodos {


    //Método que retorna uma lista de atrefas
    public void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);


        try {
            Call<List<Tarefas>> call = api.getTarefas();

            Response<List<Tarefas>> r = call.execute();

            List<Tarefas> t = r.body();

            System.out.println(t);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //Método que cadastra uma nova tarefa
    public void cadastrarTarefa(Tarefas tarefa) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);


        try {

            Call<Tarefas> call = api.createTask(tarefa);

            Response<Tarefas> r = call.execute();

            Tarefas t = r.body();

            System.out.println(t);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    //Método que retorna uma tarefa existente através do ID
    public void getById(long id) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);


        try {
            Call<Tarefas> call = api.getById(id);

            Response<Tarefas> r = call.execute();

            Tarefas t = r.body();

            System.out.println(t);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //Método que atualiza uma trefa existe pelo ID
    public void atualizarTarefa(Tarefas tarefa, long id) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);


        try {
            Tarefas tarefas = new Tarefas();
            tarefas.setDescription("Estudar SOP");
            tarefas.setDone(true);

            Call <Void> call = api.updateById(tarefa, id);

            Response<Void> r = call.execute();

            if (r.isSuccessful()){
                System.out.println("Tarefa atualizada com sucesso!");
            }
            else {
                System.out.println("Não foi possível atualizar a tarefa, por favor tente novamente.");
            }





        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Método que deleta uma tarefa pelo ID
    public void deleteById(long id) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-35-166-113-35.us-west-2.compute.amazonaws.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TesteApi api = retrofit.create(TesteApi.class);


        try {

            Call <Void> call = api.deleteById(id);

            Response<Void> r = call.execute();

            if (r.isSuccessful()){
                System.out.println("Tarefa deletada com sucesso!");
            }
            else {
                System.out.println("Não foi possível deletar a tarefa, tente novamente.");
            }





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


