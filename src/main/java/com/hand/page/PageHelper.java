package com.hand.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 陈伟 on 2017/1/4.
 */
public class PageHelper<T> {
    private T entity;//带条件查询的实体类
    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
    private List<T> list;
    private int nowPage=1;//当前页
    private int pageSize=10;//页面大小
    private int count=0;//总条数
    private int pageCount;//页面总个数
    private int first;//sql查询起始条

    public PageHelper(int nowPage, int pageSize, int count) {
        if(count>0){
            this.count = count;
        }
        if(pageSize>0){
            this.nowPage = nowPage;
        }
        if(nowPage>0){
            this.pageSize = pageSize;
        }
        getPageCount();
        setFirst();
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
        setFirst();
        Map<String,String> map=new HashMap<String,String>();
        map.put("username","qqq");
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        getPageCount();
        setFirst();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        getPageCount();
    }

    public int getPageCount() {
        this.pageCount=(int)Math.ceil((double)count/pageSize);
        return pageCount;
    }

    private void setFirst(){
        this.first=(nowPage-1)*pageSize;
    }

    public int getFirst() {
        return first;
    }
}
