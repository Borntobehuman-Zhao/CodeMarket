package com.market.market_user.admin;

import lombok.Data;

import java.util.HashMap;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/11/25 11:38
 */
@Data
public class Result<T> extends HashMap<String, Object> {
    private Integer code;
    private String msg;
    private T data;
}
