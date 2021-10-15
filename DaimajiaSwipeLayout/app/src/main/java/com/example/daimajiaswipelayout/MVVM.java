package com.example.daimajiaswipelayout;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MVVM extends ViewModel
{
    ArrayList<FaceBook> faceBookArrayList=new ArrayList<>();
    MutableLiveData<ArrayList<FaceBook>> mutableLiveData=new MutableLiveData<>();
    void GetData(){
        faceBookArrayList.add(new FaceBook("FaceBook_1","Twitter_1"));
        faceBookArrayList.add(new FaceBook("FaceBook_2","Twitter_2"));
        faceBookArrayList.add(new FaceBook("FaceBook_3","Twitter_3"));
        faceBookArrayList.add(new FaceBook("FaceBook_4","Twitter_4"));
        faceBookArrayList.add(new FaceBook("FaceBook_5","Twitter_5"));
        faceBookArrayList.add(new FaceBook("FaceBook_6","Twitter_6"));
        faceBookArrayList.add(new FaceBook("FaceBook_7","Twitter_7"));
        faceBookArrayList.add(new FaceBook("FaceBook_8","Twitter_8"));
        faceBookArrayList.add(new FaceBook("FaceBook_9","Twitter_9"));
        faceBookArrayList.add(new FaceBook("FaceBook_10","Twitter_10"));
        faceBookArrayList.add(new FaceBook("FaceBook_11","Twitter_11"));
        faceBookArrayList.add(new FaceBook("FaceBook_12","Twitter_12"));
        faceBookArrayList.add(new FaceBook("FaceBook_13","Twitter_13"));
        faceBookArrayList.add(new FaceBook("FaceBook_14","Twitter_14"));
        faceBookArrayList.add(new FaceBook("FaceBook_15","Twitter_15"));

        mutableLiveData.setValue(faceBookArrayList);
    }

}
