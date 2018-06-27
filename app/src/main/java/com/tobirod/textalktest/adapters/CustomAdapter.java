package com.tobirod.textalktest.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tobirod.textalktest.R;
import com.tobirod.textalktest.models.Article;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Article> {

    private static class ViewHolder {

        TextView listRow_title;
        ImageView listRow_image;
    }

    public CustomAdapter(ArrayList<Article> data, Context context) {
        super(context, R.layout.custom_listrow, data);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        Article article = getItem(position);

        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.custom_listrow, parent, false);

            viewHolder.listRow_title = convertView.findViewById(R.id.listRow_title);
            viewHolder.listRow_image = convertView.findViewById(R.id.listRow_image);

            convertView.setTag(viewHolder);
        } else {

            viewHolder = (ViewHolder) convertView.getTag();
        }

        assert article != null;

        int resId = getContext().getResources().getIdentifier(article.getImage(), "drawable", getContext().getPackageName());

        viewHolder.listRow_title.setText(article.getTitle());
        viewHolder.listRow_image.setImageResource(resId);

        return convertView;
    }
}
