package kodlama.io.rentacar.repository;

import kodlama.io.rentacar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    boolean existsByPlateIgnoreCase(String plate);

    List<Car> findAllByStateNot(int state);
}
