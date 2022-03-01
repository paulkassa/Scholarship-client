package com.example.myscholarshipclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ScholarshipAdapter extends RecyclerView.Adapter<ScholarshipAdapter.ViewHolder> {
    Context context;
    List<ScholarshipModel> scholarshipModelList;

    public ScholarshipAdapter(Context context, List<ScholarshipModel> scholarshipModelList) {
        this.context = context;
        this.scholarshipModelList = scholarshipModelList;
    }

    @NonNull
    @NotNull
    @Override
    public ScholarshipAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        //Binding the Row design
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ScholarshipAdapter.ViewHolder holder, int position) {
    ScholarshipModel scholarshipModel = scholarshipModelList.get(position);
        holder.tvcontinent.setText("Continent:\t"+scholarshipModel.getContinent());
        holder.tvcountry.setText("Country:\t"+scholarshipModel.getCountryName());
        holder.tvdeadline.setText("Dead Line:\t"+scholarshipModel.getDeadline());
        holder.tvlink.setText("Link:\t"+scholarshipModel.getLink());
        holder.tvorganization.setText("Organization:\t"+scholarshipModel.getOrganization());
        holder.tvprogram.setText("Program:\t"+scholarshipModel.getProgram());
        String imageUri = null;
        imageUri = scholarshipModel.getImage();
        Picasso.get().load(imageUri).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return scholarshipModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvcontinent, tvcountry,tvdeadline,tvlink,tvorganization,tvprogram;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            tvcontinent = itemView.findViewById(R.id.continent);
            tvcountry = itemView.findViewById(R.id.country);
            tvdeadline = itemView.findViewById(R.id.deadline);
            tvlink = itemView.findViewById(R.id.link);
            tvorganization = itemView.findViewById(R.id.organization);
            tvprogram = itemView.findViewById(R.id.program);

        }
    }
}
