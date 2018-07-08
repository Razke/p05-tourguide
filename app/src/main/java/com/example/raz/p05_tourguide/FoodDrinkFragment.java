package com.example.raz.p05_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodDrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.test1), getString(R.string.test2), R.drawable.image_poster_min));
        locations.add(new Location(getString(R.string.test1), getString(R.string.test2), R.drawable.second_image_poster_min));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);


        ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }
}