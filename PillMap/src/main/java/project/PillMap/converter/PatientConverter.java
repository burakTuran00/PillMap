package project.PillMap.converter;

import project.PillMap.dto.PatientDto;
import project.PillMap.entity.Patient;

public class PatientConverter {

    public PatientDto toDto(Patient entity){
        PatientDto dto = new PatientDto();

        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setGender(entity.getGender());
        dto.setMail(entity.getMail());
        dto.setPhone(entity.getPhone());
        dto.setBirthDate(entity.getBirthDate());
        dto.setAddress(entity.getAddress());
        dto.setCity(entity.getCity());
        dto.setSubCity(entity.getSubCity());

        return dto;
    }

    public Patient toEntity(PatientDto dto) {
        Patient entity = new Patient();

        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setMail(dto.getMail());
        entity.setPhone(dto.getPhone());
        entity.setGender(dto.getGender());
        entity.setBirthDate(dto.getBirthDate());
        entity.setAddress(dto.getAddress());
        entity.setCity(dto.getCity());
        entity.setSubCity(dto.getSubCity());

        return entity;
    }
}
