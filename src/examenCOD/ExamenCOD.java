package examenCOD;

/**
 *
 * @author dpazolopez
 */
import javax.swing.JOptionPane;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * ** @author dpazolopez ***
 */
public class ExamenCOD {

    public static void main(String[] args) throws TwitterException {
        // The factory instance is re-useable and thread safe.
        /*List<Status> statuses = twitter.getHomeTimeline();*/

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("9WKYJ6XIVJRVrJVcNIgs5GPFG")
                .setOAuthConsumerSecret("6UrWbAQORsDXOxP82BgTSuo23f2nQQEr228sFAK5AU0q79VP8o")
                .setOAuthAccessToken("2258833753-zZzwJ3egxm8TNsOHXfSp17m8GLPnftY2LimQgwu")
                .setOAuthAccessTokenSecret("VHvUE0RrLrgch9OjnUg8NwU117GciMG8gdZQ30LhBKzDb");
        Twitter twitter = new TwitterFactory(cb.build()).getInstance();
        //Status status = twitter.updateStatus("test");

        //Twitter twitter = TwitterFactory.getSingleton();
        String x = JOptionPane.showInputDialog("Busca:");
        Query query = new Query(x);
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());

        }
    }
}
