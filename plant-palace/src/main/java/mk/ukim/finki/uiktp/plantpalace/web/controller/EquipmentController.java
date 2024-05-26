package mk.ukim.finki.uiktp.plantpalace.web.controller;

import mk.ukim.finki.uiktp.plantpalace.model.Equipment;
import mk.ukim.finki.uiktp.plantpalace.model.dto.EquipmentDto;
import mk.ukim.finki.uiktp.plantpalace.service.EquipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("https://localhost:4200")
@RequestMapping("/equipment")
public class EquipmentController {
    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping
    public ResponseEntity<List<Equipment>> showAllEquipment(){
        List<Equipment>equipment = this.equipmentService.findAll();
        if(!equipment.isEmpty()){
            return ResponseEntity.ok(equipment);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/add")
    public ResponseEntity<Equipment> save(@RequestBody EquipmentDto equipmentDto){
        return this.equipmentService.addEquipment(equipmentDto)
                .map(equipment -> ResponseEntity.ok().body(equipment))
                .orElseGet(()->ResponseEntity.badRequest().build());
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<Equipment> save(@PathVariable Long id, @RequestBody EquipmentDto equipmentDto){
        return this.equipmentService.edit(id,equipmentDto)
                .map(equipment -> ResponseEntity.ok().body(equipment))
                .orElseGet(()->ResponseEntity.badRequest().build());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id){
        this.equipmentService.delete(id);
        if(this.equipmentService.findById(id).isEmpty()) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
