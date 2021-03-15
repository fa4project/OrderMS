package com.infosys.fa4project.Order.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.fa4project.Order.entity.ProductsOrdered;
import com.infosys.fa4project.Order.entity.ProductsOrderedPk;

@Repository
public interface ProductsOrderedRepository extends JpaRepository<ProductsOrdered, ProductsOrderedPk> {
	public List<ProductsOrdered> findByProductsOrderedPkProdId(Integer prodId);
}
