package com.fatchao.rvbase;

import android.view.View;
import android.widget.TextView;

/**
 * author pangchao
 * created on 2017/5/15
 * email fat_chao@163.com.
 */

public class NormalHolder extends RvHolder<String> {
    private TextView tvDemo;
    public NormalHolder(View itemView, int type, RvListener listener) {
        super(itemView, type, listener);
        tvDemo = (TextView) itemView.findViewById(R.id.tv_demo);
    }

    @Override
    public void bindHolder(String s, int position) {
        tvDemo.setText(s);
    }
}
