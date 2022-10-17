/*
 * MIT License
 *
 * Copyright (c) 2021 Evren Coşkun
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.evrencoskun.tableviewsample.tableview.holder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.evrencoskun.tableview.ITableView;
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractSorterViewHolder;
import com.evrencoskun.tableviewsample.R;
import com.evrencoskun.tableviewsample.tableview.model.ColumnBottom;

/**
 * Created by evrencoskun on 23/10/2017.
 */

public class ColumnBottomViewHolder extends AbstractSorterViewHolder {

    private static final String LOG_TAG = ColumnBottomViewHolder.class.getSimpleName();

    @NonNull
    private final LinearLayout column_bottom_container;
    @NonNull
    private final TextView column_bottom_textview;

    public ColumnBottomViewHolder(@NonNull View itemView, @Nullable ITableView tableView) {
        super(itemView);
        column_bottom_textview = itemView.findViewById(R.id.column_header_textView);
        column_bottom_container = itemView.findViewById(R.id.column_header_container);
    }

    /**
     * This method is calling from onBindColumnHeaderHolder on TableViewAdapter
     */
    public void setColumnBottom(@Nullable ColumnBottom columnBottom) {
        column_bottom_textview.setText(String.valueOf(columnBottom.getData()));

        // If your TableView should have auto resize for cells & columns.
        // Then you should consider the below lines. Otherwise, you can remove them.

        // It is necessary to remeasure itself.
        column_bottom_container.getLayoutParams().width = LinearLayout.LayoutParams.WRAP_CONTENT;
        column_bottom_textview.requestLayout();
    }
}
