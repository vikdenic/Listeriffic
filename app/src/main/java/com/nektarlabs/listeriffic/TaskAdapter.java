package com.nektarlabs.listeriffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by viktordenic on 10/19/15.
 */
public class TaskAdapter extends BaseAdapter {

    private Context mContext;
    private Task[] mTasks;

    public TaskAdapter(Context context, Task[] tasks)
    {
        mContext = context;
        mTasks = tasks;
    }

    @Override
    public int getCount() {
        return mTasks.length;
    }

    @Override
    public Object getItem(int position) {
        return mTasks[position];
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.task_list_item, null);
            holder = new ViewHolder();
            holder.taskLabel = (TextView) convertView.findViewById(R.id.taskLabel);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Task task = mTasks[position];
        holder.taskLabel.setText(task.getTaskName());

        return convertView;
    }

    private static class ViewHolder {
        TextView taskLabel;
    }
}
