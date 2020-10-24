package com.example.cal;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_point; //⼩数点
    Button btn_clear; //清除
    Button btn_del; //删除
    Button btn_plus;
    Button btn_minus;
    Button btn_multiply;
    Button btn_divide;
    Button btn_equal;
    Button btn_left;
    Button btn_right;
    private TextView et_input;
    private StringBuilder pending = new StringBuilder();

    private void initView() {
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_point = findViewById(R.id.btn_point);
        btn_clear = findViewById(R.id.btn_clear);
        btn_del = findViewById(R.id.btn_del);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_equal = findViewById(R.id.btn_equal);
        et_input = findViewById(R.id.et_input);
        btn_left = findViewById(R.id.btn_left);
        btn_right = findViewById(R.id.btn_right);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_left.setOnClickListener(this);
        btn_right.setOnClickListener(this);
        adjustButtonView(btn_left);
        adjustButtonView(btn_0);
        adjustButtonView(btn_right);
        adjustButtonView(btn_equal);
        adjustButtonView(btn_1);
        adjustButtonView(btn_2);
        adjustButtonView(btn_3);
        adjustButtonView(btn_point);
        adjustButtonView(btn_4);
        adjustButtonView(btn_5);
        adjustButtonView(btn_6);
        adjustButtonView(btn_minus);
        adjustButtonView(btn_7);
        adjustButtonView(btn_8);
        adjustButtonView(btn_9);
        adjustButtonView(btn_plus);
        adjustButtonView(btn_clear);
        adjustButtonView(btn_divide);
        adjustButtonView(btn_multiply);
        adjustButtonView(btn_del);
        LinearLayout ll1 = findViewById(R.id.le_1);
        LinearLayout ll2 = findViewById(R.id.le_2);
        LinearLayout ll3 = findViewById(R.id.le_3);
        LinearLayout ll4 = findViewById(R.id.le_4);
        LinearLayout ll5 = findViewById(R.id.le_5);
        adjustView(ll1);
        adjustView(ll2);
        adjustView(ll3);
        adjustView(ll4);
        adjustView(ll5);
// adjustView(et_input);
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = rect.height();
        int width = rect.width();
        int h = height - width * 5 / 4;
        LinearLayout ll_et = findViewById(R.id.ll_et);
        ViewGroup.LayoutParams layoutParams = ll_et.getLayoutParams();
        layoutParams.height = h - 60;
        ll_et.setLayoutParams(layoutParams);
    }

    /**
     *
     */
    private void adjustButtonView(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(10, 10, 10, 10);
        view.setLayoutParams(layoutParams);
    }

    private void adjustView(View view) {
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int width = rect.width();
        lp.height = width / 4;
        view.setLayoutParams(lp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        pending.append(0);
        et_input.setText(pending.toString());
        //添加
        et_input.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public void onClick(View v) {
        int last = 0;
        if (pending.length() != 0) {
            last = pending.codePointAt(pending.length() - 1);
        }
        switch (v.getId()) {
            case R.id.btn_0:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("0");
                    et_input.setText(pending);
                    break;
                }
                if(judge0()){

                }
                    else {
                    pending = pending.append("0");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_1:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("1");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("1");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_2:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("2");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("2");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_3:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("3");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("3");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_4:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("4");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("4");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_5:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("5");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("5");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_6:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("6");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("6");
                    et_input.setText(pending);
                    //

                    break;
                }
            case R.id.btn_7:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("7");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("7");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_8:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("8");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("8");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_9:
                if ((pending.length() == 1 && pending.charAt(0) == '0')) {
                    pending.delete(0, 1);
                    pending = pending.append("9");
                    et_input.setText(pending);
                    break;
                } else {
                    pending = pending.append("9");
                    et_input.setText(pending);
                    break;
                }
            case R.id.btn_plus:
                if (judge1()) {
                    pending = pending.append("+");
                    et_input.setText(pending);
                    break;
                } else {
                    warn();
                    break;
                }
            case R.id.btn_minus:
                if (judge1()) {
                    pending = pending.append("-");
                    et_input.setText(pending);
                    break;
                } else {
                    warn();
                    break;
                }
            case R.id.btn_multiply:
// if (last >= '0' && last <= '9' ) {
                if (judge1()) {
                    pending = pending.append("*");
                    et_input.setText(pending);
                    break;
                } else {
                    warn();
                    break;
                }

            case R.id.btn_divide:
// if (last >= '0' && last <= '9' ) {
                if (judge1()) {
                    pending = pending.append("÷");
                    et_input.setText(pending);
                    break;
                } else {
                    warn();
                    break;
                }

            case R.id.btn_point:
                if (judge1()&&judge_point()) {
                    Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                    pending = pending.append(".");
                    et_input.setText(pending);
                    break;
                } else {
//                    Toast toast = new Toast((getApplicationContext()));
////                    LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
////                    View view = inflater.inflate(R.layout.layout_toast, null);
////                    ImageView imageView = view.findViewById(R.id.iv_toast);
////                    TextView textView = view.findViewById(R.id.tv_toast);
////                    imageView.setImageResource(R.drawable.ic_error1);
////                    textView.setText("错误输⼊，请重新输⼊");
////                    toast.setView(view);
////                    toast.setDuration(Toast.LENGTH_LONG);
////                    toast.show();
                    warn();
                    break;
                }
            case R.id.btn_right:// )右括号
                if ((last >= '0' && last <= '9' || last == ')') && judje2() == 1) {
                    pending = pending.append(")");
                    et_input.setText(pending);
                    break;
                } else {
                    warn();
                    break;
                }
            case R.id.btn_left:// （左括号
                if ((last != '(') || (last <= '0' && last >= '9')) {
                    pending = pending.append("(");
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_del: //删除
                if (pending.length() != 0) {
                    pending = pending.delete(pending.length() - 1, pending.length());
                    et_input.setText(pending);
                }
                break;
            case R.id.btn_clear: //清空
                pending = pending.delete(0, pending.length());
                pending.append(0);
                et_input.setText(pending.toString());
                break;
            case R.id.btn_equal: // =等于
                if (!judge1()) {
                    pending.delete(pending.length() - 1, pending.length());
                }
                if ((pending.length() > 1)) {
                    InfixInToDuffix inf = new InfixInToDuffix();
                    String jieguo;
                    try {
                        String b = inf.toSuffix(pending);
                        jieguo = inf.dealEquation(b);
                    } catch (Exception ex) {
                        jieguo = "出错";
                    }
                    et_input.setText(pending + "=" + jieguo);
                    pending = pending.delete(0, pending.length());
                    if (Character.isDigit(jieguo.charAt(0))) {
                        pending = pending.append(jieguo);
                    }
                }
                break;
            default:
                break;
        }
    }

    private void warn() {
        Toast toast = new Toast((getApplicationContext()));
        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        View view = inflater.inflate(R.layout.layout_toast, null);
        ImageView imageView = view.findViewById(R.id.iv_toast);
        TextView textView = view.findViewById(R.id.tv_toast);
        imageView.setImageResource(R.drawable.ic_error1);
        textView.setText("错误输⼊，请重新输⼊!");
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
    private  boolean judge_point(){
        int l1=0,l2=0,n=pending.length();
        char t = pending.charAt(n-1);
        for (int i=n-1;i>=0;i--){
            t=pending.charAt(i);
            if(t=='.'){
                l1++;
                break;
            }
            if (t == '+' || t == '-' || t == '÷' || t == '*'){
                l2++;
                break;
            }
        }
        if((l1==0&&l2==1)||(l1==0&&l2==0)){
            return  true;
        }
        else
            return false;
    }

    private boolean judge1() {
        char t = pending.charAt(pending.length() - 1);
        if (t == '+' || t == '-' || t == '÷' || t == '*' || t == '.') {
            return false;
        } else
            return true;
    }
    private boolean judge0() {
        char t = pending.charAt(pending.length() - 1);
        if ( t == '÷' ) {
            return false;
        } else
            return true;
    }

    private int judje2() {
        int a = 0, b = 0;
        for (int i = 0; i < pending.length(); i++) {
            if (pending.charAt(i) == '(') {
                a++;
            }
            if (pending.charAt(i) == ')') {
                b++;
            }
        }
        if (a == b)
            return 0;
        if (a > b)
            return 1;
        return 2;
    }
}