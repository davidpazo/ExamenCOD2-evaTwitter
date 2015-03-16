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
 /**
     * Nos da nuestro timeLine
     */
    public void timeLine() {
        try {
            List<Status> statuses = twitter.getHomeTimeline();
            System.out.println("Showing home timeline.");
            for (Status status : statuses) {
                System.out.println(status.getUser().getName() + ":"
                        + status.getText());
            }
        } catch (TwitterException ex) {
            Logger.getLogger(MetodosTwitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 /**
     * Busca tweets con el texto introducido
     */
    public void buscar() {
        try {
            String preg = JOptionPane.showInputDialog("Buscar:");
            Query query = new Query(preg);
            QueryResult result = twitter.search(query);
            for (Status status : result.getTweets()) {
                System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }
        } catch (TwitterException ex) {
            Logger.getLogger(MetodosTwitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
   
   
}
