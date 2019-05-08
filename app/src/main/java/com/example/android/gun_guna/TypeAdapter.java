package com.example.android.gun_guna;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TypeAdapter extends ArrayAdapter<Type> {

    private int mColorResourceId;

    /**
     * Create a new {@link TypeAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param type            is the list of {@link Type}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public TypeAdapter(Context context, ArrayList<Type> type, int colorResourceId) {
        super(context, colorResourceId, type);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_list, parent, false);
        }

// Get the {@link Word} object located at this position in the list
        Type currentType = getItem(position);

        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);



        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView typeTextView = (TextView) listItemView.findViewById(R.id.typetext);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        assert currentType != null;
        typeTextView.setText(currentType.getType());



        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}

