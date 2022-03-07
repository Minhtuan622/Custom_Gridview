package com.example.mygridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvhinh;
    ArrayList<hinhAnh> arrayHinh;
    HinhAnhAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvhinh = (GridView) findViewById(R.id.gvHinh);
        arrayHinh = new ArrayList<>();
        arrayHinh.add(new hinhAnh("Cờ Việt Nam", R.drawable.vietnam));
        arrayHinh.add(new hinhAnh("Cờ Anh", R.drawable.anh));
        arrayHinh.add(new hinhAnh("Cờ Cuba", R.drawable.cuba));
        arrayHinh.add(new hinhAnh("Cờ Đức", R.drawable.duc));
        arrayHinh.add(new hinhAnh("Cờ Đông Ti-mo", R.drawable.dongtimor));
        arrayHinh.add(new hinhAnh("Cờ Bs Lan", R.drawable.balan));
        arrayHinh.add(new hinhAnh("Cờ Nga", R.drawable.nga));
        arrayHinh.add(new hinhAnh("Cờ Mỹ", R.drawable.usa));
        arrayHinh.add(new hinhAnh("Cờ Myanmar", R.drawable.myanmar));

        adapter = new HinhAnhAdapter(this, R.layout.line_img, arrayHinh);
        gvhinh.setAdapter(adapter);
    }
}