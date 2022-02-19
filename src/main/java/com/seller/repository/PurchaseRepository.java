package com.seller.repository;

import com.seller.model.Purchase;
import com.seller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query("select "    +
            "d.name as name, d.deviceType as type, p.price as price, p.colour as colour, p.purchaseTime as puchaseTime  "   +
            "from Purchase p left join Device d on d.id = d.diveceId    "   +
            "where p.userId = :userId   "
    )
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);

}
