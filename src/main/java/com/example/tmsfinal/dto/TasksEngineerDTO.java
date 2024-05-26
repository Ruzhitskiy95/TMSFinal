package com.example.tmsfinal.dto;



import java.util.Date;

public class TasksEngineerDTO {

    private  String descriptions;

    private Date createdData;

    public TasksEngineerDTO(String descriptions, Date createdData) {
        this.descriptions = descriptions;
        this.createdData = createdData;
    }

    public TasksEngineerDTO() {
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Date getCreatedData() {
        return createdData;
    }

    public void setCreatedData(Date createdData) {
        this.createdData = createdData;
    }

    @Override
    public String toString() {
        return "TasksEngineerDTO{" +
                "descriptions='" + descriptions + '\'' +
                ", createdData=" + createdData +
                '}';
    }
}
