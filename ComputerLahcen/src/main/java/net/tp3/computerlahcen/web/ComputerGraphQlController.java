package net.tp3.computerlahcen.web;

import net.tp3.computerlahcen.dto.ComputerDto;
import net.tp3.computerlahcen.service.ComputerService;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class ComputerGraphQlController {


    private ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerDto) {
        return computerService.saveComputer(computerDto);
    }

    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce) {
        return computerService.getComputersByProcessor(proce);
    }

    @QueryMapping
    public List<ComputerDto> getComputersByPrice(@Argument int price) {
        return computerService.getComputersByPrice(price);
    }

}
