package com.github.adminfaces.showcase.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import com.github.adminfaces.showcase.model.Car;
import com.github.adminfaces.showcase.service.CarService;

 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private List<Car> cars;
     
    private CarService service;
 
    @PostConstruct
    public void init() {
    	service  =  new CarService() ; 
        cars = service.createCars(10);
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
}
