package fr.gostyle.app.dal;

import fr.gostyle.app.domain.Coupon;
import fr.gostyle.app.domain.User;
import fr.gostyle.app.domain.User_coupon;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface User_couponRepository extends CrudRepository<User_coupon, Long> {
    User_coupon findByUser (User user);
    User_coupon findByCoupon (Coupon coupon);
}

