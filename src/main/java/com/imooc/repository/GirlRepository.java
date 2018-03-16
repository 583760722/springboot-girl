package com.imooc.repository;

import com.imooc.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/12
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    List<Girl> getByAge(Integer age);
}
