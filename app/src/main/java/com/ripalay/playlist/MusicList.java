package com.ripalay.playlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MusicList extends Fragment implements ListAdapter.onClick {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_music_list, container, false);
    }

    private ListAdapter.onClick listener;
    private RecyclerView recyclerView;
    private ListAdapter adapter = new ListAdapter();
    private ArrayList<Music> list = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        createObject();

        recyclerView = view.findViewById(R.id.recycler);
        adapter.setList(list, this);
        recyclerView.setAdapter(adapter);
    }


    private void createObject() {
        Music dark = new Music("Темнота", "Noize MC", 1, "2:55");
        Music esenin = new Music("Есенин", "Кукрынксы", 2, "4:18");
        Music dorogaya = new Music("Дорогая", "Кукрыниксы", 3, "3:54");
        Music safe = new Music("Safe That Shit", "Lil Peep", 4, "3:51");
        Music thisLove = new Music("Это любовь", "Скриптонит", 5, "4:39");
        Music finali = new Music("Выпускной", "AnacondaZ", 6, "3:45");
        Music kukla = new Music("Кукла колдуна", "Король и Шут", 7, "3:22");
        Music maldenstamp = new Music("Сохрани мою речь", "Noize MC", 8, "4:10");
        Music shvachka = new Music("Жвачка", "Noize MC", 9, "3:04");

        Music galactica = new Music("Вселенная бесконечна", "Noize MC", 10, "3:44");
        Music exhale = new Music("Выдыхай", "Noize MC", 11, "3:03");
        Music mySee = new Music("Мое море", "Noize MC", 12, "4:00");
        Music old = new Music("Почитай старших", "Noize MC", 13, "2:50");
        Music likePeople = new Music("Все как у людей", "Noize MC", 14, "1:48");
        Music iordan = new Music("Иордан", "Noize MC", 15, "3:12");

        list.add(dark);
        list.add(esenin);
        list.add(dorogaya);
        list.add(safe);
        list.add(thisLove);
        list.add(finali);
        list.add(kukla);
        list.add(maldenstamp);
        list.add(shvachka);

        list.add(galactica);
        list.add(exhale);
        list.add(mySee);
        list.add(old);
        list.add(likePeople);
        list.add(iordan);

    }

    @Override
    public void onItem(Music music) {
        Intent intent = new Intent(getActivity(),MainActivity2.class);
        intent.putExtra("key",music.getNameMusic());
        startActivity(intent);
    }
}