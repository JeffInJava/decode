package com.example.demo.common;

import java.util.HashMap;

/**
 * @author
 */
public class AjaxResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    public static AjaxResult error() { return error(1, "操作失败"); }
    public static AjaxResult error(String msg) { return error(500, msg); }
    public static AjaxResult error(int code, String msg) {
        AjaxResult json = new AjaxResult();
        json.put("code", Integer.valueOf(code));
        json.put("msg", msg);
        return json;
    }
    public static AjaxResult success(String msg) {
        AjaxResult json = new AjaxResult();
        json.put("msg", msg);
        json.put("code", Integer.valueOf(0));
        return json;
    }
    public static AjaxResult success() { return success("操作成功"); }
    @Override
    public AjaxResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
    public static AjaxResult successData(Object value) {
        AjaxResult success = success("查询成功");
        success.put("data", value);
        return success;
    }
}
