package com.imooc.repository;

import com.imooc.dataobject.ProductCategroy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategroyRepositoryTest {
    @Autowired
    private ProductCateroyRepository repository;
    @Test
    public  void findOneTest(){
        ProductCategroy productCategroy=repository.findOne(1);
        System.out.println(productCategroy.toString());
    }
//    @Test
//    public  void createTest(){
//        ProductCategroy productCategroy=new ProductCategroy();
//        productCategroy.setCategroyId(2);
//        productCategroy.setCategroyName("刀具");
//        productCategroy.setCategroyType(3);
//        repository.save(productCategroy);
//    }
//    @Test
//    public void updateTest(){
//        ProductCategroy productCategroy=new ProductCategroy();
//        productCategroy.setCategroyId(2);
//        productCategroy.setCategroyName("刀具2");
//        productCategroy.setCategroyType(3);
//        repository.save(productCategroy);
//    }
    @Test
    @Transactional
    public  void addTest(){
        ProductCategroy productCategroy=new ProductCategroy("刀具3",4);
        ProductCategroy Result=repository.save(productCategroy);
//        Assert.assertNotEquals(null,Result);
        Assert.assertNotNull(Result);

    }
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategroy> result = repository.findByCategroyTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}