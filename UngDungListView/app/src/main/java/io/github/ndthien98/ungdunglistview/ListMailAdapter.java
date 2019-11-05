package io.github.ndthien98.ungdunglistview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListMailAdapter extends BaseAdapter {
    ArrayList<MainActivity.Email> data;
    Context context;
    int count;

    ListMailAdapter(ArrayList input, Context context) {
        data = input;
        this.context = context;
        count = 0;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        ViewHolder tag = new ViewHolder();
        if (convertView != null) {
            tag = (ViewHolder) convertView.getTag();
        } else {
            convertView = View.inflate(context, R.layout.item_list_mail, null);

            tag.avatar = convertView.findViewById(R.id.avatar);
            tag.sender = convertView.findViewById(R.id.sender);
            tag.title = convertView.findViewById(R.id.title);
            tag.content = convertView.findViewById(R.id.content);
            tag.star = convertView.findViewById(R.id.star);

            convertView.setTag(tag);
        }

        tag.sender.setText(data.get(i).sender);
        tag.title.setText(data.get(i).title);
        tag.content.setText(data.get(i).content);
        if (!data.get(i).check)
            tag.avatar.setImageResource(data.get(i).avatar);
        else tag.avatar.setImageResource(R.drawable.checkbox);


        if (data.get(i).star) {
            tag.star.setImageResource(R.drawable.star_on);
        } else {
            tag.star.setImageResource(R.drawable.star_off);
        }
        tag.star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.get(i).star = !data.get(i).star;
                notifyDataSetChanged();
                Log.d("ADAPTER", "star" + data.get(i).star);
            }
        });
        tag.avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.get(i).check = !data.get(i).check;
                count += data.get(i).check ? 1 : -1;
                notifyDataSetChanged();
                if (count != 0) {
                    TextView txtView = ((MainActivity) context).findViewById(R.id.main_title);
                    txtView.setText("Da chon " + count);
                } else {
                    TextView txtView = ((MainActivity) context).findViewById(R.id.main_title);
                    txtView.setText("Danh sach email");
                }
                Log.d("ADAPTER", "check" + data.get(i).check);
            }
        });
        return convertView;
    }

    class ViewHolder {
        ImageButton avatar;
        TextView sender;
        TextView title;
        TextView content;
        ImageButton star;
    }
}
