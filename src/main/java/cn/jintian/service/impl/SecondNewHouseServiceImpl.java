package cn.jintian.service.impl;

import cn.jintian.dao.impl.GetSecondNewHouseDaoImpl;
import cn.jintian.pojo.SecondNew_h;
import cn.jintian.service.ISecondNewHouseService;
import cn.jintian.util.SecondHouse;

public class SecondNewHouseServiceImpl implements ISecondNewHouseService {


    @Override
    public SecondNew_h getSecondNewHouse(SecondNew_h secondnew_h) {
        GetSecondNewHouseDaoImpl getHouse = new GetSecondNewHouseDaoImpl();
        SecondNew_h secondNewHouse = getHouse.getSecondNewHouse(secondnew_h.getNew_h_id());
        return secondNewHouse;
    }
}
