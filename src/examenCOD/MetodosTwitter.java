package examenCOD;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author dpazolopez
 */
public class MetodosTwitter {

    ConfigurationBuilder cb = new ConfigurationBuilder();
    Twitter twitter;

    /**
     * Constructor, da acceso a nuestra cuenta en twitter.
     */
    public MetodosTwitter() {
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("kVeUkuBbS7E4m2BzzqKTCa00t")
                .setOAuthConsumerSecret("znSSjhVZhkjBBsNy9C7YSgclTO14eFFz0FXYBlCGxb0bKn3hXC")
                .setOAuthAccessToken("180784730-3sKIMf2JHiL0DnzDoGQ0Lzn2ES4xFo5bTOTIrVtv")
                .setOAuthAccessTokenSecret("kTXQAcbRbzBPi6pjttzgxEU9AhH6USs5uaX8qm1JxuD6S");
        twitter = new TwitterFactory(cb.build()).getInstance();
    }

   
}
