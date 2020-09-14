package com.android.okhttp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class WeatherAdapter extends BaseAdapter {
    private final List<Weather> mList;
    public WeatherAdapter(List<Weather> list){
        mList = list;
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_weather, viewGroup,false);
            holder = new ViewHolder();
            holder.country = (TextView) view.findViewById(R.id.tv_country);
            holder.weather = (TextView) view.findViewById(R.id.tv_weather);
            holder.temperature = (TextView) view.findViewById(R.id.tv_temperature);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        Weather weather = (Weather)getItem(i);
        holder.country.setText(weather.getCountry());
        holder.weather.setText(weather.getWeather());
        holder.temperature.setText(weather.getTemperature());
        return view;
    }

    static class ViewHolder{
        TextView country;
        TextView weather;
        TextView temperature;
    }
}
