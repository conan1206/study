package com.conan.dao.mapper;

import com.conan.dao.entity.MonitorData;

import java.util.List;

public interface MonitorDataMapper {

    List<MonitorData> select(MonitorData monitorData);

}
