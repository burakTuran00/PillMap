package project.PillMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import project.PillMap.model.Pharmacy;

import java.util.List;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
    Pharmacy getPharmacyById(int id);

    List<Pharmacy> findPharmaciesByNameLike(String name);
    List<Pharmacy> findPharmaciesByName(String name);

    List<Pharmacy> findPharmaciesByCityLike(String city);
    List<Pharmacy> findPharmaciesByCity(String city);

    List<Pharmacy> findBySubCityLike(String subCity);
    List<Pharmacy> findPharmaciesBySubCity(String subCity);

    List<Pharmacy> findPharmaciesByCityAndOnDuty(String city, boolean onDuty);
    List<Pharmacy> findPharmaciesByAddressLike(String address);


    List<Pharmacy> findByCityLikeAndSubCityLikeAndAddressLike(String city, String subCity, @Nullable String address);
}
