package com.ch.refresh.demo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.hwang.library.widgit.SmartRefreshLayout;

public class MainActivity extends AppCompatActivity {

    //    private SmartRefreshLayout mLayout;
    private RefreshLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mLayout = (RefreshLayout) findViewById(R.id.smart_refresh_layout);

        mLayout.setOnPullListener(new OnPullListener() {
                                      @Override
                                      public void onRefresh() {
                                          new Thread(new Runnable() {
                                              @Override
                                              public void run() {
                                                  try {
                                                      Thread.sleep(3000);
                                                  } catch (InterruptedException e) {
                                                      e.printStackTrace();
                                                  }

                                                  mHandler.sendEmptyMessage(0);
                                              }

                                          }).start();
                                      }

                                      @Override
                                      public void onLoadMore() {
                                          new Thread(new Runnable() {
                                              @Override
                                              public void run() {
                                                  try {
                                                      Thread.sleep(3000);
                                                  } catch (InterruptedException e) {
                                                      e.printStackTrace();
                                                  }

                                                  mHandler.sendEmptyMessage(1);
                                              }

                                          }).start();
                                      }
                                  }

        );

//        mLayout.setOnRefreshListener(new SmartRefreshLayout.onRefreshListener() {
//            @Override
//            public void onRefresh() {
//                /*
//                 * do what you want do
//                 */
////                mLayout.stopRefresh();
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            Thread.sleep(3000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                        mHandler.sendEmptyMessage(0);
//                    }
//
//                }).start();
//            }
//
//            @Override
//            public void onLoadMore() {
//                /*
//                 * do what you want do
//                 */
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            Thread.sleep(3000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                        mHandler.sendEmptyMessage(1);
//                    }
//
//                }).start();
//
//            }
//        });
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {

                case 0:
                    mLayout.stopRefresh(true);
                    break;
                case 1:
                    mLayout.stopLoadMore(true);
                    break;

            }

        }
    };
}
