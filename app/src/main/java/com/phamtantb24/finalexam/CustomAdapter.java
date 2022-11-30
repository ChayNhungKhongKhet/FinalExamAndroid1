package com.phamtantb24.finalexam;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CustomAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Author> authors;

    public CustomAdapter(Context context, int layout, List<Author> authors) {
        this.context = context;
        this.layout = layout;
        this.authors = authors;
    }

    @Override
    public int getCount() {
        return authors.size();
    }

    @Override
    public Object getItem(int i) {
        return authors.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private static class ViewHolder {
        TextView name, described;
        ImageView avatar;
        private ImageView star1;
        private ImageView star3;
        private ImageView star2;
        private ImageView star4;

    }
    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();
            viewHolder.avatar = convertView.findViewById(R.id.image);
            viewHolder.name = convertView.findViewById(R.id.nameTxt);
            viewHolder.described = convertView.findViewById(R.id.describedTxt);
            viewHolder.star1 = convertView.findViewById(R.id.star1);
            viewHolder.star2 = convertView.findViewById(R.id.star2);
            viewHolder.star3 = convertView.findViewById(R.id.star3);
            viewHolder.star4 = convertView.findViewById(R.id.star4);


            convertView.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) convertView.getTag();
        Author author = authors.get(position);

        viewHolder.name.setText(author.getName());
        viewHolder.described.setText("Described: "+ author.getDescribed());
        List<ImageView> imageViews = new ArrayList<>();
        imageViews.add(viewHolder.star1);
        imageViews.add(viewHolder.star2);
        imageViews.add(viewHolder.star3);
        imageViews.add(viewHolder.star4);
        for (int i = 0; i < author.getNumStar(); i++) {
            imageViews.get(i).setVisibility(View.VISIBLE);
        }
        return convertView;
    }

}