package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.City;
import mk.ukim.finki.uiktp.plantpalace.model.Product;
import mk.ukim.finki.uiktp.plantpalace.model.dto.CityDto;
import mk.ukim.finki.uiktp.plantpalace.model.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface CityService {
    Optional<City> add(CityDto cityDto);
    List<City> findAll();
    Optional<City> findById(Long id);
    Optional<City> edit(Long id, CityDto cityDto);
    void delete(Long id);
}
