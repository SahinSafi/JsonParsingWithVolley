package com.cyberwith.volley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView userName, following, followers;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.UserImageID);
        userName = findViewById(R.id.userNameID);
        following = findViewById(R.id.followingID);
        followers = findViewById(R.id.followersID);


        Bundle value = getIntent().getExtras();
        if (value != null){
            String imageValue = value.getString("image");
            String name = value.getString("name");
            String followersValue = value.getString("followers");
            String followingValue = value.getString("following");

            Glide.with(this).load(imageValue).into(imageView);
            userName.setText(name);
            followers.setText("Followers: "+followersValue);
            following.setText("Following: "+followingValue);
        }

    }

}
