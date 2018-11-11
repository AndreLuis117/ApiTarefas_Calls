import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TesteApi {
    //Retorna uma lista de tarefas
    @Headers("Student:1111008197")
    @GET("tasks")
    Call <List<Tarefas>> getTarefas();

    //Cadastra uma nova tarefa
    @Headers("Student:1111008197")
    @POST("tasks")
    Call<Tarefas> createTask(@Body Tarefas tarefas);

    //Retorna uma tarefa existente através do ID
    @Headers("Student:1111008197")
    @GET("tasks/{id}")
    Call <Tarefas> getById(@Path("id")long id);

    //Atualiza uma tarefa existente através do ID
    @Headers("Student:1111008197")
    @PUT("tasks/{id}")
    Call <Void> updateById(@Body Tarefas tarefas, @Path("id")long id);

    //Deleta um cliente específico através do ID
    @Headers("Student:1111008197")
    @DELETE("tasks/{id}")
    Call <Void> deleteById(@Path("id")long id);




}
