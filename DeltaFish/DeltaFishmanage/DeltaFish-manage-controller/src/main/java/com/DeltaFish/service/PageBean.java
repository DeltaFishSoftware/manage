package com.DeltaFish.service;

import java.util.List;

public class PageBean<T> {
    private int nowPage;
    private int pageSize;
    private long total;
    private int start;
    private int end;
    private List<T> result;

    PageBean(){

    }

    public PageBean(int nowPage, int pageSize){
        this.nowPage = nowPage;
        this.pageSize = pageSize;
        this.start = (nowPage - 1)*pageSize;
        this.end = nowPage*pageSize;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "nowPage = " + nowPage +
                ", pageSize = " + pageSize +
                ", total = " + total +
                ", start = " + start +
                ", end = " + end +
                ", result = " + result +
                "}";
    }
}
