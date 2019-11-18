package com.example.android.mj_brandnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.news_rv)
    RecyclerView newsRecyclerView;

    ArrayList<NewsPost> news = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        NewsAdapter newsAdapter = new NewsAdapter(this, news);
        newsRecyclerView.setAdapter(newsAdapter);

        news.add(new NewsPost(
                "Trump Weighs Testifying on Impeachment After Silencing His Aides",
                "(Bloomberg) -- Donald Trump said Monday that he’s “strongly considering” testifying in his own impeachment inquiry, responding in a tweet to a suggestion from House Speaker Nancy Pelosi after again insulting her and congressional Democrats for pursuing his removal from office.\n" +
                        "\n" +
                        "Trump indicated that he thinks his testimony -- possibly in writing -- would be a way to resolve the inquiry and get Congress focused on issues he’d like to advance before his 2020 re-election campaign, including a new North American trade deal and drug prices.",
                "http://theamericanfreedomparty.us/wp-content/uploads/Donald-Trump-Oscars-150x150.jpg",
                0)
        );
        newsAdapter.notifyDataSetChanged();
    }
}
