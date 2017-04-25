package laiche.beevorwhite.uk.co.laiche;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebPage(View view) {
        Uri webpage = Uri.parse("http://www.beevorwhite.co.uk/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void composeEmail(View view) {
        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.setData(Uri.parse("mailto:hello@beevorwhite.co.uk"));
        email.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email));
        if (email.resolveActivity(getPackageManager()) != null) {
            startActivity(email);
        }
    }
}



