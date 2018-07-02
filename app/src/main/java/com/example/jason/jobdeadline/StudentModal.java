package com.example.jason.jobdeadline;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class StudentModal {

    private Context context;
    private static StudentModal studentModal;
    private ArrayList<Student> arrayList;

    public StudentModal(Context context) {
        this.context = context;
        arrayList = new ArrayList<>();
        DabaseHelper helper = new DabaseHelper(context);
        Cursor  cursor = helper.getData();

        while (cursor.moveToNext()){
            Student student = new Student(cursor.getString(0),cursor.getString(1),cursor.getString(2));
            arrayList.add(student);
        }
    }

    public static StudentModal getStudentModal(Context context) {
        if(studentModal == null){
            studentModal = new StudentModal(context);
        }
        return studentModal;
    }

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }
}
