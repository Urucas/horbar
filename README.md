horbar
======

Android horizontal graph bar library

Usage
=====

Insert the custom compound view in your layout

``` html
<com.urucas.horbar.Bar
  android:id="@+id/horbar1"
  android:layout_width="fill_parent"
  android:layout_height="wrap_content"
/>
        
```
Set the bar values in your activity

``` java

Bar horbar1 = (Bar) findViewById(R.id.horbar1);
    horbar1.setTotal(350);
    horbar1.updateBar(150, 200, "In favor", "Againts");
```

![alt tag](https://raw.githubusercontent.com/Urucas/horbar/master/screenshot-1404514586242.png)
