package com.chowen.lightutils.ioc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chowen.cn.library.ioc.annotations.field.InjectChildView;
import com.chowen.cn.library.ioc.annotations.field.InjectContentView;
import com.chowen.cn.library.ioc.annotations.field.InjectString;
import com.chowen.lightutils.R;
import com.chowen.lightutils.base.BaseActivity;
import com.chowen.cn.library.utils.log.Logger;

@InjectContentView(value = R.layout.activity_main)
public class MainActivity1 extends BaseActivity implements View.OnClickListener{

    @InjectString(value = R.string.app_click, viewId = R.id.btn)
    @InjectChildView(value = R.id.btn, listener = View.OnClickListener.class)
    private Button mBtn;

    @InjectChildView(value = R.id.btn_fragment, listener = View.OnClickListener.class)
    private Button mBtn2;

    @InjectChildView(value = R.id.tv)
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("chowen");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                Intent intent = new Intent(this, IocSimpleActivity.class);
                startActivity(intent);
            break;
            case R.id.btn_fragment:
//                android.app.FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction ft = fragmentManager.beginTransaction();
//                ft.replace(android.R.id.content, new ViewAnnotationFragment());
//                ft.addToBackStack(null);
//                ft.commitAllowingStateLoss();
                break;
        }

    }
}
