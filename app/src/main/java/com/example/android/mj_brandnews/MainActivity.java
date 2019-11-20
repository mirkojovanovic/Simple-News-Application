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
                "Donald Trump said Monday that he’s “strongly considering” testifying in his own impeachment inquiry, responding in a tweet to a suggestion from House Speaker Nancy Pelosi after again insulting her and congressional Democrats for pursuing his removal from office.\n" +
                        "\n" +
                        "Trump indicated that he thinks his testimony -- possibly in writing -- would be a way to resolve the inquiry and get Congress focused on issues he’d like to advance before his 2020 re-election campaign, including a new North American trade deal and drug prices.",
                "http://theamericanfreedomparty.us/wp-content/uploads/Donald-Trump-Oscars-150x150.jpg")
        );

        news.add(new NewsPost(
                "Zurich’s Bankers Make Way for Techies and Bitcoin Startups",
                "On Bahnhofstrasse, Zurich’s main street, a building that once housed a private bank has been turned into a hub for blockchain development. The forces reshaping the economy of Switzerland’s largest metropolis are also exerting a sartorial influence. Fifteen years ago, “I think 80 percent of the men would’ve been wearing a suit and tie. Now it looks different,” with more people dressed casually, says Thomas Meister, general manager of Trust Square, which has 40-odd companies working on crypto applications as tenants.",
                null
        ));

        news.add(new NewsPost(
                "Ford Unveils Electric Mustang SUV to Challenge Tesla Dominance",
                "Ford Motor Co. is reinventing one of its marquee models -- the Mustang muscle car -- as a battery-powered crossover to become a player in the electric-vehicle market that is expected to take off in the coming decade.\n" +
                        "\n" +
                        "In a splashy ceremony Sunday ahead of the Los Angeles Auto Show, the carmaker unveiled the Mustang Mach-E, a swoopy hatchback with distinctive pony-car haunches and familiar shark nose that it claims has the power to take on Porsche. When it goes on sale next fall, Ford hopes to convince mainstream buyers its electrified Mustang is an alternative to the Tesla models dominating the EV market.",
                "https://assets.bwbx.io/images/users/iqjWHBFdfxIU/iA4mWifP0E_E/v0/800x-1.jpg"
        ));

        newsAdapter.notifyDataSetChanged();
    }
}
