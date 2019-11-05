package io.github.ndthien98.ungdunglistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewMails;
    ArrayList<Email> listMailData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMailData = new ArrayList();
        listMailData.add(new Email(
                R.drawable.ava0, "Nguyen Duc Thien", "Xin Chao", "Cho minh lwen"
        ));
        listMailData.add(new Email(
                R.drawable.ava0, "Nguyen Duc Thien", "Xin Chao", "Cho minh lwen"
        ));
        listMailData.add(new Email(
                R.drawable.ava0, "Nguyen Duc Thien", "Xin Chao", "Cho minh lwen"
        ));
        listMailData.add(new Email(
                R.drawable.ava0, "Nguyen Duc Thien", "Xin Chao", "Cho minh lwen"
        ));
        listMailData.add(new Email(
                R.drawable.ava0, "Nguyen Duc Thien", "Xin Chao", "Cho minh lwen"
        ));
        listMailData.add(new Email(
                R.drawable.ava0, "Nguyen Duc Thien", "Xin Chao", "Cho minh lwen"
        ));
        listMailData.add(new Email(
                R.drawable.ava1, "Le Duc Thang", "Xin Chao", "Cho minh lwen"
        ));
        listMailData.add(new Email(
                R.drawable.ava2, "Ho Nguyen Ten Dien", "Hihihi", "Do m biet t la ai"
        ));
        listMailData.add(new Email(
                R.drawable.ava3, "Ten Dai vclvlcvlasdasdasd á dá đá á dá dâ sda sda sd áclvlcvlclvc", "title dai fash; a dá asd á dá dá áiuearkjsadfk jasdfhsahfdoash fosahdfahsdfhas hfksa hfdksahfdksahfk hkdhsfkahsdkfhakdsfhakjsdhfasd fasdf fdk jahdfahsd f Casdf hao", "Clkhaelrviabskdjbfa  sa fasd fkjsadflasfasldsakj  fsdkjsafahskshkhsfkashfkahslfk"
        ));
        listMailData.add(new Email(
                R.drawable.ava4, "sender", "title", "content"
        ));

        listViewMails = findViewById(R.id.listMails);

        ListMailAdapter myAdapter = new ListMailAdapter(listMailData, MainActivity.this);
        listViewMails.setAdapter(myAdapter);
        
    }

    public class Email {
        boolean check;
        int avatar;
        String sender;
        String title;
        String content;
        boolean star = false;

        public Email(int avatar, String sender, String title, String content) {
            this.avatar = avatar;
            this.sender = sender;
            this.title = title;
            this.content = content;
            star = false;
            check = false;
        }
    }
    public void remakeTitle(String title){
        TextView tx = findViewById(R.id.main_title);
        tx.setText(title);
    }
}
