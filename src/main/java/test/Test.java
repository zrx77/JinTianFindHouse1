package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.jintian.dao.BaseDao;
import cn.jintian.dao.impl.FollowHouseDaoImpl;
import cn.jintian.dao.impl.GetNewHouseDaoImpl;
import cn.jintian.dao.impl.GetSecondNewHouseDaoImpl;
import cn.jintian.pojo.New_h;
import cn.jintian.pojo.Old_H;
import cn.jintian.pojo.SecondNew_h;
import cn.jintian.service.impl.SecondNewHouseServiceImpl;
import cn.jintian.util.SMSUtil;


public class Test {
	public static void main(String[] args) {
		
		/*FollowHouseDaoImpl fhdi = new FollowHouseDaoImpl();
		List<Old_H> oldHourse = fhdi.getOldHourse(1, 3,"4");
		System.out.println("��������4���û�ϲ���ķ�ԴID");
		for (Old_H o : oldHourse) {
			System.out.println(o.getOld_h_id());
			System.out.println(o.getCommunityName());
		}
		GetNewHouseDaoImpl hdi = new GetNewHouseDaoImpl();
		List<New_h> newHouse = hdi.getNewHouse(2, 2);
		System.out.println(newHouse.size());
		for (New_h new_h : newHouse) {
			System.out.println(new_h.getH_house_id());
			System.out.println(new_h.getNew_h_id());

			System.out.println(o.getOld_h_metre());
		}
		int sendCode = SMSUtil.SendCode("19935150512");
		System.out.println(sendCode);*/
		/*GetSecondNewHouseDaoImpl getSecondNewHouseDao = new GetSecondNewHouseDaoImpl();
		ArrayList<SecondNew_h> house = getSecondNewHouseDao.getSecondNewHouse(1);
		for (SecondNew_h secondNew_h : house) {
			System.out.println(secondNew_h.getNew_h_id());
			System.out.println(secondNew_h.getCommunity_name());
		}*/
		
	}
}