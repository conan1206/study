package com.conan.dao.mapper;

import com.conan.dao.provider.MonitorDataProvider;
import com.conan.dao.entity.MonitorData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface MonitorDataMapper {

    @SelectProvider(type = MonitorDataProvider.class, method = "select")
    List<MonitorData> selectUseProvider(@Param("monitorData") MonitorData monitorData);

    //注解方式动态sql必须依赖mybatis-3.2.0及以上版本jar包，3.2.0版本启动时有个日志的异常，未深究其原因，所以用了3.2.2版本
    @Select({
        "<script>" +
                "select * from monitor_data " +
                "<where> " +
                    "1 = 1 " +
                    "<if test='indexCode != null'>" +
                        " and indexCode = #{indexCode}" +
                    "</if>" +
                "</where>" +
        "</script>"
    })
    List<MonitorData> selectUseAnnotation(MonitorData monitorData);

    List<MonitorData> selectUseXml(MonitorData monitorData);

}
