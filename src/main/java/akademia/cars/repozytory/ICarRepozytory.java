
package akademia.cars.repozytory;
import akademia.cars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepozytory  extends JpaRepository<Car,Long> {
   // List<Car> findAll();
}
