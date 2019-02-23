package akademia.cars.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tCar")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand",nullable = false)
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "power")
    private String power;
}
