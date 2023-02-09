package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService{
    private List <Car> carList;
    { carList = new ArrayList<>();
        carList.add(new Car("BMW",1,1959));
        carList.add(new Car("Volga",3,1980));
        carList.add(new Car("LADA",5,2010));
        carList.add(new Car("Toyota",6,2022));
        carList.add(new Car("Cherry",8,1989));
    }
    public List<Car> getCarList() {
        return carList;
    }


    @Override
    public List<Car> listUsers(int e) {
        if (e>0&&e<=5) {
           return carList.stream().limit(e).collect(Collectors.toList());
        } else {
         return   carList;
        }

    }
}
