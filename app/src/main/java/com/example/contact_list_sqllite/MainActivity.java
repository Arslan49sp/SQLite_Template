package com.example.contact_list_sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.contact_list_sqllite.data.DatabaseHandler;
import com.example.contact_list_sqllite.model.Contacts;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);
        Contacts arslan = new Contacts();
        arslan.setName("Arslan");
        arslan.setPhoneNumber("12365488");

       // db.addContact(arslan);

        Contacts c = db.getContact(1);

        Log.d("chk", "onCreate: " + c.getName() + " " + c.getPhoneNumber());

        // updating contact
        c.setName("Arslan Majeed");
        c.setPhoneNumber("7625732");
        int updateId = db.updateContact(c);
        Log.d("chk", "contact updated at " + updateId);
        Log.d("chk", "total count =  " + db.getCount());

        List<Contacts> contactsList = db.getAllContacts();
        for(Contacts contact: contactsList){
            Log.d("chk", "onCreate: " + contact.getName());
        }
    }
}