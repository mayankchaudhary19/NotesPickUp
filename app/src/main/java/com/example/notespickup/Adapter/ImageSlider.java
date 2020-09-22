package com.example.notespickup.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notespickup.Model.ImageModelAdapter;
import com.example.notespickup.R;

import java.util.List;

public class ImageSlider extends  RecyclerView.Adapter<ImageSlider.ViewHolder>{

    private List<ImageModelAdapter> imageSliderModelList;
    Context context;

    public ImageSlider(List<ImageModelAdapter> imageSliderModelList, Context context) {
        this.imageSliderModelList = imageSliderModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ImageSlider.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_image_slider_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageSlider.ViewHolder holder, int position) {
        String title =imageSliderModelList.get(position).getHeading();
        String subtitle =imageSliderModelList.get(position).getSubheading();
        int image =imageSliderModelList.get(position).getImg();
        holder.setData(title,subtitle,image);
    }

    @Override
    public int getItemCount() {
        return imageSliderModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, subtitle;
        private ImageView img;
        public ViewHolder(@NonNull final View view) {
            super(view);
            title = view.findViewById(R.id.img_title);
            subtitle = view.findViewById(R.id.img_subtitle);
            img= view.findViewById(R.id.iv_auto_image_slider);
        }

        private void setData(String heading, String subheading, int image) {
            title.setText(heading);
            subtitle.setText(subheading);
            img.setImageResource(image);
        }

    }

}
