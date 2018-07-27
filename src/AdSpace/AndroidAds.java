package AdSpace;

//import com.google.android.gms.ads.MobileAds;

//import javafxports.android.FXActivity;

//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdSize;
//import com.google.android.gms.ads.AdView;

public class AndroidAds {
	public AndroidAds() {
		/*
		FXActivity.getInstance().runOnUiThread(() -> {
			LinearLayout layout = new LinearLayout(FXActivity.getInstance());
			layout.setVerticalGravity(Gravity.BOTTOM);
			layout.setOrientation(LinearLayout.VERTICAL);

			AdView adView = new AdView(FXActivity.getInstance());
			adView.setAdSize(AdSize.SMART_BANNER);
			adView.setAdUnitId("ca-app-pub-XXXXXXXXXXXXXXXXXXXX");

			AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
					.addTestDevice("XXXXXXXXXXXXXXXXXXXX").build();
			adView.loadAd(adRequest);
			adView.setAdListener(new AdListener() {
				@Override
				public void onAdLoaded() {
					super.onAdLoaded();
					System.out.println("AD loaded");
				}
			});

			layout.addView(adView);

			FXActivity.getViewGroup().addView(layout);
		});
	*/
	}
	
}