package com.market.market_user;

import com.market.market_user.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MarketUserApplicationTests {
    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
        System.out.println(sysUserMapper.selectById(2L));
    }

}
