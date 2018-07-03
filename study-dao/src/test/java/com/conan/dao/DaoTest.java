package com.conan.dao;

import com.alibaba.fastjson.JSON;
import com.conan.dao.entity.MonitorData;
import com.conan.dao.mapper.MonitorDataMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DaoTest extends BaseTest {

    @Autowired
    private MonitorDataMapper monitorDataMapper;

    @Test
    public void MonitorDataMapper_select(){
        MonitorData monitorData = new MonitorData();
        monitorData.setIndexCode("CSIRMWS_GL_NRT_0006");
        List<MonitorData> xmlList = monitorDataMapper.selectUseXml(monitorData);
        List<MonitorData> annotationList = monitorDataMapper.selectUseAnnotation(monitorData);
        List<MonitorData> providerList = monitorDataMapper.selectUseProvider(monitorData);

        System.out.println(JSON.toJSONString("xml:" + xmlList));
        System.out.println(JSON.toJSONString("annotation:" + annotationList));
        System.out.println(JSON.toJSONString("provider:" + providerList));
    }

}
