package com.example.daimajiaswipelayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.adapters.RecyclerSwipeAdapter;
import com.example.daimajiaswipelayout.databinding.RowItemBinding;

import java.util.ArrayList;

public class DaimjiaAdapter extends RecyclerSwipeAdapter<DaimjiaAdapter.DaimjiaHolder> {

    private ArrayList<FaceBook> faceBooks=new ArrayList<>();
    private Context context;
    public DaimjiaAdapter(ArrayList<FaceBook> faceBooks, Context context) {
        this.faceBooks = faceBooks;
        this.context = context;
    }
    @NonNull
    @Override
    public DaimjiaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowItemBinding view=  DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.row_item, parent, false);
        return  new DaimjiaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DaimjiaHolder holder, int position) {
       holder.binding.TwiterButton.setText(faceBooks.get(position).getTwitter_Name());
       holder.binding.FaceBookButton.setText(faceBooks.get(position).getFacebook_Name());
       holder.binding.FaceBookButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(context, faceBooks.get(position).getFacebook_Name(), Toast.LENGTH_SHORT).show();
           }
       });
       holder.binding.TwiterButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(context, faceBooks.get(position).getTwitter_Name(), Toast.LENGTH_SHORT).show();
           }
       });
       holder.binding.edit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(context, "Edit Successfully", Toast.LENGTH_SHORT).show();
           }
       });
       holder.binding.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Shared Successfully", Toast.LENGTH_SHORT).show();
            }
        });
       holder.binding.deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Deleted Successfully", Toast.LENGTH_SHORT).show();
            }
        });
       holder.binding.btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Location Went Successfully", Toast.LENGTH_SHORT).show();
            }
        });

       holder.binding.swipeItem.setShowMode(SwipeLayout.ShowMode.PullOut);
       holder.binding.swipeItem.addDrag(SwipeLayout.DragEdge.Left, holder.binding.leftWrapper);
       holder.binding.swipeItem.addDrag(SwipeLayout.DragEdge.Right, holder.binding.rightWrapper);
     //mItemManger.bindView(holder.itemView, position);

    }

    @Override
    public int getItemCount() {
        return faceBooks.size();
    }

    @Override
    public int getSwipeLayoutResourceId(int position) {
        return R.id.swipe_item;
    }

    class DaimjiaHolder extends RecyclerView.ViewHolder {
        RowItemBinding binding;
        public DaimjiaHolder(RowItemBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }

    }
}
