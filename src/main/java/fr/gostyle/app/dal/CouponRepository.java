package fr.gostyle.app.dal;

import fr.gostyle.app.domain.Coupon;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CouponRepository extends CrudRepository<Coupon, String> {

    List<Coupon> findByTitre(String titre);
}
