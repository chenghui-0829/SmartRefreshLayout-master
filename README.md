# SmartRefreshLayout
A common use pull-up/down view-group of android


# Gradle
> compile 'me.rawnhwang.library:smart-refresh-layout:1.0.0-rc'

# Layout-XML
```XML
<?xml version="1.0" encoding="utf-8"?>
<me.hwang.library.widgit.SmartRefreshLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/smart_refresh_layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    <!-- 拉动部分的背景 -->
    app:pullBackground="@color/colorPrimary"
    <!-- 是否允许下拉操作 -->
    app:enablePullDown="false"
    <!-- 是否允许上拉操作 -->
    app:enablePullUp="false">

  <!-- this is your content view part-->
  <ImageView
      android:id="@+id/iv"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:background="@drawable/luffy"/>

</me.hwang.library.widgit.SmartRefreshLayout>

```
---

# Java-Code

```JAVA
public class MainActivity extends AppCompatActivity {
    private SmartRefreshLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //....

        mLayout = (SmartRefreshLayout) findViewById(R.id.smart_refresh_layout);
        mLayout.setOnRefreshListener(new SmartRefreshLayout.onRefreshListener() {
            @Override
            public void onRefresh() {
                /*
                 * do what you want do
                 */
                mLayout.stopRefresh();
            }

            @Override
            public void onLoadMore() {
                /*
                 * do what you want do
                 */
                mLayout.stopLoadMore();
            }
        });
    }
}
```
---

- With common view(e.g ImageView)

![ImageView-Demo](https://github.com/RawnHwang/SmartRefreshLayout/blob/master/demonstration-gif/imageview_demo.gif)

- With ListView

![ListView-Demo](https://github.com/RawnHwang/SmartRefreshLayout/blob/master/demonstration-gif/listview_demo.gif)

- With RecyclerView

![RecyclerView-Demo](https://github.com/RawnHwang/SmartRefreshLayout/blob/master/demonstration-gif/recyclerview_demo.gif)

- With ScrollView

![ScrollView-Demo](https://github.com/RawnHwang/SmartRefreshLayout/blob/master/demonstration-gif/scrollview_demo.gif)

- Be a part

![Part-Demo](https://github.com/RawnHwang/SmartRefreshLayout/blob/master/demonstration-gif/jubu_demo.gif)
