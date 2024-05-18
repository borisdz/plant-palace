package mk.ukim.finki.uiktp.plantpalace.service;

import mk.ukim.finki.uiktp.plantpalace.model.Equipment;
import mk.ukim.finki.uiktp.plantpalace.model.dto.EquipmentDto;

import java.util.List;
import java.util.Optional;

public interface EquipmentService {
    Optional<Equipment> addEquipment(EquipmentDto equipmentDto);
    List<Equipment> findAll();
    Optional<Equipment> findById(Long id);
    Optional<Equipment> edit(Long id, EquipmentDto equipmentDto);
    void delete(Long id);
}
