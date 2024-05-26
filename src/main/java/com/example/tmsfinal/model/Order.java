package com.example.tmsfinal.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "brand")
    private  String brand;

    @Column(name = "model")
    private  String model;

    @Column(name = "releasedatefrom")
    private  Integer releaseDateFrom;

    @Column(name = "releasedateto")
    private  Integer releaseDateTo;

    @Column(name = "enginecapacityfrom")
    private  Integer engineCapacityFrom;

    @Column(name = "enginecapacityto")
    private  Integer engineCapacityTo;

    @Column(name = "transmission")
    private  String transmission;

    @Column(name = "carbody")
    private  String carBody;

    @Column(name = "enginetype")
    private  String engineType;

    @Column(name = "pricefrom")
    private  Integer priceFrom;

    @Column(name = "priceto")
    private  Integer priceTo;

    @Column(name = "createddate")
    private Date createdData;

    @Column(name = "acceptdate")
    private Date acceptDate;

    @Column(name = "closedate")
    private Date closeDate;

    @Column(name = "status")
    private  String status;


//    private Integer maxId;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Users users;


    public Order() {
    }

    public Order(Integer id, String brand, String model, Integer releaseDateFrom, Integer releaseDateTo, Integer engineCapacityFrom, Integer engineCapacityTo, String transmission, String carBody, String engineType, Integer priceFrom, Integer priceTo, Date createdData, Date acceptDate, Date closeDate, String status, Users users) {
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
        this.acceptDate = acceptDate;
        this.closeDate = closeDate;
        this.status = status;
        this.users = users;
    }

    public Order(Integer id, String brand, String model, Integer releaseDateFrom, Integer releaseDateTo, Integer engineCapacityFrom, Integer engineCapacityTo, String transmission, String carBody, String engineType, Integer priceFrom, Integer priceTo, Date createdData, Date acceptDate, Date closeDate, String status) {
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
        this.acceptDate = acceptDate;
        this.closeDate = closeDate;
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

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Order{" +
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
                ", acceptDate=" + acceptDate +
                ", closeDate=" + closeDate +
                ", status='" + status + '\'' +
//                ", users=" + users +
                '}';
    }
}
