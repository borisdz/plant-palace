package mk.ukim.finki.uiktp.plantpalace.web.controller;

import mk.ukim.finki.uiktp.plantpalace.model.City;
import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.CityDto;
import mk.ukim.finki.uiktp.plantpalace.model.dto.ProductDto;
import mk.ukim.finki.uiktp.plantpalace.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://localhost:4200")
@RequestMapping("/city")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping
    public ResponseEntity<List<City>> showAllCities() {
        List<City> cities = this.cityService.findAll();
        if (!cities.isEmpty()) {
            return ResponseEntity.ok(cities);
        }
        return ResponseEntity.notFound().build();
    }



    @PostMapping("/add")
    public ResponseEntity<City> save(@RequestBody CityDto cityDto) {
        return this.cityService.add(cityDto)
                .map(city -> ResponseEntity.ok().body(city))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<City> save(@PathVariable Long id, @RequestBody CityDto cityDto) {
        return this.cityService.edit(id, cityDto)
                .map(city -> ResponseEntity.ok().body(city))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        this.cityService.delete(id);
        if (this.cityService.findById(id).isEmpty())
            return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }
}
