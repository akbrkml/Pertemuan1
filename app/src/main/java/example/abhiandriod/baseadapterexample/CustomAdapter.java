package example.abhiandriod.baseadapterexample;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class CustomAdapter extends BaseAdapter {
    String dummyWeatherData[];
    LayoutInflater inflter;
    Context mContext;

    public CustomAdapter(Context applicationContext, String[] dummyWeatherData) {
        this.dummyWeatherData = dummyWeatherData;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return dummyWeatherData.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, viewGroup, false);
        TextView country = (TextView) view.findViewById(R.id.textView);
        country.setText(dummyWeatherData[i]);
        country.setBackgroundColor(Color.GREEN);

        // klik
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Data " + dummyWeatherData[i], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}