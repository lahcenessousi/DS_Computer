package net.tp3.computerlahcen.mapper;

import net.tp3.computerlahcen.dao.Entities.Computer;
import net.tp3.computerlahcen.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return mapper.map(computerDto, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDto.class);
    }


}


