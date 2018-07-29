package com.example.raz.p05_tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Ibis Cambridge Central Station", getString(R.string.hotels_ibis_descr), R.drawable.ic_hotels));
        locations.add(new Location("Anstey Hall", getString(R.string.hotels_anstey_descr), R.drawable.ic_hotels));
        locations.add(new Location("Holiday Inn Express Cambridge", getString(R.string.hotels_holidayinn_descr), R.drawable.ic_hotels));
        locations.add(new Location("Quy Mill Hotel & Spa", getString(R.string.hotels_quymill_descr), R.drawable.ic_hotels));
        locations.add(new Location("Travelodge", getString(R.string.hotels_travelodge_descr), R.drawable.ic_hotels));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}