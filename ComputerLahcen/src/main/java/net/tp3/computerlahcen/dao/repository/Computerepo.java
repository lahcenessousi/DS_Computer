package net.tp3.computerlahcen.dao.repository;

import net.tp3.computerlahcen.dao.Entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Computerepo extends JpaRepository<Computer, Integer> {

    List<Computer> findByProce(String proce);

    List<Computer> findByPrice(int price);

}
