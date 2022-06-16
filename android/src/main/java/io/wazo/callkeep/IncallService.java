package io.wazo.callkeep;

import android.telecom.Call;
import android.telecom.InCallService;
import android.util.Log;

public class IncallService extends InCallService {
    @Override
    public void onCallAdded(Call call) {
        super.onCallAdded(call);
        Log.d("incallservice", "oncalladded called");
    }
}
