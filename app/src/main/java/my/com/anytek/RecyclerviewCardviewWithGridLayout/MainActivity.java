package my.com.anytek.RecyclerviewCardviewWithGridLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The vegiterian", "Category Book", "Description Book", R.drawable.download1));
        lstBook.add(new Book("The Wild Roobot", "Category Book", "Description Book", R.drawable.download2));
        lstBook.add(new Book("The Sampless", "Category Book", "Description Book", R.drawable.download3));
        lstBook.add(new Book("The Super man", "Category Book", "Description Book", R.drawable.download4));
        lstBook.add(new Book("The Vincent house", "Category Book", "Description Book", R.drawable.download5));
        lstBook.add(new Book("The The open church", "Category Book", "Description Book", R.drawable.download6));
        lstBook.add(new Book("The Netural", "Category Book", "Description Book", R.drawable.download7));
        lstBook.add(new Book("The Company name", "Category Book", "Description Book", R.drawable.download8));
        lstBook.add(new Book("The vegiterian", "Category Book", "Description Book", R.drawable.download1));
        lstBook.add(new Book("The Wild Roobot", "Category Book", "Description Book", R.drawable.download2));
        lstBook.add(new Book("The Sampless", "Category Book", "Description Book", R.drawable.download3));
        lstBook.add(new Book("The Super man", "Category Book", "Description Book", R.drawable.download4));
        lstBook.add(new Book("The Vincent house", "Category Book", "Description Book", R.drawable.download5));
        lstBook.add(new Book("The The open church", "Category Book", "Description Book", R.drawable.download6));
        lstBook.add(new Book("The Netural", "Category Book", "Description Book", R.drawable.download7));
        lstBook.add(new Book("The Company name", "Category Book", "Description Book", R.drawable.download8));

        RecyclerView myRecyl = findViewById(R.id.recycleview_id);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, lstBook);
        myRecyl.setLayoutManager(new GridLayoutManager(this, 3));
        myRecyl.setAdapter(adapter);
    }
}
