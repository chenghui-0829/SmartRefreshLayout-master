package com.ch.refresh.demo;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by CH on 2016/10/19.
 */
public class RefreshLayout extends PullLayout {
    public RefreshLayout(Context context) {
        super(context);
    }

    public RefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    public void init() {

        HeaderView header = new HeaderView(getContext());
        FooterView footer = new FooterView(getContext());

        addHeader(header);
        addFooter(footer);

        setHeader(header);
        setFooter(footer);
    }

}
