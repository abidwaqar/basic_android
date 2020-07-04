package com.example.ecommerce;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private List<Post> posts_list;
    private Context mContext;

    public PostsAdapter(Context context, List<Post> posts_list){
        this.mContext = context;
        this.posts_list = posts_list;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.post, parent, false);
        return new PostViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, final int position) {
        Post post = posts_list.get(position);
        holder.post_title.setText(post.getTitle());
        holder.post_description.setText((post.getDescription()));

        Glide.with(mContext).load(post.getThumbnail()).into(holder.post_thumbnail);

        holder.post_card_view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent expand_post = new Intent(mContext, ExpandedPostActivity.class);
                Post post = posts_list.get(position);
                expand_post.putExtra(String.valueOf(Post.PROPERTIES.THUMBNAIL), post.getThumbnail());
                expand_post.putExtra(String.valueOf(Post.PROPERTIES.TITLE), post.getTitle());
                expand_post.putExtra(String.valueOf(Post.PROPERTIES.DESCRIPTION), post.getDescription());
                mContext.startActivity(expand_post);
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts_list.size();
    }


    /**
     * View Holder CLass For Posts
     **/
    public class PostViewHolder extends RecyclerView.ViewHolder{
        public ImageView post_thumbnail;
        public TextView post_title, post_description;
        public CardView post_card_view;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            post_thumbnail = itemView.findViewById(R.id.post_thumbnail);
            post_title = itemView.findViewById(R.id.post_title);
            post_description = itemView.findViewById(R.id.post_description);
            post_card_view = itemView.findViewById(R.id.post_card_view);
        }
    }
}
