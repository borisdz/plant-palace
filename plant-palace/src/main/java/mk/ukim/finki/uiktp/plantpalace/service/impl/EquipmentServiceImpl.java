package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.model.Equipment;
import mk.ukim.finki.uiktp.plantpalace.model.dto.EquipmentDto;
import mk.ukim.finki.uiktp.plantpalace.repository.EquipmentRepository;
import mk.ukim.finki.uiktp.plantpalace.service.EquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    private final EquipmentRepository equipmentRepository;

    public EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    // TODO: Implement add Equipment (?)
    @Override
    public Optional<Equipment> addEquipment(EquipmentDto equipmentDto) {
//        Equipment equipment = new Equipment();
//        equipment.set
        return Optional.empty();
    }

    @Override
    public List<Equipment> findAll() {
        return this.equipmentRepository.findAll();
    }

    @Override
    public Optional<Equipment> findById(Long id) {
        return this.equipmentRepository.findById(id);
    }

    // TODO: implement edit Equipment
    @Override
    public Optional<Equipment> edit(Long id, EquipmentDto equipmentDto) {

        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        this.delete(id);
    }
}
