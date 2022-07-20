package com.example.savan_inclass_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.savan_inclass_5.Adaptor.ProductAdaptor;
import com.example.savan_inclass_5.Modells.ModelProduct;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    public static RecyclerView.Adapter adapter;
    public static ArrayList<ModelProduct> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onBind();
        addDataInArray();
        layoutManager = new LinearLayoutManager(this);
        adapter = new ProductAdaptor(arrayList,this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void onBind(){
        recyclerView = findViewById(R.id.recyclerView);

    }

    void addDataInArray(){
        arrayList =new ArrayList<>();
        ModelProduct iphone6 = new ModelProduct(01,1000,"IPHONE 6",R.drawable.iphone6);
        ModelProduct iphone7 = new ModelProduct(02,1200,"IPHONE 7",R.drawable.iphone_7);
        ModelProduct iphone7plus = new ModelProduct(03,1300,"IPHONE 8",R.drawable.iphone_7_plus);
        ModelProduct iphone8 = new ModelProduct(04,1350,"IPHONE X",R.drawable.iphone8);
        ModelProduct iphone8plus = new ModelProduct(05,1350,"IPHONE X",R.drawable.iphone_8_plus);
        ModelProduct iphoneX = new ModelProduct(6,900,"IPHONE X",R.drawable.iphone_x);
        ModelProduct iphone11 = new ModelProduct(7,1400,"IPHONE X",R.drawable.iphone_11);
        ModelProduct iphone11Pro = new ModelProduct(8,1450,"IPHONE X",R.drawable.iphone11pro);
        ModelProduct iphone11ProMax = new ModelProduct(9,1500,"IPHONE X",R.drawable.iphone_11_pro_max);
        ModelProduct iphone12Mini = new ModelProduct(10,1550,"IPHONE X",R.drawable.iphone_12_mini);
        ModelProduct iphone12Pro = new ModelProduct(11,1600,"IPHONE X",R.drawable.iphone_12_pro);
        arrayList.add(iphone6);
        arrayList.add(iphone7);
        arrayList.add(iphone7plus);
        arrayList.add(iphone8);
        arrayList.add(iphone8plus);
        arrayList.add(iphoneX);
        arrayList.add(iphone11);
        arrayList.add(iphone11Pro);
        arrayList.add(iphone11ProMax);
        arrayList.add(iphone12Mini);
        arrayList.add(iphone12Pro);
    }

}