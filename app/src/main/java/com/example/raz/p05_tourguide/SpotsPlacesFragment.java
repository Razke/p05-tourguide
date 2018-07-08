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
        locations.add(new Location("Reichstag Building", getString(R.string.spots_places_reichstag_desc), R.drawable.image_spots_places_reichstag));
        locations.add(new Location("Berlin Cathedral", getString(R.string.spots_places_cathedral_desc), R.drawable.image_spots_places_cathedral));
        locations.add(new Location("Fernsehturm Berlin", getString(R.string.spots_places_fernsehturm_desc), R.drawable.image_spots_places_fernsehturm));
        locations.add(new Location("Brandenburg Gate", getString(R.string.spots_places_brandenburg_desc), R.drawable.image_spots_places_brandenburg));
        locations.add(new Location("Gendarmenmarkt", getString(R.string.spots_places_gendarmenmarkt_desc), R.drawable.image_spots_places_gendarmenmarkt));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}