package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
public class CarsController {

    private CarService service = new CarService();


    @GetMapping("/cars")
    public String getCars(ModelMap map, @RequestParam(required = false) Integer count) {
        if (count != null) {
            map.addAttribute("cars", service.getCar(count));

        } else {
            map.addAttribute("cars", service.getAllCars());
        }
        return "cars";
    }

}
