package mk.ukim.finki.uiktp.plantpalace.service.impl;

import mk.ukim.finki.uiktp.plantpalace.repository.EquipmentCatRepository;
import mk.ukim.finki.uiktp.plantpalace.service.EquipmentCatService;
import org.springframework.stereotype.Service;

@Service
public class EquipmentCatServiceImpl implements EquipmentCatService {
    private final EquipmentCatRepository equipmentCatRepository;

    public EquipmentCatServiceImpl(EquipmentCatRepository equipmentCatRepository) {
        this.equipmentCatRepository = equipmentCatRepository;
    }
}
