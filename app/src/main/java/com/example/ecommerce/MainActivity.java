package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView posts_recycler_view;
    private PostsAdapter posts_adapter;
    private List<Post> posts_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        posts_list = new ArrayList<>();
        posts_adapter = new PostsAdapter(this, posts_list);
        posts_recycler_view = findViewById(R.id.posts_recycler_view);

        posts_recycler_view.setLayoutManager(new LinearLayoutManager(this));
        posts_recycler_view.setAdapter(posts_adapter);

        prepare_posts();
    }

    private void prepare_posts(){
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));
        posts_list.add(new Post(R.drawable.gamepad, "Game Pad", "This is an awesome game pad"));
        posts_list.add(new Post(R.drawable.blue_shirt, "Blue Shirt", "This is an awesome Blue Shirt"));

        posts_adapter.notifyDataSetChanged();
    }

}