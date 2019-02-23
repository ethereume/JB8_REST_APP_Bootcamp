package akademia.cars.controller;

import akademia.cars.model.Car;
import akademia.cars.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class CarController {

    @GetMapping("/cars")
    //@RequestMapping(value = "/cars",method = RequestMethod.GET) - state
    public List<Car> getCars(){
        return carService.getCars();
    }

    public CarController(CarService carService) {
        this.carService = carService;
    }

    private CarService carService;
}
