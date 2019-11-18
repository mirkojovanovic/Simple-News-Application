package com.example.android.mj_brandnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<NewsPost> news;

    NewsAdapter(Context context, ArrayList<NewsPost> news) {
        this.context = context;
        this.news = news;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        if (viewType == 0) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_post_thumb_layout, parent, false);
            return new ThumbnailViewHolder(v);
        } else {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_post_text_layout, parent, false);
            return new TextViewHolder(v);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final NewsPost newsPost = news.get(position);

        if (holder.getItemViewType() == 0) {
            ThumbnailViewHolder thumbnailViewHolder = (ThumbnailViewHolder) holder;

            thumbnailViewHolder.headingTextView.setText(newsPost.getTitle());

            Glide.with(context)
                    .load(newsPost.getImage())
                    .into(thumbnailViewHolder.thumbnailImageView);
        }
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    @Override
    public int getItemViewType(int position) {
        return news.get(position).getType();
    }

    static class ThumbnailViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.thumb_layout_heading)
        TextView headingTextView;

        @BindView(R.id.thumb_layout_thumbnail)
        ImageView thumbnailImageView;

        ThumbnailViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    static class TextViewHolder extends RecyclerView.ViewHolder {

        TextViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
