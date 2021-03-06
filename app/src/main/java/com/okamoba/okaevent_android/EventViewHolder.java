package com.okamoba.okaevent_android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tatsuhama on 2018/02/18.
 * 各イベントを表示するための　ViewHolder
 */
class EventViewHolder extends RecyclerView.ViewHolder {

    private TextView nameText;
    private TextView textText;
    private TextView addressText;

    EventViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event, parent, false));
        nameText = itemView.findViewById(R.id.eventItemName);
        textText = itemView.findViewById(R.id.eventItemText);
        addressText = itemView.findViewById(R.id.eventItemAddress);
    }

    void bindEvent(EventModel event) {
        // TODO:デザイン適用
        nameText.setText(event.getName());
        textText.setText(event.getStart_datetime().toString());
        addressText.setText(event.getAddress());
    }

}
