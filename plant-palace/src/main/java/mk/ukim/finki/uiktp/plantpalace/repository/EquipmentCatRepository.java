package mk.ukim.finki.uiktp.plantpalace.repository;

import mk.ukim.finki.uiktp.plantpalace.model.EquipmentCategory;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentCatRepository extends JpaAttributeConverter<EquipmentCategory,Long> {
}
