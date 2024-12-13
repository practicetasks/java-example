package task_tracker;

/**
 * Задача
 */
public class Task {
    private int id; // уникальный идентификатор
    private String name; // название задачи
    private String description; // описание задачи
    private String status; // статус "NEW", "IN_PROGRESS", "DONE"

    // При создании задачи указывает название и описание
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        // Статус по умолчанию при создании "NEW"
        this.status = "NEW";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
