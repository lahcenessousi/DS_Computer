package net.tp3.computerlahcen.dto;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComputerDto {
    private String proce;
    private String ram;
    private String hardDrive;
    private Double price;
    private String macAddress;
}