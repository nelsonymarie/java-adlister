import java.util.ArrayList;
import java.util.List;

public class ListAdsDao {
    private static final List<Ad> ads = new ArrayList<>();

    public static void addAd(Ad ad) {
        ads.add(ad);
    }

    public static List<Ad> all() {
        return new ArrayList<>(ads);
    }
}
