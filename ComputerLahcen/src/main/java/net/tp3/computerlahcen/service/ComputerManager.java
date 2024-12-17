package net.tp3.computerlahcen.service;

import lombok.AllArgsConstructor;
import net.tp3.computerlahcen.dao.Entities.Computer;
import net.tp3.computerlahcen.dao.repository.Computerepo;
import net.tp3.computerlahcen.dto.ComputerDto;
import net.tp3.computerlahcen.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    @Autowired
    private Computerepo computerRepository;

    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        return computerMapper.fromComputerToComputerDto(computer);
    }

    @Override
    public List<ComputerDto> getComputersByProcessor(String proce) {
        return computerRepository.findByProce(proce)
                .stream()
                .map(computerMapper::fromComputerToComputerDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ComputerDto> getComputersByPrice(int price) {
        return computerRepository.findByPrice(price)
                .stream()
                .map(computerMapper::fromComputerToComputerDto)
                .collect(Collectors.toList());
    }


}
