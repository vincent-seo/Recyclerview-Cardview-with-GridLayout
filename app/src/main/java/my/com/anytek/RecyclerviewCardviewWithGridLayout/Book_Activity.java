package my.com.anytek.RecyclerviewCardviewWithGridLayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvTitle, tvDescription, tvCategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvTitle = findViewById(R.id.txt_title);
        tvDescription = findViewById(R.id.txt_desc);
        tvCategory = findViewById(R.id.txt_cat);
        img = findViewById(R.id.bookthumbnail);

        //Receive data
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String description = intent.getExtras().getString("Description");
        int thumbnail = intent.getExtras().getInt("Thumbnail");

        tvTitle.setText(title);
        tvDescription.setText(description);
        img.setImageResource(thumbnail);
    }
}
