package com.example.recyleview;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptar extends RecyclerView.Adapter<MyAdaptar.MyViewHolder> {

    Context context;
    ArrayList<User> userArrayList;

    public MyAdaptar(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }




    @NonNull
    @Override
    public MyAdaptar.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_items,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptar.MyViewHolder holder, int position) {

        User user = userArrayList.get(position);
//         Age,Blood_Group,Email,Location,Name,Phone


        holder.Age.setText(user.Age);
        holder.Blood_Group.setText(user.Blood_Group);
        holder.Location.setText(user.Location);
        holder.Email.setText(user.Email);
        holder.Name.setText(user.Name);
        holder.Phone.setText(user.Phone);





    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Age,Blood_Group,Email,Location,Name,Phone;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Age = itemView.findViewById(R.id.age);
            Blood_Group = itemView.findViewById(R.id.blood_group);
            Email = itemView.findViewById(R.id.email);
            Location = itemView.findViewById(R.id.location);
            Name = itemView.findViewById(R.id.name);
            Phone = itemView.findViewById(R.id.phone);




        }
    }


}
