package kidvan777.herome.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import kidvan777.herome.Fragments.MainFragment;
import kidvan777.herome.Fragments.PickPowerFragment;
import kidvan777.herome.R;

public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener
,PickPowerFragment.PickPowerInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment);
            transaction.commit();
        }
    }
    public void loadPickPowerScreen(){
        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,pickPowerFragment)
        .addToBackStack(null).commit();
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerFragmentInteraction(Uri uri){

    }
}
