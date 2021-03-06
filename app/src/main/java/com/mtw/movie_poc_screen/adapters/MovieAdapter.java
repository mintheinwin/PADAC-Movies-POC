package com.mtw.movie_poc_screen.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.mtw.movie_poc_screen.R;
import com.mtw.movie_poc_screen.data.vo.MoviePopularVO;
import com.mtw.movie_poc_screen.delegates.MovieItemDelegate;
import com.mtw.movie_poc_screen.viewholders.MovieViewHolder;

/**
 * Created by Aspire-V5 on 12/6/2017.
 */

public class MovieAdapter extends BaseRecyclerAdapter<MovieViewHolder, MoviePopularVO> {

    private MovieItemDelegate mMovieItemDelegate;

    public MovieAdapter(Context context, MovieItemDelegate movieItemDelegate) {
        super(context);
        mMovieItemDelegate = movieItemDelegate;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View movieItemView = mLayoutInflater.inflate(R.layout.view_item_movie, parent, false);
        return new MovieViewHolder(movieItemView, mMovieItemDelegate);
    }

}
