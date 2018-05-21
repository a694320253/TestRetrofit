package com.huitu.testretrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_1, et_2;
    private Button btn;
    private static final String TAG = "TAGTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_1 = (EditText) findViewById(R.id.et_1);
        et_2 = (EditText) findViewById(R.id.et_2);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        Log.i(TAG, "MainActivity onCreate: ");
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//              Log.i("runOnUiThread",Thread.currentThread().getName());
//            }
//        });
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Log.i("runOnUiThread",Thread.currentThread().getName());
//            }
//        }).start();
//
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                Log.i("runOnUiThread",Thread.currentThread().getName());
//            }
//        }.start();
    }

    public void request() {
        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://123.56.69.223:8086/5Dimension/api/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();
        // 步骤5:创建 网络请求接口 的实例
        GetRequestInterface request = retrofit.create(GetRequestInterface.class);
        //对 发送请求 进行封装
        Call<LoginBean> call = request.getCall(et_1.getText().toString(), et_2.getText().toString());
        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<LoginBean>() {
            @Override
            public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {
                // 步骤7：处理返回的数据结果
                Log.i("TAGTAG", response.message() + "--" + Thread.currentThread().getName());
                Log.i("TAGTAG", response.body().getMessage() + "--" + response.body().getCode() + "--" + response.body().getResult());
                Log.i("TAGTAG", response.toString() + "---" + response.isSuccessful());
                Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<LoginBean> call, Throwable t) {
                Log.i("TAGTAG", "连接失败");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity Start: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity onDestroy: ");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                request();
//                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
//                startActivity(intent);
                break;
        }
    }
}
