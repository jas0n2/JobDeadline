package com.example.jason.jobdeadline;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<ViewHoldert> {

    private Context context;
    ArrayList<Student> arrayList;

    public RecycleAdapter(Context context) {
        this.context = context;
        arrayList = StudentModal.getStudentModal(context).getArrayList();
    }

    @Override
    public ViewHoldert onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_view,parent,false);
        return new ViewHoldert(view);
    }

    @Override
    public void onBindViewHolder(ViewHoldert holder, int position) {
    Student student = arrayList.get(position);
    holder.setView(student);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}


class ViewHoldert extends RecyclerView.ViewHolder{
TextView id;
TextView name;
    public ViewHoldert(View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.id);
        name = itemView.findViewById(R.id.name);

    }

    public void setView(Student student){
        id.setText(student.getId());
        name.setText(student.getName());
    }
}
