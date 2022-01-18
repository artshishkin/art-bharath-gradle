package net.shyshkin.study.gradle.migration.repos;

import net.shyshkin.study.gradle.migration.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
