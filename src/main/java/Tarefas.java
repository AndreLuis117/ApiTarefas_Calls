public class Tarefas {

    private int id;
    private String description;
    private boolean done;

    @Override
    public String toString() {
        return "Tarefa [Id=" + id + ", Descrição=" + description + ", Concluída=" + done + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
