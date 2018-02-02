package com.example.msi.testlist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list_item1 = new ArrayList<>();
        ArrayList<String> list_item2 = new ArrayList<>();

    //    String[] send = new String[]{"아니", "왜"};



        list_item1.add("0");
        list_item1.add("1");
        list_item1.add("2");



        list_item2.add("send[1]");
        list_item2.add("asdf");




        ListView list_view = (ListView) findViewById(R.id.list_view);
        testAdapter adapter = new testAdapter(this, list_item1, list_item2);
        list_view.setAdapter(adapter);

    }

    public class testAdapter extends BaseAdapter{
        Context context_list;
        ArrayList<String> list_item1;
        ArrayList<String> list_item2;


        public testAdapter(Context context, ArrayList<String> list_item1, ArrayList<String> list_item2){
            this.context_list = context;
            this.list_item1 = list_item1;
            this.list_item2 = list_item2;
        }

        @Override
        public int getCount() {
            return list_item1.size();
        }

        @Override
        public Object getItem(int position) {
            return list_item1.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null){
                LayoutInflater inflater = LayoutInflater.from(context_list);
                convertView = inflater.inflate(R.layout.listview, null);
            }

            TextView num = (TextView) convertView.findViewById(R.id.num);
            EditText name = (EditText) convertView.findViewById(R.id.name);
            CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.checkBox);

            num.setText(list_item1.get(position));
            name.setText(list_item2.get(position));

//            System.out.println("주소: "+convertView);
//            System.out.println("이름: "+name.getText());
            return convertView;
        }
    }
}
