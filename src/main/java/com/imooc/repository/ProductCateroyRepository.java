package com.imooc.repository;

import com.imooc.dataobject.ProductCategroy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCateroyRepository extends JpaRepository<ProductCategroy, Integer> {
    List<ProductCategroy> findByCategroyTypeIn(List<Integer> categroyTypeList);
}
