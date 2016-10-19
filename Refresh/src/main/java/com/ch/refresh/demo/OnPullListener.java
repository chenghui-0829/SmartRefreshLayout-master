package com.ch.refresh.demo;

/**
 * Created by CH on 2016/10/19.
 */
public interface OnPullListener {

    //执行刷新
    void onRefresh();

    //执行加载更多
    void onLoadMore();
}
