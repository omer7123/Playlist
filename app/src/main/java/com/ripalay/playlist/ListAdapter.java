package com.ripalay.playlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<Music> list = new ArrayList<>();
private onClick onClick;
    public void setList(ArrayList list, onClick onClick) {
        this.list = list;
        this.onClick = onClick;

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView number;
        private TextView name;
        private TextView executor;
        private TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initView();

        }

        private void initView() {
            number = itemView.findViewById(R.id.numberMusic_tv);
            name = itemView.findViewById(R.id.nameMusic_tv);
            executor = itemView.findViewById(R.id.nameRap_tv);
            time = itemView.findViewById(R.id.music_time_tv);
        }

        public void onBind(Music music) {
            number.setText(music.getNumberMusic().toString());
            name.setText(music.getNameMusic());
            executor.setText(music.getExecutorMusic());
            time.setText(music.getTimeMusic());
            itemView.setOnClickListener(v -> {
                onClick.onItem(music);
            });
        }
    }
    public interface onClick {
        void onItem(Music music);
    }
}
