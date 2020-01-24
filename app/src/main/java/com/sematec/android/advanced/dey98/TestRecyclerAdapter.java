package com.sematec.android.advanced.dey98;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.TestViewHolder> {

    private List<String> names;
    private TestRecyclerClickListener listener;

    public TestRecyclerAdapter(List<String> names, TestRecyclerClickListener listener) {
        this.names = names;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new TestViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        holder.onBind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;

        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(names.get(getAdapterPosition()));
                }
            });
        }

        public void onBind(String name) {
            txtName.setText(name);
        }
    }
}
