package adam.favoritescriptureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.content.Intent.EXTRA_TEXT;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText inBook = (EditText) findViewById(R.id.book);
        String book = inBook.getText().toString();

        EditText inChapter = (EditText) findViewById(R.id.chapter);
        String chapter = inChapter.getText().toString();

        EditText inVerse = (EditText) findViewById(R.id.verse);
        String verse = inVerse.getText().toString();

        String message = book + " " + chapter + ":" + verse;

        intent.putExtra("STRING_I_NEED", message);
        startActivity(intent);
    }
}
