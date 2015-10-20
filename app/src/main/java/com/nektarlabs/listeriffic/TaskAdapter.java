package com.nektarlabs.listeriffic;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by viktordenic on 10/19/15.
 */
public class TaskAdapter extends BaseAdapter {

    private Context mContext;
    private String[] mTasks;

    public TaskAdapter(Context context, String[] tasks)
    {
        mContext = context;
        mTasks = tasks;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null)
        {

        }

        return null;
    }

    private static class ViewHolder {
        TextView taskLabel;
    }
}
