package project.PillMap.model;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "prescription_detail")
@Entity
public class PrescriptionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @ManyToOne
    private List<Prescription> prescriptions;

    @ManyToOne
    private List<Medication> medications;
}
