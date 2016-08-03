package com.chowen.lightutils.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chowen.cn.library.fragmentkit.FragmentWrapper;
import com.chowen.lightutils.BaseComponentFragment;
import com.chowen.lightutils.R;


/**
 * User: chengwangyong(chengwangyong@vcinema.com)
 * Date: 2016-01-19
 * Time: 10:02
 */
public class Fragment2 extends FragmentWrapper implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment2, null);
        inflate.findViewById(R.id.fragment1).setOnClickListener(this);
        inflate.findViewById(R.id.fragment3).setOnClickListener(this);
        inflate.findViewById(R.id.fragment4).setOnClickListener(this);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fragment1:
                open(new BaseComponentFragment());
                break;
            case R.id.fragment3:
                open(new Fragment3());
                break;
            case R.id.fragment4:
                open(new Fragment3());
                break;
        }
    }
}
