package com.jacob.listpicker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.jacob.listpicker.view.ListPickerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends FragmentActivity {

    private List<Users> mUserList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();

        ListPickerView listPickerView = (ListPickerView) findViewById(R.id.list_picker_view);
        listPickerView.setItems(mUserList);
        listPickerView.setOnListPickerListener(new ListPickerView.OnListPickerListener() {
            @Override
            public void onListPicker(int position) {
                Log.e("TAG",position+"");
            }
        });

    }

    private void initView() {
        Users users1 = new Users("Jimmy", R.drawable.ic_avatar1);
        Users users2 = new Users("Tomson", R.drawable.ic_avatar2);
        Users users3 = new Users("Lucy", R.drawable.ic_avatar3);
        Users users4 = new Users("Jacob", R.drawable.ic_avatar4);
        Users users5 = new Users("Kenvin", R.drawable.ic_avatar5);
        Users users6 = new Users("Marker", R.drawable.ic_avatar6);
        Users users7 = new Users("Castery", R.drawable.ic_avatar1);

        mUserList.add(users1);
        mUserList.add(users2);
        mUserList.add(users3);
        mUserList.add(users4);
        mUserList.add(users5);
        mUserList.add(users6);
        mUserList.add(users7);

    }

}
