package com.huitu.testretrofit;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
private ListView listView;
    private List <String> contactsList=new ArrayList<>();
    private  ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView= (ListView) findViewById(R.id.listView);
        showContacts();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
        if (requestCode == 100) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // 申请权限通过
                showContacts();
            } else {
                Toast.makeText(this, "只有通过了权限申请才能查看", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void readContacts(){
        Cursor cursor=null;
        try{
            cursor=getContentResolver().query(
                    ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null
            );
            while(cursor.moveToNext()){
                String displayName =cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                String number=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                contactsList.add(displayName+"\n"+number);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(cursor!=null){
                cursor.close();
            }
        }
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,contactsList);
        listView.setAdapter(adapter);
    }

    private void showContacts() {
        //检验是否版本大于6.0，当前页面是否有这个权限
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&checkSelfPermission(Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
            //发起申请
            requestPermissions(new String[]{Manifest.permission.READ_CONTACTS}, 100);
        } else {
            //低版本直接运行，跳过动态申请。
            readContacts();
        }
    }

}
