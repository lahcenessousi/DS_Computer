package net.tp3.computerlahcen.dao.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private double price;
    private String macAddress;
}
