package com.example.raz.p05_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SpotsPlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.spots_places_title_computing), getString(R.string.spots_places_computing_descr), R.drawable.img_spots_places_computing));
        locations.add(new Location(getString(R.string.spots_places_title_university), getString(R.string.spots_places_university_descr), R.drawable.img_spots_places_university));
        locations.add(new Location(getString(R.string.spots_places_title_rivercam), getString(R.string.spots_places_camriver_descr), R.drawable.img_spots_places_rivercam));
        locations.add(new Location(getString(R.string.spots_places_title_fitzwilliam), getString(R.string.spots_places_fitzwilliam_descr), R.drawable.img_spots_places_fitzwilliam));
        locations.add(new Location(getString(R.string.spots_places_title_botanic), getString(R.string.spots_places_botanic_descr), R.drawable.img_spots_places_botanic));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}