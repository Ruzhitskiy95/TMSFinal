package com.example.tmsfinal.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class OrderDTO {


    private Integer id;


    private  String brand;


    private  String model;


    private  Integer releaseDateFrom;


    private  Integer releaseDateTo;


    private  Integer engineCapacityFrom;


    private  Integer engineCapacityTo;


    private  String transmission;


    private  String carBody;


    private  String engineType;


    private  Integer priceFrom;


    private  Integer priceTo;


    private Date createdData;


    private  String status;


    public OrderDTO() {
    }

    public OrderDTO(Integer id, String brand, String model, Integer releaseDateFrom, Integer releaseDateTo, Integer engineCapacityFrom, Integer engineCapacityTo, String transmission, String carBody, String engineType, Integer priceFrom, Integer priceTo, Date createdData, String status) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.releaseDateFrom = releaseDateFrom;
        this.releaseDateTo = releaseDateTo;
        this.engineCapacityFrom = engineCapacityFrom;
        this.engineCapacityTo = engineCapacityTo;
        this.transmission = transmission;
        this.carBody = carBody;
        this.engineType = engineType;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.createdData = createdData;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getReleaseDateFrom() {
        return releaseDateFrom;
    }

    public void setReleaseDateFrom(Integer releaseDateFrom) {
        this.releaseDateFrom = releaseDateFrom;
    }

    public Integer getReleaseDateTo() {
        return releaseDateTo;
    }

    public void setReleaseDateTo(Integer releaseDateTo) {
        this.releaseDateTo = releaseDateTo;
    }

    public Integer getEngineCapacityFrom() {
        return engineCapacityFrom;
    }

    public void setEngineCapacityFrom(Integer engineCapacityFrom) {
        this.engineCapacityFrom = engineCapacityFrom;
    }

    public Integer getEngineCapacityTo() {
        return engineCapacityTo;
    }

    public void setEngineCapacityTo(Integer engineCapacityTo) {
        this.engineCapacityTo = engineCapacityTo;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Integer getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Integer priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Integer getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(Integer priceTo) {
        this.priceTo = priceTo;
    }

    public Date getCreatedData() {
        return createdData;
    }

    public void setCreatedData(Date createdData) {
        this.createdData = createdData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", releaseDateFrom=" + releaseDateFrom +
                ", releaseDateTo=" + releaseDateTo +
                ", engineCapacityFrom=" + engineCapacityFrom +
                ", engineCapacityTo=" + engineCapacityTo +
                ", transmission='" + transmission + '\'' +
                ", carBody='" + carBody + '\'' +
                ", engineType='" + engineType + '\'' +
                ", priceFrom=" + priceFrom +
                ", priceTo=" + priceTo +
                ", createdData=" + createdData +
                ", status='" + status + '\'' +
                '}';
    }
}
