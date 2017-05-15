package com.fatchao.rvbase;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * author pangchao
 * created on 2017/5/15
 * email fat_chao@163.com.
 */

public class NormalAdapter extends RvAdapter<String> {

    public NormalAdapter(Context context, List<String> list, RvListener listener) {
        super(context, list, listener);
    }

    @Override
    protected RvHolder getHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_demo, parent, false);
        return new NormalHolder(view, viewType, listener);
    }

}
