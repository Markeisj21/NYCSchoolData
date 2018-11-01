package com.markeisjones.nycschooldata.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.request.RequestOptions;
import com.markeisjones.nycschooldata.model.SchoolSATScores;

import com.markeisjones.nycschooldata.R;

import java.util.List;

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.MyViewHolder>  {

    private Context mContext;
    private List<SchoolSATScores> mScoreData;


    public RecylerViewAdapter(Context mContext, List<SchoolSATScores> mScoreData) {
        this.mContext = mContext;
        this.mScoreData = mScoreData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.school_sat_row_item,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_dbn.setText(mScoreData.get(position).getDbn());
        holder.tv_num_of_sat_test_takers.setText(mScoreData.get(position).getNum_of_sat_test_takers());
        holder.tv_sat_critical_reading_avg_score.setText(mScoreData.get(position).getSat_critical_reading_avg_score());
        holder.tv_sat_math_avg_score.setText(mScoreData.get(position).getSat_math_avg_score());
        holder.tv_sat_writing_avg_score.setText(mScoreData.get(position).getSat_writing_avg_score());
        holder.tv_school_name.setText(mScoreData.get(position).getSchool_name());

    }

    @Override
    public int getItemCount() {
        return mScoreData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView  tv_dbn ;
        TextView tv_num_of_sat_test_takers;
        TextView tv_sat_critical_reading_avg_score ;
        TextView tv_sat_math_avg_score;
        TextView tv_sat_writing_avg_score;
        TextView tv_school_name;





        public MyViewHolder(View itemView) {
            super(itemView);

            tv_dbn= itemView.findViewById(R.id.dbn_tv);
            tv_num_of_sat_test_takers= itemView.findViewById(R.id.num_of_testers_TV);
            tv_sat_critical_reading_avg_score= itemView.findViewById(R.id.sat_reading_avg_TV);
            tv_sat_math_avg_score= itemView.findViewById(R.id.sat_math_score_TV);
            tv_sat_writing_avg_score= itemView.findViewById(R.id.sat_writing_avg_TV);
            tv_school_name= itemView.findViewById(R.id.school_name_TV);

        }
    }
}
