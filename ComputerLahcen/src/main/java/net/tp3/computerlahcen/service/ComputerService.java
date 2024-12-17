package net.tp3.computerlahcen.service;

import net.tp3.computerlahcen.dto.ComputerDto;
import java.util.List;

public interface ComputerService {

    ComputerDto saveComputer(ComputerDto computerDto);

    List<ComputerDto> getComputersByProcessor(String proce);


    List<ComputerDto> getComputersByPrice(int price);


}
