package com.geekster.TodoProjectSample.objects;

public class TodoObjects {
    private Integer id;
    private String todoName;
    private Boolean istodoStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public Boolean getIstodoStatus() {
        return istodoStatus;
    }

    public void setIstodoStatus(Boolean istodoStatus) {
        this.istodoStatus = istodoStatus;
    }
}
