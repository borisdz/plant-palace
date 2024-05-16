package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.City;
import mk.ukim.finki.uiktp.plantpalace.model.Order;
import mk.ukim.finki.uiktp.plantpalace.model.dto.CityDto;
import mk.ukim.finki.uiktp.plantpalace.repository.CityRepository;
import mk.ukim.finki.uiktp.plantpalace.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Optional<City> add(CityDto cityDto) {
        City city = new City();
        city.setName(cityDto.getName());
        return Optional.of(this.cityRepository.save(city));
    }

    @Override
    public List<City> findAll() {
        return this.cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return this.cityRepository.findById(id);
    }

    @Override
    public Optional<City> edit(Long id, CityDto cityDto) {
        City city = this.cityRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("City not found with id: " + id));
        city.setName(cityDto.getName());
        return Optional.of(this.cityRepository.save(city));
    }

    @Override
    public void delete(Long id) {
        this.cityRepository.deleteById(id);

    }
}
