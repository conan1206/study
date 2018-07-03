package com.conan.dao.provider;

import com.conan.dao.entity.MonitorData;

import java.util.Map;

public class MonitorDataProvider {

    public String select(Map<String, Object> map){
        MonitorData monitorData = (MonitorData)map.get("monitorData");
        String sql = "select * from monitor_data where 1 = 1 ";
        if(monitorData.getId() != null){
            sql += " and id = #{id}";
        }
        if(monitorData.getIndexCode() != null){
            sql += " and indexCode = #{monitorData.indexCode}";
        }

        return sql;
    }

}
