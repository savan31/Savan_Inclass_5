package com.example.savan_inclass_5.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savan_inclass_5.Modells.ModelProduct;
import com.example.savan_inclass_5.R;

import java.util.ArrayList;
import java.util.List;

public class ProductAdaptor extends RecyclerView.Adapter<ProductAdaptor.HomeViewHolder> {

    ArrayList<ModelProduct> arrayList;
    Context context;

    public ProductAdaptor(ArrayList<ModelProduct> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{

        TextView textViewId,textViewName,textViewPrice;
        ImageView imageViewProduct;

        public HomeViewHolder(@NonNull View i) {
            super(i);
            textViewId = i.findViewById(R.id.productIDTextView);
            textViewName = i.findViewById(R.id.productNameTextView);
            textViewPrice = i.findViewById(R.id.productPriceTextView);
            imageViewProduct = i.findViewById(R.id.productImageView);
        }
    }
    @NonNull
    @Override
    public ProductAdaptor.HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_product_description, parent, false);
        HomeViewHolder homeViewHolder = new HomeViewHolder(view);
        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdaptor.HomeViewHolder holder, int position) {
        holder.textViewId.setText("Product ID : "+arrayList.get(position).getId());
        holder.textViewName.setText("Name : "+arrayList.get(position).getName());
        holder.textViewPrice.setText("Price : "+String.valueOf(arrayList.get(position).getPrice())+"$");
        holder.imageViewProduct.setImageResource(arrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
