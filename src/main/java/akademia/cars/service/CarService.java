package akademia.cars.service;

import akademia.cars.model.Car;
import akademia.cars.repozytory.ICarRepozytory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private ICarRepozytory carRepozytory;

    //@Autowired adnotacja autowired jest nie wymagana
    public CarService(ICarRepozytory carRepozytory) {
        this.carRepozytory = carRepozytory;
    }

    public List<Car> getCars(){
        return this.carRepozytory.findAll();
    }
}
