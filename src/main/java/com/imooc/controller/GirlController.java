package com.imooc.controller;

import com.imooc.entity.Girl;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/16
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@RestController
//@RequestMapping("/girl")
public class GirlController {
    @Autowired
    private GirlRepository repository;

    @GetMapping("/girls")
    public List<Girl> girlList() {
        List<Girl> girlList = repository.findAll();

        return girlList;
    }

    @GetMapping("/{id}")
    public Girl girl(@PathVariable("id") Integer id) {
        Optional<Girl> byId = repository.findById(id);
        return byId.get();
    }

    @PostMapping("/girl")
    public Girl saveGirl(@RequestParam("cupSize") String cupSize,
                         @RequestParam("age") Integer age,
                         @RequestParam("money") Double money) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        girl.setMoney(money);

        Girl save = repository.save(girl);
        return save;
    }

    @PutMapping("/girls/{id}")
    public Girl updateGirl(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age,
                           @RequestParam("money") Double money) {
        Optional<Girl> byId = repository.findById(id);
        boolean flag = byId.isPresent();
        Girl girl = null;
        if (flag) {
            girl = byId.get();
            girl.setMoney(money);
            girl.setAge(age);
            girl.setCupSize(cupSize);
            girl = repository.save(girl);
        }
        return girl;
    }

    @DeleteMapping("/girls/delete/{id}")
    public void deleteGirl(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/girls/age/{age}")
    public List<Girl> getGirlsByAge(@PathVariable("age") Integer age) {
        return repository.getByAge(age);
    }
}
