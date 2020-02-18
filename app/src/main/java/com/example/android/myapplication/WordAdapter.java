package com.example.android.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBgColorId;

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int mBgColorId) {
        super(context, 0, objects);
        this.mBgColorId = mBgColorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        LinearLayout layoutView = listItemView.findViewById(R.id.text_context);
        int color = ContextCompat.getColor(getContext(), mBgColorId);
        layoutView.setBackgroundColor(color);

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView .setText(currentWord.getmDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.miwok_image);

        if(currentWord.isHasImage()){
            imageView.setImageResource(currentWord.getmImageResourseId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
