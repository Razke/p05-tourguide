package com.example.raz.p05_tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationTitleTextView = listItemView.findViewById(R.id.text_view_location_title);
        locationTitleTextView.setText(currentLocation.getLocationTitle());

        TextView locationTitleDescriptionTextView = listItemView.findViewById(R.id.text_view_location_description);
        locationTitleDescriptionTextView.setText(currentLocation.getLocationDescription());

        ImageView posterImageView = listItemView.findViewById(R.id.image_view_poster);
        posterImageView.setImageResource(currentLocation.getPoster());

        return listItemView;
    }
}
