package cn.jintian.util;

import java.util.ArrayList;
import java.util.List;

import cn.jintian.pojo.Old_H;

public class OldHousePage {
    private Integer hourseTotal;//���������
    private Integer index;//��ǰҳ
    private Integer totalPages;//��ҳ��
    private Integer itemsPerPage;//ÿҳ��ʾ����Ŀ��
    private List<Old_H> hourse = new ArrayList<Old_H>();

    public Integer getHourseTotal() {
        return hourseTotal;
    }

    public void setHourseTotal(Integer hourseTotal) {
        this.hourseTotal = hourseTotal;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getTotalPages() {
        return hourseTotal % itemsPerPage == 0 ? hourseTotal / itemsPerPage : hourseTotal / itemsPerPage + 1;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public List<Old_H> getHourse() {
        return hourse;
    }

    public void setHourse(List<Old_H> hourse) {
        this.hourse = hourse;
    }

}
