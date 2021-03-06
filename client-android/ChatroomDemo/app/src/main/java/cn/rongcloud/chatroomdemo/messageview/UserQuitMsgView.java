package cn.rongcloud.chatroomdemo.messageview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import cn.rongcloud.chatroomdemo.R;
import cn.rongcloud.chatroomdemo.utils.DataInterface;
import io.rong.imlib.model.MessageContent;

/**
 * Created by duanliuyi on 2018/5/24.
 */

public class UserQuitMsgView extends BaseMsgView {


    private TextView username;
    private TextView msgText;

    public UserQuitMsgView(Context context) {
        super(context);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.msg_text_view, this);
        username = (TextView) view.findViewById(R.id.username);
        msgText = (TextView) view.findViewById(R.id.msg_text);

    }


    @Override
    protected void onBindContent(MessageContent msgContent, String senderUserId) {
        String name = getSendUserName();
        username.setText(name + "  ");
        msgText.setText("离开了直播间");

    }

}
