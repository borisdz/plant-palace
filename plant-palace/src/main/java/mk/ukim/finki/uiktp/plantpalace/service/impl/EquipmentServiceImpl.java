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

    @Override
    public Optional<Equipment> addEquipment(EquipmentDto equipmentDto) {
        Equipment equipment = new Equipment();
        equipment.setName(equipmentDto.getName());
        equipment.setDescription(equipmentDto.getDescription());
        equipment.setDiscount(equipmentDto.getDiscount());
        equipment.setPrice(equipmentDto.getPrice());
        equipment.setQuantity(equipmentDto.getQuantity());
        equipment.setTotalPrice(equipmentDto.getTotalPrice());
        equipment.setFileExtension(equipmentDto.getFileExtension());
        equipment.setFilePath(equipmentDto.getFilePath());
        equipment.setSlug(equipmentDto.getSlug());
        equipment.setCategory(equipmentDto.getCategory());
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

    @Override
    public Optional<Equipment> edit(Long id, EquipmentDto equipmentDto) {
        Equipment eq = this.equipmentRepository.findById(id).get();
        eq.setName(equipmentDto.getName());
        eq.setDescription(equipmentDto.getDescription());
        eq.setDiscount(equipmentDto.getDiscount());
        eq.setPrice(equipmentDto.getPrice());
        eq.setQuantity(equipmentDto.getQuantity());
        eq.setTotalPrice(equipmentDto.getTotalPrice());
        eq.setFileExtension(equipmentDto.getFileExtension());
        eq.setFilePath(equipmentDto.getFilePath());
        eq.setSlug(equipmentDto.getSlug());
        eq.setCategory(equipmentDto.getCategory());
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {
        this.delete(id);
    }
}
