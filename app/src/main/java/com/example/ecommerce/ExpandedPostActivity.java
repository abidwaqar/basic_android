package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ExpandedPostActivity extends AppCompatActivity {

    private ImageView expanded_post_image_view;
    private TextView expanded_post_title, expanded_post_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanded_post);

        expanded_post_image_view = findViewById(R.id.expanded_post_thumbnail);
        expanded_post_title = findViewById(R.id.expanded_post_title);
        expanded_post_description = findViewById(R.id.expanded_post_description);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Glide.with(this).load(extras.getInt(String.valueOf(Post.PROPERTIES.THUMBNAIL)))
                    .into(expanded_post_image_view);
            expanded_post_title.setText(extras.getString(String.valueOf(Post.PROPERTIES.TITLE)));
            expanded_post_description.setText(extras.getString(String.valueOf(Post.PROPERTIES.DESCRIPTION)));
        }
        else {
            return;
        }
    }
}