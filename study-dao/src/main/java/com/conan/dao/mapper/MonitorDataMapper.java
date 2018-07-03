package com.conan.dao.mapper;

import com.conan.dao.provider.MonitorDataProvider;
import com.conan.dao.entity.MonitorData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface MonitorDataMapper {

    @SelectProvider(type = MonitorDataProvider.class, method = "select")
    List<MonitorData> select(@Param("monitorData") MonitorData monitorData);

}
